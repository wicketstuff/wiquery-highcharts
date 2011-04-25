package nl.topicus.whighcharts.components;

import java.io.IOException;

import nl.topicus.whighcharts.data.SeriesEntry;
import nl.topicus.whighcharts.options.WHighChartOptions;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.odlabs.wiquery.core.commons.IWiQueryPlugin;
import org.odlabs.wiquery.core.commons.WiQueryResourceManager;
import org.odlabs.wiquery.core.javascript.JsStatement;

public class WHighChart<K, V, E extends SeriesEntry<K, V>> extends WebMarkupContainer implements
		IWiQueryPlugin
{
	private static final long serialVersionUID = 1L;

	private WHighChartOptions<K, V, E> options = new WHighChartOptions<K, V, E>(this);

	public WHighChart(String id)
	{
		super(id);
		setOutputMarkupId(true);
	}

	public WHighChartOptions<K, V, E> getOptions()
	{
		return options;
	}

	@Override
	public void contribute(WiQueryResourceManager wiQueryResourceManager)
	{
		wiQueryResourceManager.addJavaScriptResource(WHighChartsJavaScriptResourceReference.get());
	}

	@Override
	public JsStatement statement()
	{
		ObjectMapper mapper = new ObjectMapper();
		mapper.getSerializationConfig().setSerializationInclusion(Inclusion.NON_NULL);
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
