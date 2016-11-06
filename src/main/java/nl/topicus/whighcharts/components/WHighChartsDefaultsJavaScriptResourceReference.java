package nl.topicus.whighcharts.components;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class WHighChartsDefaultsJavaScriptResourceReference extends JavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static WHighChartsDefaultsJavaScriptResourceReference INSTANCE =
		new WHighChartsDefaultsJavaScriptResourceReference();

	private WHighChartsDefaultsJavaScriptResourceReference()
	{
		super(WHighChartsDefaultsJavaScriptResourceReference.class,
			"jquery.highcharts.defaults.js");
	}

	public static WHighChartsDefaultsJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
