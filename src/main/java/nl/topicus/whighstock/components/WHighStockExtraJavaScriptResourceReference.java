package nl.topicus.whighstock.components;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class WHighStockExtraJavaScriptResourceReference extends WiQueryJavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static WHighStockExtraJavaScriptResourceReference INSTANCE =
		new WHighStockExtraJavaScriptResourceReference();

	private WHighStockExtraJavaScriptResourceReference()
	{
		super(WHighStockExtraJavaScriptResourceReference.class, "jquery.whighcharts.js");
	}

	public static WHighStockExtraJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
