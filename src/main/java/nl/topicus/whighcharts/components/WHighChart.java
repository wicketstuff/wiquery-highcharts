package nl.topicus.whighcharts.components;

import java.io.IOException;

import nl.topicus.whighcharts.components.modules.WHighChartsExportingJavaScriptResourceReference;
import nl.topicus.whighcharts.options.WHighChartOptions;
import nl.topicus.whighcharts.options.series.ISeriesEntry;

import org.apache.wicket.Application;
import org.apache.wicket.RuntimeConfigurationType;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.odlabs.wiquery.core.commons.IWiQueryPlugin;
import org.odlabs.wiquery.core.commons.WiQueryResourceManager;
import org.odlabs.wiquery.core.javascript.JsStatement;

public class WHighChart<V, E extends ISeriesEntry<V>> extends WebMarkupContainer implements
		IWiQueryPlugin
{
	private static final long serialVersionUID = 1L;

	private WHighChartOptions<V, E> options = new WHighChartOptions<V, E>(this);

	public WHighChart(String id)
	{
		super(id);
		setOutputMarkupId(true);
	}

	public WHighChartOptions<V, E> getOptions()
	{
		return options;
	}

	@Override
	public void contribute(WiQueryResourceManager wiQueryResourceManager)
	{
		wiQueryResourceManager.addJavaScriptResource(WHighChartsJavaScriptResourceReference.get());
		wiQueryResourceManager.addJavaScriptResource(WHighChartsExtraJavaScriptResourceReference
			.get());

		if (getOptions().getExporting().getEnabled() != null
			&& getOptions().getExporting().getEnabled().booleanValue())
			wiQueryResourceManager
				.addJavaScriptResource(WHighChartsExportingJavaScriptResourceReference.get());
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
			new JsStatement().append("var " + getMarkupId() + " = new Highcharts.Chart( "
				+ optionsStr + " );\n");

		return jsStatement;
	}
}
