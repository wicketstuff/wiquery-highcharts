package nl.topicus.whighcharts.options.plotoptions;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartPointerType;
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
	 * Enable or disable the initial animation when a series is displayed. The animation
	 * can also be set as a configuration object. Please note that this option only
	 * applies to the initial animation of the series itself. For other animations, see
	 * chart.animation and the animation parameter under the API methods. The following
	 * properties are supported: duration The duration of the animation in milliseconds.
	 * easing When using jQuery as the general framework, the easing can be set to linear
	 * or swing. More easing functions are available with the use of jQuery plug-ins, most
	 * notably the jQuery UI suite. See the jQuery docs. When using MooTools as the
	 * general framework, use the property name transition instead of easing. Due to poor
	 * performance, animation is disabled in old IE browsers for column charts and polar
	 * charts.
	 * 
	 * Defaults to true.
	 **/
	private Boolean animation;

	/**
	 * The color of the border surronding each column or bar. Defaults to #FFFFFF.
	 */
	private String borderColor;

	/**
	 * The corner radius of the border surronding each column or bar. Defaults to 0.
	 */
	private Number borderRadius;

	/**
	 * The width of the border surronding each column or bar. Defaults to 1.
	 * 
	 */
	private Number borderWidth;

	/**
	 * The main color or the series. In line type series it applies to the line and the
	 * point markers unless otherwise specified. In bar type series it applies to the bars
	 * unless a color is specified per point. The default value is pulled from the
	 * options.colors array.
	 */
	private String color;

	/**
	 * Polar charts only. Whether to connect the ends of a line series plot across the
	 * extremes. Defaults to true.
	 */
	private Boolean connectEnds;

	/**
	 * Whether to connect a graph line across null points. Defaults to false.
	 */
	private Boolean connectNulls;

	/**
	 * When the series contains less points than the crop threshold, all points are drawn,
	 * event if the points fall outside the visible plot area at the current zoom. The
	 * advantage of drawing all points (including markers and columns), is that animation
	 * is performed on updates. On the other hand, when the series contains more points
	 * than the crop threshold, the series data is cropped to only contain points that
	 * fall within the plot area. The advantage of cropping away invisible points is to
	 * increase performance on large series. . Defaults to 300.
	 */
	private Number cropThreshold;

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

	private WHighChartPlotDataLabelsOptions dataLabels;

	/**
	 * Enable or disable the mouse tracking for a specific series. This includes point
	 * tooltips and click events on graphs and points. For large datasets it improves
	 * performance. Defaults to true.
	 */
	private Boolean enableMouseTracking;

	/**
	 * Event listeners for chart events.
	 */
	private WHighChartChartEventsOptions events;

	/**
	 * Fill color or gradient for the area. When null, the series' color is used with the
	 * series' fillOpacity.
	 */
	private String fillColor;

	/**
	 * Fill opacity for the area. Defaults to .75.
	 */
	private Number fillOpacity;

	/**
	 * An id for the series. This can be used after render time to get a pointer to the
	 * series object through chart.get().
	 */
	private String id;

	/**
	 * A separate color for the graph line. By default the line takes the color of the
	 * series, but the lineColor setting allows setting a separate color for the line
	 * without altering the fillColor.
	 */
	private String lineColor;

	/**
	 * Pixel with of the graph line. Defaults to 2.
	 */
	private Number lineWidth;

	/**
	 * The id of another series to link to. Additionally, the value can be ":previous" to
	 * link to the previous series. When two series are linked, only the first one appears
	 * in the legend. Toggling the visibility of this also toggles the linked series.
	 */
	private String linkedTo;

	private WHighChartPlotAreaMarkerOptions marker;

	/**
	 * The color for the parts of the graph or points that are below the threshold.
	 * Defaults to null.
	 */
	private String negativeColor;

	/**
	 * A separate color for the negative part of the area. See also: negativeColor
	 */
	private String negativeFillColor;

	private WHighChartPlotChartPointOptions point;

	/**
	 * If no x values are given for the points in a series, pointInterval defines the
	 * interval of the x values. For example, if a series contains one value every decade
	 * starting from year 0, set pointInterval to 10. Defaults to 1.
	 */
	private Number pointInterval;

	/**
	 * Padding between each column or bar, in x axis units. Defaults to 0.1.
	 */
	private Number pointPadding;

	/**
	 * Possible values: null, "on", "between". In a column chart, when pointPlacement is
	 * "on", the point will not create any padding of the X axis. In a polar column chart
	 * this means that the first column points directly north. If the pointPlacement is
	 * "between", the columns will be laid out between ticks. This is useful for example
	 * for visualising an amount between two points in time or in a certain sector of a
	 * polar chart. Defaults to null in cartesian charts, "between" in polar charts.
	 */
	private String pointPlacement;

	/**
	 * If no x values are given for the points in a series, pointStart defines on what
	 * value to start. For example, if a series contains one yearly value starting from
	 * 1945, set pointStart to 1945. Defaults to 0.
	 */
	private Number pointStart;

	/**
	 * Whether to select the series initially. If showCheckbox is true, the checkbox next
	 * to the series name will be checked for a selected series. Defaults to false.
	 */
	private Boolean selected;

	/**
	 * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an
	 * object configuration containing color, offsetX, offsetY, opacity and width.
	 * Defaults to false.
	 */
	private Boolean shadow;

	/**
	 * If true, a checkbox is displayed next to the legend item to allow selecting the
	 * series. The state of the checkbox is determined by the selected option. Defaults to
	 * false.
	 */
	private Boolean showCheckbox;

	/**
	 * Whether to display this particular series or series type in the legend. Defaults to
	 * true.
	 */
	private Boolean showInLegend;

	/**
	 * Whether to stack the values of each series on top of each other. Possible values
	 * are null to disable, "normal" to stack by value or "percent".
	 */
	private String stacking;

	/**
	 * A wrapper object for all the series options in specific states.
	 */
	private WHighChartPlotSeriesOptions states;

	/**
	 * Sticky tracking of mouse events. When true, the mouseOut event on a series isn't
	 * triggered until the mouse moves over another series, or out of the plot area. When
	 * false, the mouseOut event on a series is triggered when the mouse leaves the area
	 * around the series' graph or markers. This also implies the tooltip. When
	 * stickyTracking is false and tooltip.shared is false, the tooltip will be hidden
	 * when moving the mouse between series. Defaults to true.
	 */
	private Boolean stickyTracking;

	/**
	 * The Y axis value to serve as the base for the area, for distinguishing between
	 * values above and below a threshold. If null, the area behaves like a line series
	 * with fill between the graph and the Y axis minimum. Defaults to 0.
	 */
	private Number threshold;

	/**
	 * A configuration object for the tooltip rendering of each single series. Properties
	 * are inherited from tooltip, but only the following properties can be defined on a
	 * series level.
	 */
	private Object tooltip;

	/**
	 * Whether the whole area or just the line should respond to mouseover tooltips and
	 * other mouse or touch events. Defaults to false.
	 */
	private Boolean trackByArea;

	/**
	 * When a series contains a data array that is longer than this, only one dimensional
	 * arrays of numbers, or two dimensional arrays with x and y values are allowed. Also,
	 * only the first point is tested, and the rest are assumed to be the same format.
	 * This saves expensive data checking and indexing in long series. Defaults to 1000.
	 */
	private Number turboThreshold;

	/**
	 * Set the initial visibility of the series. Defaults to true.
	 */
	private Boolean visible;

	/**
	 * Define the z index of the series.
	 */
	private Number zIndex;

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

	public Boolean getAnimation()
	{
		return animation;
	}

	@SuppressWarnings("unchecked")
	public T setAnimation(Boolean animation)
	{
		this.animation = animation;
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

	public Number getBorderRadius()
	{
		return borderRadius;
	}

	@SuppressWarnings("unchecked")
	public T setBorderRadius(Number borderRadius)
	{
		this.borderRadius = borderRadius;
		return (T) this;
	}

	public Number getBorderWidth()
	{
		return borderWidth;
	}

	@SuppressWarnings("unchecked")
	public T setBorderWidth(Number borderWidth)
	{
		this.borderWidth = borderWidth;
		return (T) this;
	}

	public String getColor()
	{
		return color;
	}

	@SuppressWarnings("unchecked")
	public T setColor(String color)
	{
		this.color = color;
		return (T) this;
	}

	public Boolean getConnectEnds()
	{
		return connectEnds;
	}

	@SuppressWarnings("unchecked")
	public T setConnectEnds(Boolean connectEnds)
	{
		this.connectEnds = connectEnds;
		return (T) this;
	}

	public Boolean getConnectNulls()
	{
		return connectNulls;
	}

	@SuppressWarnings("unchecked")
	public T setConnectNulls(Boolean connectNulls)
	{
		this.connectNulls = connectNulls;
		return (T) this;
	}

	public Number getCropThreshold()
	{
		return cropThreshold;
	}

	@SuppressWarnings("unchecked")
	public T setCropThreshold(Number cropThreshold)
	{
		this.cropThreshold = cropThreshold;
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

	public WHighChartPlotDataLabelsOptions getDataLabels()
	{
		if (dataLabels == null)
			dataLabels = new WHighChartPlotDataLabelsOptions();

		return dataLabels;
	}

	@SuppressWarnings("unchecked")
	public T setDataLabels(WHighChartPlotDataLabelsOptions dataLabels)
	{
		this.dataLabels = dataLabels;
		return (T) this;
	}

	public Boolean getEnableMouseTracking()
	{
		return enableMouseTracking;
	}

	@SuppressWarnings("unchecked")
	public T setEnableMouseTracking(Boolean enableMouseTracking)
	{
		this.enableMouseTracking = enableMouseTracking;
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

	public String getFillColor()
	{
		return fillColor;
	}

	@SuppressWarnings("unchecked")
	public T setFillColor(String fillColor)
	{
		this.fillColor = fillColor;
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

	public String getId()
	{
		return id;
	}

	@SuppressWarnings("unchecked")
	public T setId(String id)
	{
		this.id = id;
		return (T) this;
	}

	public String getLineColor()
	{
		return lineColor;
	}

	@SuppressWarnings("unchecked")
	public T setLineColor(String lineColor)
	{
		this.lineColor = lineColor;
		return (T) this;
	}

	public Number getLineWidth()
	{
		return lineWidth;
	}

	@SuppressWarnings("unchecked")
	public T setLineWidth(Number lineWidth)
	{
		this.lineWidth = lineWidth;
		return (T) this;
	}

	public String getLinkedTo()
	{
		return linkedTo;
	}

	@SuppressWarnings("unchecked")
	public T setLinkedTo(String linkedTo)
	{
		this.linkedTo = linkedTo;
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

	public String getNegativeColor()
	{
		return negativeColor;
	}

	@SuppressWarnings("unchecked")
	public T setNegativeColor(String negativeColor)
	{
		this.negativeColor = negativeColor;
		return (T) this;
	}

	public String getNegativeFillColor()
	{
		return negativeFillColor;
	}

	@SuppressWarnings("unchecked")
	public T setNegativeFillColor(String negativeFillColor)
	{
		this.negativeFillColor = negativeFillColor;
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

	public Number getPointInterval()
	{
		return pointInterval;
	}

	@SuppressWarnings("unchecked")
	public T setPointInterval(Number pointInterval)
	{
		this.pointInterval = pointInterval;
		return (T) this;
	}

	public Number getPointPadding()
	{
		return pointPadding;
	}

	@SuppressWarnings("unchecked")
	public T setPointPadding(Number pointPadding)
	{
		this.pointPadding = pointPadding;
		return (T) this;
	}

	public String getPointPlacement()
	{
		return pointPlacement;
	}

	@SuppressWarnings("unchecked")
	public T setPointPlacement(String pointPlacement)
	{
		this.pointPlacement = pointPlacement;
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

	public Boolean getSelected()
	{
		return selected;
	}

	@SuppressWarnings("unchecked")
	public T setSelected(Boolean selected)
	{
		this.selected = selected;
		return (T) this;
	}

	public Boolean getShadow()
	{
		return shadow;
	}

	@SuppressWarnings("unchecked")
	public T setShadow(Boolean shadow)
	{
		this.shadow = shadow;
		return (T) this;
	}

	public Boolean getShowCheckbox()
	{
		return showCheckbox;
	}

	@SuppressWarnings("unchecked")
	public T setShowCheckbox(Boolean showCheckbox)
	{
		this.showCheckbox = showCheckbox;
		return (T) this;
	}

	public Boolean getShowInLegend()
	{
		return showInLegend;
	}

	@SuppressWarnings("unchecked")
	public T setShowInLegend(Boolean showInLegend)
	{
		this.showInLegend = showInLegend;
		return (T) this;
	}

	public String getStacking()
	{
		return stacking;
	}

	@SuppressWarnings("unchecked")
	public T setStacking(String stacking)
	{
		this.stacking = stacking;
		return (T) this;
	}

	public WHighChartPlotSeriesOptions getStates()
	{
		if (states == null)
			states = new WHighChartPlotSeriesOptions();

		return states;
	}

	@SuppressWarnings("unchecked")
	public T setStates(WHighChartPlotSeriesOptions states)
	{
		this.states = states;
		return (T) this;
	}

	public Boolean getStickyTracking()
	{
		return stickyTracking;
	}

	@SuppressWarnings("unchecked")
	public T setStickyTracking(Boolean stickyTracking)
	{
		this.stickyTracking = stickyTracking;
		return (T) this;
	}

	public Number getThreshold()
	{
		return threshold;
	}

	@SuppressWarnings("unchecked")
	public T setThreshold(Number threshold)
	{
		this.threshold = threshold;
		return (T) this;
	}

	public Object getTooltip()
	{
		return tooltip;
	}

	@SuppressWarnings("unchecked")
	public T setTooltip(Object tooltip)
	{
		this.tooltip = tooltip;
		return (T) this;
	}

	public Boolean getTrackByArea()
	{
		return trackByArea;
	}

	@SuppressWarnings("unchecked")
	public T setTrackByArea(Boolean trackByArea)
	{
		this.trackByArea = trackByArea;
		return (T) this;
	}

	public Number getTurboThreshold()
	{
		return turboThreshold;
	}

	@SuppressWarnings("unchecked")
	public T setTurboThreshold(Number turboThreshold)
	{
		this.turboThreshold = turboThreshold;
		return (T) this;
	}

	public Boolean getVisible()
	{
		return visible;
	}

	@SuppressWarnings("unchecked")
	public T setVisible(Boolean visible)
	{
		this.visible = visible;
		return (T) this;
	}

	public Number getzIndex()
	{
		return zIndex;
	}

	@SuppressWarnings("unchecked")
	public T setzIndex(Number zIndex)
	{
		this.zIndex = zIndex;
		return (T) this;
	}
}
