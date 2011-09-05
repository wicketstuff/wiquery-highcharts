package nl.topicus.whighcharts.components;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class WHighChartsJavaScriptResourceReference extends WiQueryJavaScriptResourceReference
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
