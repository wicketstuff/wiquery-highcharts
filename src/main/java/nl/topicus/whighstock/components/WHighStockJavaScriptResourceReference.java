package nl.topicus.whighstock.components;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class WHighStockJavaScriptResourceReference extends WiQueryJavaScriptResourceReference
{
	private static final long serialVersionUID = -3102442307594519480L;

	private static WHighStockJavaScriptResourceReference INSTANCE =
		new WHighStockJavaScriptResourceReference();

	private WHighStockJavaScriptResourceReference()
	{
		super(WHighStockJavaScriptResourceReference.class, "jquery.highstock.js");
	}

	public static WHighStockJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
