package nl.topicus.whighcharts.options.plotoptions;


import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartPlotAreaOptions extends
		AbstractWHighChartPlotChartOptions<WHighChartPlotAreaOptions>
{
	private static final long serialVersionUID = 1L;

	private Number pointStart;

	private WHighChartPlotAreaMarkerOptions marker;

	public Number getPointStart()
	{
		return pointStart;
	}

	public WHighChartPlotAreaOptions setPointStart(Number pointStart)
	{
		this.pointStart = pointStart;
		return this;
	}

	public WHighChartPlotAreaMarkerOptions getMarker()
	{
		if (marker == null)
			marker = new WHighChartPlotAreaMarkerOptions();

		return marker;
	}

	public WHighChartPlotAreaOptions setMarker(WHighChartPlotAreaMarkerOptions marker)
	{
		this.marker = marker;
		return this;
	}
}
