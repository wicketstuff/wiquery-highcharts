package nl.topicus.whighcharts.components.adapters;

import nl.topicus.whighcharts.components.WHighChartsJavaScriptResourceReference;

import org.apache.wicket.resource.dependencies.AbstractResourceDependentResourceReference;
import org.odlabs.wiquery.core.resources.WiQueryJavaScriptResourceReference;

public class WHighChartsMooToolsJavaScriptResourceReference extends
		WiQueryJavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static WHighChartsMooToolsJavaScriptResourceReference INSTANCE =
		new WHighChartsMooToolsJavaScriptResourceReference();

	private WHighChartsMooToolsJavaScriptResourceReference()
	{
		super(WHighChartsMooToolsJavaScriptResourceReference.class,
			"jquery.highcharts.mootools-adapter.js");
	}

	public static WHighChartsMooToolsJavaScriptResourceReference get()
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
