package nl.topicus.whighcharts.components.themes;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class WHighChartGridJavaScriptResourceReference extends WiQueryJavaScriptResourceReference
{
	private static final long serialVersionUID = -5685922696842251887L;

	private static WHighChartGridJavaScriptResourceReference INSTANCE =
		new WHighChartGridJavaScriptResourceReference();

	private WHighChartGridJavaScriptResourceReference()
	{
		super(WHighChartGridJavaScriptResourceReference.class, "jquery.highcharts.gray.js");
	}

	public static WHighChartGridJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
