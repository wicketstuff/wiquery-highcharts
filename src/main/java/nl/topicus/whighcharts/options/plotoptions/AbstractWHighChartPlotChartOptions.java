package nl.topicus.whighcharts.options.plotoptions;

import java.io.Serializable;

import nl.topicus.whighcharts.options.chart.WHighChartChartEventsOptions;
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
public class AbstractWHighChartPlotChartOptions<T extends AbstractWHighChartPlotChartOptions<T>>
		implements Serializable
{
	private static final long serialVersionUID = 1L;

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

	public WHighChartsDataLabelsOptions getDataLabels()
	{
		if (dataLabels == null)
		{
			dataLabels = new WHighChartsDataLabelsOptions();
		}
		return dataLabels;
	}

	@SuppressWarnings("unchecked")
	public T setDataLabels(WHighChartsDataLabelsOptions dataLabels)
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
		{
			events = new WHighChartChartEventsOptions();
		}
		return events;
	}

	@SuppressWarnings("unchecked")
	public T setEvents(WHighChartChartEventsOptions events)
	{
		this.events = events;
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

	public WHighChartMarkerOptions getMarker()
	{
		if (marker == null)
		{
			marker = new WHighChartMarkerOptions();
		}
		return marker;
	}

	@SuppressWarnings("unchecked")
	public T setMarker(WHighChartMarkerOptions marker)
	{
		this.marker = marker;
		return (T) this;
	}

	public WHighChartPointOptions getPoint()
	{
		if (point == null)
		{
			point = new WHighChartPointOptions();
		}
		return point;
	}

	@SuppressWarnings("unchecked")
	public T setPoint(WHighChartPointOptions point)
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

	public WHighChartMarkerStatesOptions getStates()
	{
		if (states == null)
		{
			states = new WHighChartMarkerStatesOptions();
		}
		return states;
	}

	@SuppressWarnings("unchecked")
	public T setStates(WHighChartMarkerStatesOptions states)
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
