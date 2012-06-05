package nl.topicus.whighcharts.components.themes;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class WHighChartGreyJavaScriptResourceReference extends WiQueryJavaScriptResourceReference
{

	private static final long serialVersionUID = 236726750581852083L;

	private static WHighChartGreyJavaScriptResourceReference INSTANCE =
		new WHighChartGreyJavaScriptResourceReference();

	private WHighChartGreyJavaScriptResourceReference()
	{
		super(WHighChartGreyJavaScriptResourceReference.class, "jquery.highcharts.gray.js");
	}

	public static WHighChartGreyJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
