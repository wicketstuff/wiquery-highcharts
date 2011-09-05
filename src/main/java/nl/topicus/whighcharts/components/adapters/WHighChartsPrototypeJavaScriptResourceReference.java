package nl.topicus.whighcharts.components.adapters;

import nl.topicus.whighcharts.components.WHighChartsJavaScriptResourceReference;

import org.apache.wicket.resource.dependencies.AbstractResourceDependentResourceReference;
import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class WHighChartsPrototypeJavaScriptResourceReference extends
		WiQueryJavaScriptResourceReference
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

	@Override
	public AbstractResourceDependentResourceReference[] getDependentResourceReferences()
	{
		AbstractResourceDependentResourceReference[] list =
			new AbstractResourceDependentResourceReference[1];
		list[0] = WHighChartsJavaScriptResourceReference.get();

		return list;
	}
}
