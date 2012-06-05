package nl.topicus.whighcharts.options.axis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import nl.topicus.whighcharts.options.plotoptions.WHighChartPlotDashStyleType;
import nl.topicus.whighcharts.options.title.WHighChartTitleOptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartAxisOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Whether to allow decimals in this axis' ticks. When counting integers, like persons
	 * or hits on a web page, decimals must be aWHighChartAxisOptionsed in the axis tick
	 * labels.
	 * 
	 * Defaults to true.
	 */
	private Boolean allowDecimals;

	/**
	 * When using an alternate grid color, a band is painted across the plot area between
	 * every other grid line.
	 * 
	 * Defaults to null.
	 */
	private String alternateGridColor;

	/**
	 * If categories are present for the xAxis, names are used instead of numbers for that
	 * axis. WHighChart note: When no categories are set here, WHighChart will check if
	 * its model implements {@link IWHighChartAxisCategoriesProvider}.
	 */
	private List<String> categories;

	/**
	 * For a datetime axis, the scale will automatically adjust to the appropriate unit.
	 * This member gives the default string representations used for each unit. For an
	 * overview of the replacement codes, see dateFormat. Defaults to:
	 * 
	 * <pre>
	 * {
	 * 	second: '%H:%M:%S',
	 * 	minute: '%H:%M',
	 * 	hour: '%H:%M',
	 * 	day: '%e. %b',
	 * 	week: '%e. %b',
	 * 	month: '%b \'%y',
	 * 	year: '%Y'
	 * }
	 * </pre>
	 */
	private WHighChartAxisDateTimeLabelFormats dateTimeLabelFormats;

	/**
	 * Whether to force the axis to end on a tick. Use this option with the maxPadding
	 * option to control the axis end.
	 * 
	 * Defaults to false.
	 */
	private Boolean endOnTick;

	/**
	 * Color of the grid lines extending the ticks across the plot area.
	 * 
	 * Defaults to "#C0C0C0".
	 */
	private String gridLineColor;

	/**
	 * The dash or dot style of the grid lines.
	 * 
	 * Defaults to Solid.
	 */
	private WHighChartPlotDashStyleType gridLineDashStyle;

	/**
	 * The width of the grid lines extending the ticks across the plot area.
	 * 
	 * Defaults to 0.
	 */
	private Number gridLineWidth;

	/**
	 * An id for the axis. This can be used after render time to get a pointer to the axis
	 * object through chart.get().
	 * 
	 * Defaults to null.
	 */
	private String id;

	/**
	 * Configuration object for the axis labels, usually displaying the number for each
	 * tick.
	 */
	private WHighChartAxisLabelsOptions labels;

	/**
	 * The color of the line marking the axis itself.
	 * 
	 * Defaults to "#C0D0E0".
	 */
	private String lineColor;

	/**
	 * The width of the line marking the axis itself.
	 * 
	 * Defaults to 1.
	 */
	private Number lineWidth;

	/**
	 * Index of another axis that this axis is linked to. When an axis is linked to a
	 * master axis, it will take the same extremes as the master, but as assigned by min
	 * or max or by setExtremes. It can be used to show additional info, or to ease
	 * reading the chart by duplicating the scales.
	 * 
	 * Defaults to null.
	 */
	private Number linkedTo;

	/**
	 * The maximum value of the axis. If null, the max value is automatically calculated.
	 * If the endOnTick option is true, the max value might be rounded up. The actual
	 * maximum value is also influenced by chart.alignTicks.
	 * 
	 * Defaults to null.
	 */
	private Number max;

	/**
	 * Padding of the max value relative to the length of the axis. A padding of 0.05 will
	 * make a 100px axis 5px longer. This is useful when you don't want the highest data
	 * value to appear on the edge of the plot area. When the axis' max option is set or a
	 * max extreme is set using axis.setExtremes(), the maxPadding will be ignored.
	 * 
	 * Defaults to 0.01.
	 */
	private Number maxPadding;

	/**
	 * The maximum amount of zoom on this axis. The entire axis will not be allowed to
	 * span over a smaller interval than this. For example, for a datetime axis the main
	 * unit is milliseconds. If maxZoom is set to 3600000, you can't zoom in more than to
	 * one hour.
	 * 
	 * Since 2.1, the default maxZoom for the x axis is five times the smallest interval
	 * between any of the data points.
	 */
	private Number maxZoom;

	/**
	 * The minimum value of the axis. If null the min value is automatically calculated.
	 * If the startOnTick option is true, the min value might be rounded down.
	 * 
	 * Defaults to null.
	 */
	private Number min;

	/**
	 * Color of the minor, secondary grid lines.
	 * 
	 * Defaults to #E0E0E0.
	 */
	private String minorGridLineColor;

	/**
	 * The dash or dot style of the minor grid lines.
	 * 
	 * Defaults to Solid.
	 */
	private WHighChartPlotDashStyleType minorGridLineDashStyle;

	/**
	 * Width of the minor, secondary grid lines.
	 * 
	 * Defaults to 1.
	 */
	private Number minorGridLineWidth;

	/**
	 * Color for the minor tick marks.
	 * 
	 * Defaults to #A0A0A0.
	 */
	private String minorTickColor;

	/**
	 * Tick interval in scale units for the minor ticks. If "auto", the minor tick
	 * interval is calculated as a fifth of the tickInterval. If null, minor ticks are not
	 * shown.
	 * 
	 * Defaults to null.
	 */
	private Number minorTickInterval;

	/**
	 * The pixel length of the minor tick marks.
	 * 
	 * Defaults to 2.
	 */
	private Number minorTickLength;

	/**
	 * The position of the minor tick marks relative to the axis line. Can be one of
	 * inside and outside.
	 * 
	 * Defaults to outside.
	 */
	private WHighChartsTickPosition minorTickPosition;

	/**
	 * The pixel width of the minor tick mark.
	 * 
	 * Defaults to 0.
	 */
	private Number minorTickWidth;

	/**
	 * Padding of the min value relative to the length of the axis. A padding of 0.05 will
	 * make a 100px axis 5px longer. This is useful when you don't want the lowest data
	 * value to appear on the edge of the plot area. When the axis' min option is set or a
	 * min extreme is set using axis.setExtremes(), the minPadding will be ignored.
	 * 
	 * Defaults to 0.01.
	 */
	private Number minPadding;

	/**
	 * The distance in pixels from the plot area to the axis line. A positive offset moves
	 * the axis with it's line, labels and ticks away from the plot area. This is
	 * typically used when two or more axes are displayed on the same side of the plot.
	 * 
	 * Defaults to 0.
	 */
	private Number offset;

	/**
	 * Whether to display the axis on the opposite side of the normal. The normal is on
	 * the left side for vertical axes and bottom for horizontal, so the opposite sides
	 * will be right and top respectively. This is typically used with dual or multiple
	 * axes.
	 * 
	 * Defaults to false.
	 */
	private Boolean opposite;

	/**
	 * An array of configuration objects for plot bands colouring parts of the plot area
	 * background.
	 * 
	 * Defaults to null.
	 */
	private List<WHighChartAxisPlotBandsOptions> plotBands;

	/**
	 * An array of configuration objects for plot lines marking specific values in the
	 * plot area.
	 * 
	 * Defaults to null.
	 */
	private List<WHighChartAxisPlotLinesOptions> plotLines;

	/**
	 * An array of configuration objects for plot lines marking specific values in the
	 * plot area.
	 * 
	 * Defaults to null.
	 */
	private Boolean reversed;

	/**
	 * Whether to show the first tick label.
	 * 
	 * Defaults to true.
	 */
	private Boolean showFirstLabel;

	/**
	 * Whether to show the last tick label.
	 * 
	 * Defaults to false.
	 */
	private Boolean showLastLabel;

	/**
	 * For datetime axes, this decides where to put the tick between weeks. 0 = Sunday, 1
	 * = Monday.
	 * 
	 * Defaults to 1.
	 */
	private Number startOfWeek;

	/**
	 * Whether to force the axis to start on a tick. Use this option with the maxPadding
	 * option to control the axis start.
	 * 
	 * Defaults to false.
	 */
	private Boolean startOnTick;

	/**
	 * Color for the main tick marks.
	 * 
	 * Defaults to #C0D0E0.
	 */
	private String tickColor;

	/**
	 * The interval of the tick marks in axis units. When null, the tick interval is
	 * computed to approximately follow the tickPixelInterval on linear and datetime axes.
	 * On categorized axes, a null tickInterval will default to 1, one category. Note that
	 * datetime axes are based on milliseconds, so for example an interval of one day is
	 * expressed as 24 * 3600 * 1000.
	 * 
	 * Defaults to null.
	 */
	private Number tickInterval;

	/**
	 * The pixel length of the main tick marks.
	 * 
	 * Defaults to 5.
	 */
	private Number tickLength;

	/**
	 * For categorized axes only. If "on" the tick mark is placed in the center of the
	 * category, if "between" the tick mark is placed between categories.
	 * 
	 * Defaults to "between".
	 */
	private String tickmarkPlacement;

	/**
	 * If tickInterval is null this option sets the approximate pixel interval of the tick
	 * marks. Not applicable to categorized axis.
	 * 
	 * Defaults to 72 for the Y axis and 100 for the X axis.
	 */
	private Number tickPixelInterval;

	/**
	 * The position of the major tick marks relative to the axis line. Can be one of
	 * inside and outside.
	 * 
	 * Defaults to "outside".
	 */
	private WHighChartsTickPosition tickPosition;

	/**
	 * The pixel width of the major tick marks.
	 * 
	 * Defaults to 1.
	 */
	private Number tickWidth;

	/**
	 * Configuration object for the axis title.
	 */
	private WHighChartTitleOptions title;

	/**
	 * The type of axis. Can be one of "linear" or "datetime". In a datetime axis, the
	 * numbers are given in milliseconds, and tick marks are placed on appropriate values
	 * like full hours or days. As of 2.1.6, "logarithmic" is added as an experimental
	 * feature, but it is not yet fully implemented.
	 * 
	 * Defaults to "linear".
	 */
	private WHighChartAxisType type;

	public Boolean getAllowDecimals()
	{
		return allowDecimals;
	}

	public WHighChartAxisOptions setAllowDecimals(Boolean allowDecimals)
	{
		this.allowDecimals = allowDecimals;
		return this;
	}

	public String getAlternateGridColor()
	{
		return alternateGridColor;
	}

	public WHighChartAxisOptions setAlternateGridColor(String alternateGridColor)
	{
		this.alternateGridColor = alternateGridColor;
		return this;
	}

	public List<String> getCategories()
	{
		if (categories == null)
			categories = new ArrayList<String>();
		return categories;
	}

	public WHighChartAxisOptions setCategories(List<String> categories)
	{
		this.categories = categories;
		return this;
	}

	public WHighChartAxisOptions setCategories(String... values)
	{
		categories = Arrays.asList(values);
		return this;
	}

	public WHighChartAxisDateTimeLabelFormats getDateTimeLabelFormats()
	{
		if (dateTimeLabelFormats == null)
			dateTimeLabelFormats = new WHighChartAxisDateTimeLabelFormats();
		return dateTimeLabelFormats;
	}

	public WHighChartAxisOptions setDateTimeLabelFormats(
			WHighChartAxisDateTimeLabelFormats dateTimeLabelFormats)
	{
		this.dateTimeLabelFormats = dateTimeLabelFormats;
		return this;
	}

	public Boolean getEndOnTick()
	{
		return endOnTick;
	}

	public WHighChartAxisOptions setEndOnTick(Boolean endOnTick)
	{
		this.endOnTick = endOnTick;
		return this;
	}

	public String getGridLineColor()
	{
		return gridLineColor;
	}

	public WHighChartAxisOptions setGridLineColor(String gridLineColor)
	{
		this.gridLineColor = gridLineColor;
		return this;
	}

	public WHighChartPlotDashStyleType getGridLineDashStyle()
	{
		return gridLineDashStyle;
	}

	public WHighChartAxisOptions setGridLineDashStyle(WHighChartPlotDashStyleType gridLineDashStyle)
	{
		this.gridLineDashStyle = gridLineDashStyle;
		return this;
	}

	public Number getGridLineWidth()
	{
		return gridLineWidth;
	}

	public WHighChartAxisOptions setGridLineWidth(Number gridLineWidth)
	{
		this.gridLineWidth = gridLineWidth;
		return this;
	}

	public String getId()
	{
		return id;
	}

	public WHighChartAxisOptions setId(String id)
	{
		this.id = id;
		return this;
	}

	public WHighChartAxisLabelsOptions getLabels()
	{
		if (labels == null)
			labels = new WHighChartAxisLabelsOptions();
		return labels;
	}

	public WHighChartAxisOptions setLabels(WHighChartAxisLabelsOptions labels)
	{
		this.labels = labels;
		return this;
	}

	public String getLineColor()
	{
		return lineColor;
	}

	public WHighChartAxisOptions setLineColor(String lineColor)
	{
		this.lineColor = lineColor;
		return this;
	}

	public Number getLineWidth()
	{
		return lineWidth;
	}

	public WHighChartAxisOptions setLineWidth(Number lineWidth)
	{
		this.lineWidth = lineWidth;
		return this;
	}

	public Number getLinkedTo()
	{
		return linkedTo;
	}

	public WHighChartAxisOptions setLinkedTo(Number linkedTo)
	{
		this.linkedTo = linkedTo;
		return this;
	}

	public Number getMax()
	{
		return max;
	}

	public WHighChartAxisOptions setMax(Number max)
	{
		this.max = max;
		return this;
	}

	public Number getMaxPadding()
	{
		return maxPadding;
	}

	public WHighChartAxisOptions setMaxPadding(Number maxPadding)
	{
		this.maxPadding = maxPadding;
		return this;
	}

	public Number getMaxZoom()
	{
		return maxZoom;
	}

	public WHighChartAxisOptions setMaxZoom(Number maxZoom)
	{
		this.maxZoom = maxZoom;
		return this;
	}

	public Number getMin()
	{
		return min;
	}

	public WHighChartAxisOptions setMin(Number min)
	{
		this.min = min;
		return this;
	}

	public String getMinorGridLineColor()
	{
		return minorGridLineColor;
	}

	public WHighChartAxisOptions setMinorGridLineColor(String minorGridLineColor)
	{
		this.minorGridLineColor = minorGridLineColor;
		return this;
	}

	public WHighChartPlotDashStyleType getMinorGridLineDashStyle()
	{
		return minorGridLineDashStyle;
	}

	public WHighChartAxisOptions setMinorGridLineDashStyle(
			WHighChartPlotDashStyleType minorGridLineDashStyle)
	{
		this.minorGridLineDashStyle = minorGridLineDashStyle;
		return this;
	}

	public Number getMinorGridLineWidth()
	{
		return minorGridLineWidth;
	}

	public WHighChartAxisOptions setMinorGridLineWidth(Number minorGridLineWidth)
	{
		this.minorGridLineWidth = minorGridLineWidth;
		return this;
	}

	public String getMinorTickColor()
	{
		return minorTickColor;
	}

	public WHighChartAxisOptions setMinorTickColor(String minorTickColor)
	{
		this.minorTickColor = minorTickColor;
		return this;
	}

	public Number getMinorTickInterval()
	{
		return minorTickInterval;
	}

	public WHighChartAxisOptions setMinorTickInterval(Number minorTickInterval)
	{
		this.minorTickInterval = minorTickInterval;
		return this;
	}

	public Number getMinorTickLength()
	{
		return minorTickLength;
	}

	public WHighChartAxisOptions setMinorTickLength(Number minorTickLength)
	{
		this.minorTickLength = minorTickLength;
		return this;
	}

	public WHighChartsTickPosition getMinorTickPosition()
	{
		return minorTickPosition;
	}

	public WHighChartAxisOptions setMinorTickPosition(WHighChartsTickPosition minorTickPosition)
	{
		this.minorTickPosition = minorTickPosition;
		return this;
	}

	public Number getMinorTickWidth()
	{
		return minorTickWidth;
	}

	public WHighChartAxisOptions setMinorTickWidth(Number minorTickWidth)
	{
		this.minorTickWidth = minorTickWidth;
		return this;
	}

	public Number getMinPadding()
	{
		return minPadding;
	}

	public WHighChartAxisOptions setMinPadding(Number minPadding)
	{
		this.minPadding = minPadding;
		return this;
	}

	public Number getOffset()
	{
		return offset;
	}

	public WHighChartAxisOptions setOffset(Number offset)
	{
		this.offset = offset;
		return this;
	}

	public Boolean getOpposite()
	{
		return opposite;
	}

	public WHighChartAxisOptions setOpposite(Boolean opposite)
	{
		this.opposite = opposite;
		return this;
	}

	public List<WHighChartAxisPlotBandsOptions> getPlotBands()
	{
		if (plotBands == null)
			plotBands = new ArrayList<WHighChartAxisPlotBandsOptions>();
		return plotBands;
	}

	public WHighChartAxisOptions addPlotBand(WHighChartAxisPlotBandsOptions plotBand)
	{
		getPlotBands().add(plotBand);
		return this;
	}

	public WHighChartAxisOptions setPlotBands(List<WHighChartAxisPlotBandsOptions> plotBands)
	{
		this.plotBands = plotBands;
		return this;
	}

	public List<WHighChartAxisPlotLinesOptions> getPlotLines()
	{
		if (plotLines == null)
			plotLines = new ArrayList<WHighChartAxisPlotLinesOptions>();
		return plotLines;
	}

	public WHighChartAxisOptions addPlotLine(WHighChartAxisPlotLinesOptions plotLine)
	{
		getPlotLines().add(plotLine);
		return this;
	}

	public WHighChartAxisOptions setPlotLines(List<WHighChartAxisPlotLinesOptions> plotLines)
	{
		this.plotLines = plotLines;
		return this;
	}

	public Boolean getReversed()
	{
		return reversed;
	}

	public WHighChartAxisOptions setReversed(Boolean reversed)
	{
		this.reversed = reversed;
		return this;
	}

	public Boolean getShowFirstLabel()
	{
		return showFirstLabel;
	}

	public WHighChartAxisOptions setShowFirstLabel(Boolean showFirstLabel)
	{
		this.showFirstLabel = showFirstLabel;
		return this;
	}

	public Boolean getShowLastLabel()
	{
		return showLastLabel;
	}

	public WHighChartAxisOptions setShowLastLabel(Boolean showLastLabel)
	{
		this.showLastLabel = showLastLabel;
		return this;
	}

	public Number getStartOfWeek()
	{
		return startOfWeek;
	}

	public WHighChartAxisOptions setStartOfWeek(Number startOfWeek)
	{
		this.startOfWeek = startOfWeek;
		return this;
	}

	public Boolean getStartOnTick()
	{
		return startOnTick;
	}

	public WHighChartAxisOptions setStartOnTick(Boolean startOnTick)
	{
		this.startOnTick = startOnTick;
		return this;
	}

	public String getTickColor()
	{
		return tickColor;
	}

	public WHighChartAxisOptions setTickColor(String tickColor)
	{
		this.tickColor = tickColor;
		return this;
	}

	public Number getTickInterval()
	{
		return tickInterval;
	}

	public WHighChartAxisOptions setTickInterval(Number tickInterval)
	{
		this.tickInterval = tickInterval;
		return this;
	}

	public Number getTickLength()
	{
		return tickLength;
	}

	public WHighChartAxisOptions setTickLength(Number tickLength)
	{
		this.tickLength = tickLength;
		return this;
	}

	public String getTickmarkPlacement()
	{
		return tickmarkPlacement;
	}

	public WHighChartAxisOptions setTickmarkPlacement(String tickmarkPlacement)
	{
		this.tickmarkPlacement = tickmarkPlacement;
		return this;
	}

	public Number getTickPixelInterval()
	{
		return tickPixelInterval;
	}

	public WHighChartAxisOptions setTickPixelInterval(Number tickPixelInterval)
	{
		this.tickPixelInterval = tickPixelInterval;
		return this;
	}

	public WHighChartsTickPosition getTickPosition()
	{
		return tickPosition;
	}

	public WHighChartAxisOptions setTickPosition(WHighChartsTickPosition tickPosition)
	{
		this.tickPosition = tickPosition;
		return this;
	}

	public Number getTickWidth()
	{
		return tickWidth;
	}

	public WHighChartAxisOptions setTickWidth(Number tickWidth)
	{
		this.tickWidth = tickWidth;
		return this;
	}

	public WHighChartTitleOptions getTitle()
	{
		if (title == null)
			title = new WHighChartTitleOptions();
		return title;
	}

	public WHighChartAxisOptions setTitle(WHighChartTitleOptions title)
	{
		this.title = title;
		return this;
	}

	public WHighChartAxisType getType()
	{
		return type;
	}

	public WHighChartAxisOptions setType(WHighChartAxisType type)
	{
		this.type = type;
		return this;
	}

}
