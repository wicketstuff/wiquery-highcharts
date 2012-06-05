package nl.topicus.whighstock.components.adapters;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class WHighStockMooToolsJavaScriptResourceReference extends
		WiQueryJavaScriptResourceReference
{
	private static final long serialVersionUID = -4940713260764725037L;

	private static WHighStockMooToolsJavaScriptResourceReference INSTANCE =
		new WHighStockMooToolsJavaScriptResourceReference();

	private WHighStockMooToolsJavaScriptResourceReference()
	{
		super(WHighStockMooToolsJavaScriptResourceReference.class,
			"jquery.highstock.mootools-adapter.js");
	}

	public static WHighStockMooToolsJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
