package nl.topicus.whighstock.components.themes;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class WHighStockSkiesJavaScriptResourceReference extends WiQueryJavaScriptResourceReference
{
	private static final long serialVersionUID = -6038240237625977028L;

	private static WHighStockSkiesJavaScriptResourceReference INSTANCE =
		new WHighStockSkiesJavaScriptResourceReference();

	private WHighStockSkiesJavaScriptResourceReference()
	{
		super(WHighStockSkiesJavaScriptResourceReference.class, "jquery.highstock.skies.js");
	}

	public static WHighStockSkiesJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
