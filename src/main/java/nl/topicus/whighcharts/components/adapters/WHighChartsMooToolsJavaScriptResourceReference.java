package nl.topicus.whighcharts.components.adapters;

import org.apache.wicket.resource.MinifiedAwareJavaScriptResourceReference;

public class WHighChartsMooToolsJavaScriptResourceReference extends
		MinifiedAwareJavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static WHighChartsMooToolsJavaScriptResourceReference INSTANCE =
		new WHighChartsMooToolsJavaScriptResourceReference();

	private WHighChartsMooToolsJavaScriptResourceReference()
	{
		super(WHighChartsMooToolsJavaScriptResourceReference.class,
			"jquery.highcharts.mootools-adapter.js");
	}

	public static WHighChartsMooToolsJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
