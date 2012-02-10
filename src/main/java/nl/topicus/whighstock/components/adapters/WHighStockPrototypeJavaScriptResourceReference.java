package nl.topicus.whighstock.components.adapters;

import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class WHighStockPrototypeJavaScriptResourceReference extends
		WiQueryJavaScriptResourceReference
{

	private static final long serialVersionUID = 8963995776094930442L;

	private static WHighStockPrototypeJavaScriptResourceReference INSTANCE =
		new WHighStockPrototypeJavaScriptResourceReference();

	private WHighStockPrototypeJavaScriptResourceReference()
	{
		super(WHighStockPrototypeJavaScriptResourceReference.class,
			"jquery.highstock.prototype-adapter.js");
	}

	public static WHighStockPrototypeJavaScriptResourceReference get()
	{
		return INSTANCE;
	}
}
