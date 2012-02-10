package nl.topicus.whighcharts.components.themes;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class WHighChartDarkBlueJavaScriptResourceReference extends
		WiQueryJavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static WHighChartDarkBlueJavaScriptResourceReference INSTANCE =
		new WHighChartDarkBlueJavaScriptResourceReference();

	private WHighChartDarkBlueJavaScriptResourceReference()
	{
		super(WHighChartDarkBlueJavaScriptResourceReference.class,
			"jquery.highcharts.exporting.js");
	}

	public static WHighChartDarkBlueJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
