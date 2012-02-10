package nl.topicus.whighstock.components;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class WHighStockJavaScriptResourceReference extends WiQueryJavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static WHighStockJavaScriptResourceReference INSTANCE =
		new WHighStockJavaScriptResourceReference();

	private WHighStockJavaScriptResourceReference()
	{
		super(WHighStockJavaScriptResourceReference.class, "highstock.src.js");
	}

	public static WHighStockJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
