package nl.topicus.whighcharts.components.themes;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class WHighChartDarkGreenJavaScriptResourceReference extends
		WiQueryJavaScriptResourceReference
{
	private static final long serialVersionUID = -2687372577252173763L;

	private static WHighChartDarkGreenJavaScriptResourceReference INSTANCE =
		new WHighChartDarkGreenJavaScriptResourceReference();

	private WHighChartDarkGreenJavaScriptResourceReference()
	{
		super(WHighChartDarkGreenJavaScriptResourceReference.class,
			"jquery.highcharts.dark-green.js");
	}

	public static WHighChartDarkGreenJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
