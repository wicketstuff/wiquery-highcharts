package nl.topicus.whighcharts.options.series;

import java.util.ArrayList;
import java.util.List;

import nl.topicus.whighcharts.options.chart.IChartOptionsType;
import nl.topicus.whighcharts.options.chart.WHighChartChartEventsOptions;
import nl.topicus.whighcharts.options.chart.WHighChartChartOptionsType;
import nl.topicus.whighcharts.options.plotoptions.WHighChartPlotDashStyleType;
import nl.topicus.whighcharts.options.plotoptions.WHighChartPointerType;
import nl.topicus.whighcharts.options.plotoptions.datalabels.WHighChartsDataLabelsOptions;
import nl.topicus.whighcharts.options.plotoptions.marker.WHighChartMarkerOptions;
import nl.topicus.whighcharts.options.plotoptions.point.WHighChartPointOptions;
import nl.topicus.whighcharts.options.plotoptions.states.WHighChartMarkerStatesOptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class AbstractSeries<V, E extends ISeriesEntry<V>> implements ISeries<V, E>
{
	private static final long serialVersionUID = 1L;

	/**
	 * An array of data points for the series. The points can be given in three ways: A
	 * list of numerical values. In this case, the numberical values will be interpreted
	 * and y values, and x values will be automatically calculated, either starting at 0
	 * and incrementing by 1, or from pointStart and pointInterval given in the
	 * plotOptions. If the axis is has categories, these will be used. Example: data: [0,
	 * 5, 3, 5] A list of arrays with two values. In this case, the first value is the x
	 * value and the second is the y value. If the first value is a string, it is applied
	 * as the name of the point, and the x value is incremented following the above rules.
	 * Example: data: [[5, 2], [6, 3], [8, 2]] A list of object with named values. In this
	 * case the objects are point configuration objects as seen under options.point.
	 * Example: data: [{ name: 'Point 1', color: '#00FF00', y: 0 }, { name: 'Point 2',
	 * color: '#FF00FF', y: 5 }] Defaults to "".
	 */
	private List<E> data = new ArrayList<E>();

	/**
	 * The sequential index of the series in the legend.
	 */
	private Number legendIndex;

	/**
	 * The name of the series as shown in the legend, tooltip etc. Defaults to "".
	 */
	private String name;

	/**
	 * This option allows grouping series in a stacked chart. The stack option can be a
	 * string or a number or anything else, as long as the grouped series' stack options
	 * match each other. Defaults to null.
	 */
	private Object stack;

	/**
	 * The type of series. Can be one of area, areaspline, bar, column, line, pie, scatter
	 * or spline. Defaults to "line".
	 */
	private WHighChartChartOptionsType type;

	/**
	 * When using dual or multiple x axes, this number defines which xAxis the particular
	 * series is connected to. It refers to the index of the axis in the xAxis array, with
	 * 0 being the first. Defaults to 0.
	 */
	private Number xAxis;

	/**
	 * When using dual or multiple y axes, this number defines which yAxis the particular
	 * series is connected to. It refers to the index of the axis in the yAxis array, with
	 * 0 being the first. Defaults to 0.
	 */
	private Number yAxis;

	/**
	 * Allow this series' points to be selected by clicking on the markers, bars or pie
	 * slices.
	 * 
	 * Defaults to false.
	 */
	private Boolean allowPointSelect;

	/**
	 * <p>
	 * Enable or disable the initial animation when a series is displayed. Since version
	 * 2.1, the animation can be set as a configuration object. Please note that this
	 * option only applies to the initial animation of the series itself. For other
	 * animations, see #chart => animation and the animation parameter under the API
	 * methods. The following properties are supported:
	 * </p>
	 * 
	 * <p>
	 * duration<br/>
	 * &nbsp;&nbsp;The duration of the animation in milliseconds.<br/>
	 * easing<br/>
	 * &nbsp;&nbsp;When using jQuery as the general framework, the easing can be set to
	 * linear or swing. More easing functions are available with the use of jQuery
	 * plug-ins, most notably the jQuery UI suite. See the jQuery docs. When using MooToos
	 * as the general framework, use the property name transition instead of easing.
	 * </p>
	 * 
	 * <p>
	 * Defaults to true.
	 * </p>
	 */
	private Boolean animation;

	/**
	 * The main color or the series. In line type series it applies to the line and the
	 * point markers unless otherwise specified. In bar type series it applies to the bars
	 * unless a color is specified per point.
	 * 
	 * The default value is pulled from the options.colors array.
	 */
	private String color;

	/**
	 * Whether to connect a graph line across null points.
	 * 
	 * Defaults to false.
	 */
	private Boolean connectNulls;

	/**
	 * You can set the cursor to "pointer" if you have click events attached to the
	 * series, to signal to the user that the points and lines can be clicked.
	 * 
	 * Defaults to ''.
	 */
	private WHighChartPointerType cursor;

	/**
	 * A name for the dash style to use for the graph. Applies only to series type having
	 * a graph, like line, spline, area and scatter in case it has a lineWidth. The value
	 * for the dashStyle include: Solid ShortDash ShortDot ShortDashDot ShortDashDotDot
	 * Dot Dash LongDash DashDot LongDashDot LongDashDotDot
	 * 
	 * Defaults to null.
	 */
	private WHighChartPlotDashStyleType dashStyle;

	/**
	 * Defines the appearance of the data labels, static labels for each point.
	 */
	private WHighChartsDataLabelsOptions dataLabels;

	/**
	 * Enable or disable the mouse tracking for a specific series. This includes point
	 * tooltips and click events on graphs and points. For large datasets it improves
	 * performance.
	 * 
	 * Defaults to true.
	 */
	private Boolean enableMouseTracking;

	/**
	 * Event listeners for chart events.
	 */
	private WHighChartChartEventsOptions events;

	/**
	 * An id for the series. This can be used after render time to get a pointer to the
	 * series object through chart.get().
	 * 
	 * Defaults to null.
	 */
	private String id;

	/**
	 * Pixel with of the graph line.
	 * 
	 * Defaults to 2.
	 */
	private Number lineWidth;

	/** Defines the appearance of the point markers. */
	private WHighChartMarkerOptions marker;

	private WHighChartPointOptions point;

	/**
	 * If no x values are given for the points in a series, pointStart defines on what
	 * value to start. For example, if a series contains one yearly value starting from
	 * 1945, set pointStart to 1945.
	 * 
	 * Defaults to 0.
	 */
	private Number pointStart;

	/**
	 * If no x values are given for the points in a series, pointInterval defines the
	 * interval of the x values. For example, if a series contains one value every decade
	 * starting from year 0, set pointInterval to 10.
	 * 
	 * Defaults to 1.
	 */
	private Number pointInterval;

	/**
	 * Whether to select the series initially. If showCheckbox is true, the checkbox next
	 * to the series name will be checked for a selected series.
	 * 
	 * Defaults to false.
	 */
	private Boolean selected;

	/**
	 * Whether to apply a drop shadow to the graph line.
	 * 
	 * Defaults to true.
	 */
	private Boolean shadow;

	/**
	 * If true, a checkbox is displayed next to the legend item to allow selecting the
	 * series. The state of the checkbox is determined by the selected option.
	 * 
	 * Defaults to false.
	 */
	private Boolean showCheckbox;

	/**
	 * Whether to display this particular series or series type in the legend.
	 * 
	 * Defaults to true.
	 */
	private Boolean showInLegend;

	/**
	 * Whether to stack the values of each series on top of each other. Possible values
	 * are null to disable, "normal" to stack by value or "percent".
	 * 
	 * Defaults to null.
	 */
	private String stacking;

	/**
	 * A wrapper object for all the series options in specific states.
	 */
	private WHighChartMarkerStatesOptions states;

	/**
	 * Sticky tracking of mouse events. When true, the mouseOut event on a series isn't
	 * triggered until the mouse moves over another series, or out of the plot area. When
	 * false, the mouseOut event on a series is triggered when the mouse leaves the area
	 * around the series' graph or markers. This also implies the tooltip. When
	 * stickyTracking is false, the tooltip will be hidden when moving the mouse between
	 * series.
	 * 
	 * Defaults to true.
	 */
	private Boolean stickyTracking;

	/**
	 * Set the initial visibility of the series.
	 * 
	 * Defaults to true.
	 */
	private Boolean visible;

	/**
	 * Define the z index of the series.
	 * 
	 * Defaults to null.
	 */
	private Number zIndex;

	@Override
	public List<E> getData()
	{
		return data;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setData(List<E> data)
	{
		this.data = data;
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T addEntry(E entry)
	{
		data.add(entry);
		return (T) this;
	}

	public String getName()
	{
		return name;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setName(String name)
	{
		this.name = name;
		return (T) this;
	}

	public Object getStack()
	{
		return stack;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setStack(Object stack)
	{
		this.stack = stack;
		return (T) this;
	}

	public IChartOptionsType getType()
	{
		return type;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setType(IChartOptionsType type)
	{
		if (type instanceof WHighChartChartOptionsType)
			this.type = (WHighChartChartOptionsType) type;
		else
			throw new RuntimeException("Wrong type for HighCharts");
		return (T) this;
	}

	public Number getxAxis()
	{
		return xAxis;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setxAxis(Number xAxis)
	{
		this.xAxis = xAxis;
		return (T) this;
	}

	public Number getyAxis()
	{
		return yAxis;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setyAxis(Number yAxis)
	{
		this.yAxis = yAxis;
		return (T) this;
	}

	public WHighChartsDataLabelsOptions getDataLabels()
	{
		if (dataLabels == null)
			dataLabels = new WHighChartsDataLabelsOptions();

		return dataLabels;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setDataLabels(WHighChartsDataLabelsOptions dataLabels)
	{
		this.dataLabels = dataLabels;
		return (T) this;
	}

	public Number getLegendIndex()
	{
		return legendIndex;
	}

	public <T extends AbstractSeries<V, E>> T setLegendIndex(Number legendIndex)
	{
		this.legendIndex = legendIndex;
		return (T) this;
	}

	public Boolean getAllowPointSelect()
	{
		return allowPointSelect;
	}

	public <T extends AbstractSeries<V, E>> T setAllowPointSelect(Boolean allowPointSelect)
	{
		this.allowPointSelect = allowPointSelect;
		return (T) this;
	}

	public Boolean getAnimation()
	{
		return animation;
	}

	public <T extends AbstractSeries<V, E>> T setAnimation(Boolean animation)
	{
		this.animation = animation;
		return (T) this;
	}

	public String getColor()
	{
		return color;
	}

	public <T extends AbstractSeries<V, E>> T setColor(String color)
	{
		this.color = color;
		return (T) this;
	}

	public Boolean getConnectNulls()
	{
		return connectNulls;
	}

	public <T extends AbstractSeries<V, E>> T setConnectNulls(Boolean connectNulls)
	{
		this.connectNulls = connectNulls;
		return (T) this;
	}

	public WHighChartPointerType getCursor()
	{
		return cursor;
	}

	public <T extends AbstractSeries<V, E>> T setCursor(WHighChartPointerType cursor)
	{
		this.cursor = cursor;
		return (T) this;
	}

	public WHighChartPlotDashStyleType getDashStyle()
	{
		return dashStyle;
	}

	public <T extends AbstractSeries<V, E>> T setDashStyle(WHighChartPlotDashStyleType dashStyle)
	{
		this.dashStyle = dashStyle;
		return (T) this;
	}

	public Boolean getEnableMouseTracking()
	{
		return enableMouseTracking;
	}

	public <T extends AbstractSeries<V, E>> T setEnableMouseTracking(Boolean enableMouseTracking)
	{
		this.enableMouseTracking = enableMouseTracking;
		return (T) this;
	}

	public WHighChartChartEventsOptions getEvents()
	{
		return events;
	}

	public <T extends AbstractSeries<V, E>> T setEvents(WHighChartChartEventsOptions events)
	{
		this.events = events;
		return (T) this;
	}

	public String getId()
	{
		return id;
	}

	public <T extends AbstractSeries<V, E>> T setId(String id)
	{
		this.id = id;
		return (T) this;
	}

	public Number getLineWidth()
	{
		return lineWidth;
	}

	public <T extends AbstractSeries<V, E>> T setLineWidth(Number lineWidth)
	{
		this.lineWidth = lineWidth;
		return (T) this;
	}

	public WHighChartMarkerOptions getMarker()
	{
		if (marker == null)
			marker = new WHighChartMarkerOptions();
		return marker;
	}

	public <T extends AbstractSeries<V, E>> T setMarker(WHighChartMarkerOptions marker)
	{
		this.marker = marker;
		return (T) this;
	}

	public WHighChartPointOptions getPoint()
	{
		return point;
	}

	public <T extends AbstractSeries<V, E>> T setPoint(WHighChartPointOptions point)
	{
		this.point = point;
		return (T) this;
	}

	public Number getPointStart()
	{
		return pointStart;
	}

	public <T extends AbstractSeries<V, E>> T setPointStart(Number pointStart)
	{
		this.pointStart = pointStart;
		return (T) this;
	}

	public Number getPointInterval()
	{
		return pointInterval;
	}

	public <T extends AbstractSeries<V, E>> T setPointInterval(Number pointInterval)
	{
		this.pointInterval = pointInterval;
		return (T) this;
	}

	public Boolean getSelected()
	{
		return selected;
	}

	public <T extends AbstractSeries<V, E>> T setSelected(Boolean selected)
	{
		this.selected = selected;
		return (T) this;
	}

	public Boolean getShadow()
	{
		return shadow;
	}

	public <T extends AbstractSeries<V, E>> T setShadow(Boolean shadow)
	{
		this.shadow = shadow;
		return (T) this;
	}

	public Boolean getShowCheckbox()
	{
		return showCheckbox;
	}

	public <T extends AbstractSeries<V, E>> T setShowCheckbox(Boolean showCheckbox)
	{
		this.showCheckbox = showCheckbox;
		return (T) this;
	}

	public Boolean getShowInLegend()
	{
		return showInLegend;
	}

	public <T extends AbstractSeries<V, E>> T setShowInLegend(Boolean showInLegend)
	{
		this.showInLegend = showInLegend;
		return (T) this;
	}

	public String getStacking()
	{
		return stacking;
	}

	public <T extends AbstractSeries<V, E>> T setStacking(String stacking)
	{
		this.stacking = stacking;
		return (T) this;
	}

	public WHighChartMarkerStatesOptions getStates()
	{
		return states;
	}

	public <T extends AbstractSeries<V, E>> T setStates(WHighChartMarkerStatesOptions states)
	{
		this.states = states;
		return (T) this;
	}

	public Boolean getStickyTracking()
	{
		return stickyTracking;
	}

	public <T extends AbstractSeries<V, E>> T setStickyTracking(Boolean stickyTracking)
	{
		this.stickyTracking = stickyTracking;
		return (T) this;
	}

	public Boolean getVisible()
	{
		return visible;
	}

	public <T extends AbstractSeries<V, E>> T setVisible(Boolean visible)
	{
		this.visible = visible;
		return (T) this;
	}

	public Number getzIndex()
	{
		return zIndex;
	}

	public <T extends AbstractSeries<V, E>> T setzIndex(Number zIndex)
	{
		this.zIndex = zIndex;
		return (T) this;
	}
}
