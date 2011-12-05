package nl.topicus.whighcharts.components.themes;

import org.apache.wicket.resource.MinifiedAwareJavaScriptResourceReference;

public class WHighChartsExportingJavaScriptResourceReference extends
		MinifiedAwareJavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static WHighChartsExportingJavaScriptResourceReference INSTANCE =
		new WHighChartsExportingJavaScriptResourceReference();

	private WHighChartsExportingJavaScriptResourceReference()
	{
		super(WHighChartsExportingJavaScriptResourceReference.class,
			"jquery.highcharts.exporting.js");
	}

	public static WHighChartsExportingJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
