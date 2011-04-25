package nl.topicus.whighcharts.options;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartPlotOptions
{
	private WHighChartPlotAreaOptions area;

	public WHighChartPlotAreaOptions getArea()
	{
		if (area == null)
			area = new WHighChartPlotAreaOptions();
		return area;
	}

	public WHighChartPlotOptions setArea(WHighChartPlotAreaOptions area)
	{
		this.area = area;
		return this;
	}
}
