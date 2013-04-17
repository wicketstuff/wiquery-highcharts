package nl.topicus.whighcharts.options.plotoptions;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartPointerType;
import nl.topicus.whighcharts.options.WHighChartStackingType;
import nl.topicus.whighcharts.options.chart.WHighChartChartEventsOptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class AbstractWHighChartPlotChartOptions<T extends AbstractWHighChartPlotChartOptions<T>>
		implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Allow this series' points to be selected by clicking on the markers, bars or pie
	 * slices. Defaults to false.
	 */
	private Boolean allowPointSelect;

	/**
	 * You can set the cursor to "pointer" if you have click events attached to the
	 * series, to signal to the user that the points and lines can be clicked. Defaults to
	 * ''.
	 */
	private WHighChartPointerType cursor;

	/**
	 * A name for the dash style to use for the graph. Applies only to series type having
	 * a graph, like line, spline, area and scatter in case it has a lineWidth. The value
	 * for the dashStyle include: Solid ShortDash ShortDot ShortDashDot ShortDashDotDot
	 * Dot Dash LongDash DashDot LongDashDot LongDashDotDot Defaults to null.
	 */
	private WHighChartPlotDashStyleType dashStyle;

	/**
	 * Event listeners for chart events.
	 */
	private WHighChartChartEventsOptions events;

	/**
	 * Fill opacity for the area. Defaults to .75.
	 */
	private Number fillOpacity;

	private WHighChartPlotAreaMarkerOptions marker;

	private WHighChartPlotChartPointOptions point;

	private Number pointStart;

	protected String borderColor;

	protected WHighChartStackingType stacking;

	public Boolean getAllowPointSelect()
	{
		return allowPointSelect;
	}

	@SuppressWarnings("unchecked")
	public T setAllowPointSelect(Boolean allowPointSelect)
	{
		this.allowPointSelect = allowPointSelect;
		return (T) this;
	}

	public WHighChartPointerType getCursor()
	{
		return cursor;
	}

	@SuppressWarnings("unchecked")
	public T setCursor(WHighChartPointerType cursor)
	{
		this.cursor = cursor;
		return (T) this;
	}

	public WHighChartPlotDashStyleType getDashStyle()
	{
		return dashStyle;
	}

	@SuppressWarnings("unchecked")
	public T setDashStyle(WHighChartPlotDashStyleType dashStyle)
	{
		this.dashStyle = dashStyle;
		return (T) this;
	}

	public WHighChartStackingType getStacking()
	{
		return stacking;
	}

	@SuppressWarnings("unchecked")
	public T setStacking(WHighChartStackingType stacking)
	{
		this.stacking = stacking;
		return (T) this;
	}

	public Number getFillOpacity()
	{
		return fillOpacity;
	}

	@SuppressWarnings("unchecked")
	public T setFillOpacity(Number fillOpacity)
	{
		this.fillOpacity = fillOpacity;
		return (T) this;
	}

	public WHighChartChartEventsOptions getEvents()
	{
		if (events == null)
			events = new WHighChartChartEventsOptions();

		return events;
	}

	@SuppressWarnings("unchecked")
	public T setEvents(WHighChartChartEventsOptions events)
	{
		this.events = events;
		return (T) this;
	}

	public WHighChartPlotAreaMarkerOptions getMarker()
	{
		if (marker == null)
			marker = new WHighChartPlotAreaMarkerOptions();

		return marker;
	}

	@SuppressWarnings("unchecked")
	public T setMarker(WHighChartPlotAreaMarkerOptions marker)
	{
		this.marker = marker;
		return (T) this;
	}

	public WHighChartPlotChartPointOptions getPoint()
	{
		if (point == null)
			point = new WHighChartPlotChartPointOptions();

		return point;
	}

	@SuppressWarnings("unchecked")
	public T setPoint(WHighChartPlotChartPointOptions point)
	{
		this.point = point;
		return (T) this;
	}

	public Number getPointStart()
	{
		return pointStart;
	}

	@SuppressWarnings("unchecked")
	public T setPointStart(Number pointStart)
	{
		this.pointStart = pointStart;
		return (T) this;
	}

	public String getBorderColor()
	{
		return borderColor;
	}

	@SuppressWarnings("unchecked")
	public T setBorderColor(String borderColor)
	{
		this.borderColor = borderColor;
		return (T) this;
	}

}
