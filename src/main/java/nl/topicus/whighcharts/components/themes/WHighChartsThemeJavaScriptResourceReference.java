package nl.topicus.whighcharts.components.themes;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class WHighChartsThemeJavaScriptResourceReference extends JavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private WHighChartsThemeJavaScriptResourceReference(String theme)
	{
		super(WHighChartsThemeJavaScriptResourceReference.class, "jquery.highcharts." + theme
			+ ".js");
	}
}
