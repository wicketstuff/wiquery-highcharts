package nl.topicus.whighcharts.components;

import org.apache.wicket.resource.JQueryPluginResourceReference;

public class WHighChartsJavaScriptResourceReference extends JQueryPluginResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static WHighChartsJavaScriptResourceReference INSTANCE =
		new WHighChartsJavaScriptResourceReference();

	private WHighChartsJavaScriptResourceReference()
	{
		super(WHighChartsJavaScriptResourceReference.class, "jquery.highcharts.js");
	}

	public static WHighChartsJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
