package nl.topicus.whighcharts.components;

import java.io.IOException;
import java.util.Collection;

import org.apache.wicket.Application;
import org.apache.wicket.RuntimeConfigurationType;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;
import org.odlabs.wiquery.core.javascript.JsStatement;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import nl.topicus.whighcharts.components.modules.WHighChartsExportingJavaScriptResourceReference;
import nl.topicus.whighcharts.options.WHighChartGlobalSettings;
import nl.topicus.whighcharts.options.WHighChartOptions;
import nl.topicus.whighcharts.options.axis.IWHighChartAxisCategoriesProvider;
import nl.topicus.whighcharts.options.series.ISeries;
import nl.topicus.whighcharts.options.series.ISeriesEntry;

public class WHighChart<V, E extends ISeriesEntry<V>> extends WebMarkupContainer
{
	private static final long serialVersionUID = 1L;

	private WHighChartOptions<V, E> options = new WHighChartOptions<V, E>(this);

	private WHighChartGlobalSettings globalSettings = new WHighChartGlobalSettings();

	public WHighChart(String id)
	{
		this(id, null);
	}

	public WHighChart(String id, IModel< ? extends Collection< ? extends ISeries<V, E>>> model)
	{
		super(id, model);
		setOutputMarkupId(true);
	}

	public WHighChartOptions<V, E> getOptions()
	{
		return options;
	}

	public WHighChartGlobalSettings getGlobalSettings()
	{
		return globalSettings;
	}

	@Override
	public void renderHead(IHeaderResponse response)
	{
		response.render(
			JavaScriptHeaderItem.forReference(WHighChartsJavaScriptResourceReference.get()));
		response.render(
			JavaScriptHeaderItem.forReference(WHighChartsExtraJavaScriptResourceReference.get()));
		response.render(JavaScriptHeaderItem
			.forReference(WHighChartsDefaultsJavaScriptResourceReference.get()));

		if (getOptions().getExporting().getEnabled() != null
			&& getOptions().getExporting().getEnabled().booleanValue())
			response.render(JavaScriptHeaderItem
				.forReference(WHighChartsExportingJavaScriptResourceReference.get()));
		response.render(JavaScriptHeaderItem.forScript("var " + getMarkupId() + ";",
			"highchart_" + getMarkupId()));
		response.render(OnDomReadyHeaderItem.forScript(statement().render().toString()));
	}

	public JsStatement statement()
	{
		ObjectMapper mapper = new ObjectMapper();
		mapper.getSerializationConfig().withSerializationInclusion(Include.NON_NULL);
		mapper.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, false);

		if (Application.exists() && RuntimeConfigurationType.DEVELOPMENT
			.equals(Application.get().getConfigurationType()))
			mapper.configure(SerializationFeature.INDENT_OUTPUT, true);

		String optionsStr = "{}";
		String globalOptions = "{}";

		try
		{
			if (getModel() != null)
			{
				getOptions().getSeries().clear();
				getOptions().getSeries().addAll(getModel().getObject());

				if (getModel() instanceof IWHighChartAxisCategoriesProvider)
				{
					IWHighChartAxisCategoriesProvider categoriesProvider =
						(IWHighChartAxisCategoriesProvider) getModel();

					if (getOptions().getxAxis().getCategories() == null
						|| getOptions().getxAxis().getCategories().isEmpty())
					{
						getOptions().getxAxis()
							.setCategories(categoriesProvider.getxAxisCategories());
					}

					if (getOptions().getyAxis().getCategories() == null
						|| getOptions().getyAxis().getCategories().isEmpty())
					{
						getOptions().getyAxis()
							.setCategories(categoriesProvider.getyAxisCategories());
					}
				}
			}

			optionsStr = mapper.writeValueAsString(options);
			globalOptions =
				"Highcharts.setOptions(" + mapper.writeValueAsString(getGlobalSettings()) + ");\n";
		}
		catch (JsonGenerationException e)
		{
			e.printStackTrace();
		}
		catch (JsonMappingException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		JsStatement jsStatement = new JsStatement().append(
			globalOptions + getMarkupId() + " = new Highcharts.Chart( " + optionsStr + " );\n");

		return jsStatement;
	}

	@SuppressWarnings("unchecked")
	public IModel< ? extends Collection< ? extends ISeries<V, E>>> getModel()
	{
		return (IModel< ? extends Collection< ? extends ISeries<V, E>>>) getDefaultModel();
	}
}
