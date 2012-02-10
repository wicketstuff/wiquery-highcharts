package nl.topicus.whighstock.components;

import java.io.IOException;
import java.util.Collection;

import nl.topicus.whighcharts.options.axis.IWHighChartAxisCategoriesProvider;
import nl.topicus.whighcharts.options.axis.WHighChartAxisOptions;
import nl.topicus.whighcharts.options.series.ISeries;
import nl.topicus.whighcharts.options.series.ISeriesEntry;
import nl.topicus.whighstock.options.WHighStockOptions;

import org.apache.wicket.Application;
import org.apache.wicket.RuntimeConfigurationType;
import org.apache.wicket.markup.html.IHeaderResponse;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.odlabs.wiquery.core.IWiQueryPlugin;
import org.odlabs.wiquery.core.javascript.JsStatement;

/**
 * 
 * @author remcozigterman
 * 
 */
public class WHighStock extends WebMarkupContainer implements IWiQueryPlugin
{
	private static final long serialVersionUID = 1L;

	private WHighStockOptions options = new WHighStockOptions(this);

	public WHighStock(String id)
	{
		this(id, null);
	}

	public WHighStock(String id,
			IModel< ? extends Collection< ? extends ISeries< ? , ISeriesEntry< ? >>>> model)
	{
		super(id, model);
		setOutputMarkupId(true);
	}

	public WHighStockOptions getOptions()
	{
		return options;
	}

	@Override
	public void renderHead(IHeaderResponse response)
	{
		response.renderJavaScriptReference(WHighStockJavaScriptResourceReference.get());
		// response.renderJavaScriptReference(WHighStockExtraJavaScriptResourceReference.get());

		// if (getOptions().getExporting().getEnabled() != null
		// && getOptions().getExporting().getEnabled().booleanValue())
		// response
		// .renderJavaScriptReference(WHighStockExportingJavaScriptResourceReference.get());
	}

	@Override
	public JsStatement statement()
	{
		ObjectMapper mapper = new ObjectMapper();
		mapper.getSerializationConfig().setSerializationInclusion(Inclusion.NON_NULL);
		mapper.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, false);

		if (Application.exists()
			&& RuntimeConfigurationType.DEVELOPMENT
				.equals(Application.get().getConfigurationType()))
			mapper.configure(SerializationConfig.Feature.INDENT_OUTPUT, true);

		String optionsStr = "{}";
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

					for (WHighChartAxisOptions xAxis : getOptions().getxAxis())
					{
						if (xAxis.getCategories() == null || xAxis.getCategories().isEmpty())
						{
							xAxis.setCategories(categoriesProvider.getxAxisCategories());
						}
					}

					for (WHighChartAxisOptions yAxis : getOptions().getyAxis())
					{
						if (yAxis.getCategories() == null || yAxis.getCategories().isEmpty())
						{
							yAxis.setCategories(categoriesProvider.getyAxisCategories());
						}
					}
				}
			}

			optionsStr = mapper.writeValueAsString(options);
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

		JsStatement jsStatement =
			new JsStatement().append("var " + getMarkupId() + " = new Highcharts.StockChart( "
				+ optionsStr + " );\n");

		return jsStatement;
	}

	@SuppressWarnings("unchecked")
	public IModel< ? extends Collection< ? extends ISeries< ? , ISeriesEntry< ? >>>> getModel()
	{
		return (IModel< ? extends Collection< ? extends ISeries< ? , ISeriesEntry< ? >>>>) getDefaultModel();
	}
}
