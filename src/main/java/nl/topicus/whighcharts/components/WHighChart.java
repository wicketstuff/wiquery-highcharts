package nl.topicus.whighcharts.components;

import java.io.IOException;
import java.util.Collection;

import nl.topicus.whighcharts.data.Series;
import nl.topicus.whighcharts.options.WHighChartOptions;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.odlabs.wiquery.core.commons.IWiQueryPlugin;
import org.odlabs.wiquery.core.commons.WiQueryResourceManager;
import org.odlabs.wiquery.core.javascript.JsStatement;

public class WHighChart extends WebMarkupContainer implements IWiQueryPlugin
{
	private static final long serialVersionUID = 1L;

	private WHighChartOptions options = new WHighChartOptions(this);

	public WHighChart(String id,
			IModel< ? extends Collection< ? extends Series< ? , ? , ? >>> model)
	{
		super(id, model);
		setOutputMarkupId(true);
	}

	public WHighChartOptions getOptions()
	{
		return options;
	}

	@SuppressWarnings("unchecked")
	private Collection< ? extends Series< ? , ? , ? >> getModelObject()
	{
		return (Collection< ? extends Series< ? , ? , ? >>) getDefaultModelObject();
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
			new JsStatement().append("var " + getMarkupId() + " = = new Highcharts.Chart( "
				+ optionsStr + " );\n");

		return jsStatement;
	}
}
