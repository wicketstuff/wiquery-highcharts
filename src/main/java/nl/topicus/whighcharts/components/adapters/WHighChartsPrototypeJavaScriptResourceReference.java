package nl.topicus.whighcharts.components.adapters;

import org.apache.wicket.resource.MinifiedDetectingJavaScriptResourceReference;

public class WHighChartsPrototypeJavaScriptResourceReference extends
		MinifiedDetectingJavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static WHighChartsPrototypeJavaScriptResourceReference INSTANCE =
		new WHighChartsPrototypeJavaScriptResourceReference();

	private WHighChartsPrototypeJavaScriptResourceReference()
	{
		super(WHighChartsPrototypeJavaScriptResourceReference.class,
			"jquery.highcharts.prototype-adapter.js");
	}

	public static WHighChartsPrototypeJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
