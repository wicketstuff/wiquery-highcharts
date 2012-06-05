/**
 * 
 */
package nl.topicus.whighstock.options.series;

import nl.topicus.whighcharts.options.chart.IChartOptionsType;
import nl.topicus.whighcharts.options.series.AbstractSeries;
import nl.topicus.whighcharts.options.series.ISeriesEntry;
import nl.topicus.whighstock.options.point.WHighStockPointOptions;
import nl.topicus.whighstock.options.series.datagrouping.WHighStockDatagroupingOptions;
import nl.topicus.whighstock.options.tooltip.WHighStockTooltipOptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * The actual series to append to the chart. In addition to the members listed below, any
 * member of the plotOptions for that specific type of plot can be added to a series
 * individually. For example, even though a general lineWidth is specified in
 * plotOptions.series, an individual lineWidth can be specified for each series.
 * 
 * @author remcozigterman
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class AbstractWHighStockSeriesOptions<V, E extends ISeriesEntry<V>> extends
		AbstractSeries<V, E>
{
	private static final long serialVersionUID = 1L;

	/**
	 * Compare the values of the series against the first value in the visible range. The
	 * y axis will show percentage or absolute change depending on whether compare is set
	 * to "percent" or "value". When (T) this is applied to multiple series, it allows
	 * comparing the development of the series against eachother.
	 * 
	 * Defaults to undefined.
	 */
	private String compare;

	/**
	 * When the series contains less points than the crop threshold, all points are drawn,
	 * event if the points fall outside the visible plot area at the current zoom. The
	 * advantage of drawing all points (including markers and columns), is that animation
	 * is performed on updates. On the other hand, when the series contains more points
	 * than the crop threshold, the series data is cropped to only contain points that
	 * fall within the plot area. The advantage of cropping away invisible points is to
	 * increase performance on large series.
	 * 
	 * Defaults to 300.
	 */
	private Number cropThreshold;

	/**
	 * Options for data grouping in long series
	 */
	private WHighStockDatagroupingOptions dataGrouping;

	/**
	 * <p>
	 * Defines when to display a gap in the graph. A gap size of 5 means that if the
	 * distance between two points is greater than five times that of the two closest
	 * points, the graph will be broken.
	 * </p>
	 * 
	 * <p>
	 * In practice, (T) this option is most often used to visualize gaps in time series.
	 * In a stock chart, intraday data is available for daytime hours, while gaps will
	 * appear in nights and weekends.
	 * </p>
	 * 
	 * <p>
	 * Defaults to 5.
	 * </p>
	 */
	private Number gapSize;

	/**
	 * The sequential index of the series within the legend.
	 * 
	 * Defaults to 0.
	 */
	private Number legendIndex;

	private WHighStockPointOptions point;

	/**
	 * The width of each point on the x axis. For example in a column chart with one value
	 * each day, the pointRange would be 1 day (= 24 * 3600 * 1000 milliseconds). (T) this
	 * is normally computed automatically, but (T) this option can be used to override the
	 * automatic value.
	 * 
	 * Defaults to 0.
	 */
	private Number pointRange;

	/**
	 * A configuration object for the tooltip rendering of each single series. Properties
	 * are inherited from #tooltip. Overridable properties are headerFormat, pointFormat,
	 * yDecimals, xDateFormat, yPrefix and ySuffix.
	 * 
	 * Defaults to {}.
	 */
	private WHighStockTooltipOptions tooltip;

	/**
	 * When a series contains a data array that is longer than (T) this, only one
	 * dimensional arrays of numbers, or two dimensional arrays with x and y values are
	 * allowed. Also, only the first point is tested, and the rest are assumed to be the
	 * same format. (T) this saves expensive data checking and indexing in long series.
	 * 
	 * Defaults to 1000.
	 */
	private Number turboThreshold;

	/**
	 * The type of series. Can be one of area, areaspline, bar, column, line, pie,
	 * scatter, spline, candlestick or ohlc.
	 * 
	 * Defaults to "line".
	 */
	private WHighStockSerieType type;

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

	private String id;

	@Override
	public IChartOptionsType getType()
	{
		return type;
	}

	@Override
	public <T extends AbstractSeries<V, E>> T setType(IChartOptionsType type)
	{
		if (type instanceof WHighStockSerieType)
			this.type = (WHighStockSerieType) type;
		else
			throw new RuntimeException("Wrong type for HighStock");
		return (T) this;
	}

	public WHighStockTooltipOptions getTooltip()
	{
		if (tooltip == null)
			return new WHighStockTooltipOptions();
		return tooltip;
	}

	public <T extends AbstractSeries<V, E>> T setTooltip(WHighStockTooltipOptions tooltip)
	{
		this.tooltip = tooltip;

		return (T) this;
	}

	public WHighStockDatagroupingOptions getDataGrouping()
	{
		if (dataGrouping == null)
			dataGrouping = new WHighStockDatagroupingOptions();
		return dataGrouping;
	}

	public <T extends AbstractSeries<V, E>> T setDataGrouping(
			WHighStockDatagroupingOptions dataGrouping)
	{
		this.dataGrouping = dataGrouping;

		return (T) this;
	}

	@Override
	public Number getPointStart()
	{
		return pointStart;
	}

	@Override
	public <T extends AbstractSeries<V, E>> T setPointStart(Number pointStart)
	{
		this.pointStart = pointStart;
		return (T) this;
	}

	@Override
	public Number getPointInterval()
	{
		return pointInterval;
	}

	@Override
	public <T extends AbstractSeries<V, E>> T setPointInterval(Number pointInterval)
	{
		this.pointInterval = pointInterval;
		return (T) this;
	}

	@Override
	public String getId()
	{
		return id;
	}

	@Override
	public <T extends AbstractSeries<V, E>> T setId(String id)
	{
		this.id = id;
		return (T) this;
	}

	public String getCompare()
	{
		return compare;
	}

	public <T extends AbstractSeries<V, E>> T setCompare(String compare)
	{
		this.compare = compare;
		return (T) this;
	}

	public Number getCropThreshold()
	{
		return cropThreshold;
	}

	public <T extends AbstractSeries<V, E>> T setCropThreshold(Number cropThreshold)
	{
		this.cropThreshold = cropThreshold;
		return (T) this;
	}

	public Number getGapSize()
	{
		return gapSize;
	}

	public <T extends AbstractSeries<V, E>> T setGapSize(Number gapSize)
	{
		this.gapSize = gapSize;
		return (T) this;
	}

	@Override
	public Number getLegendIndex()
	{
		return legendIndex;
	}

	@Override
	public <T extends AbstractSeries<V, E>> T setLegendIndex(Number legendIndex)
	{
		this.legendIndex = legendIndex;
		return (T) this;
	}

	@Override
	public WHighStockPointOptions getPoint()
	{
		return point;
	}

	public <T extends AbstractSeries<V, E>> T setPoint(WHighStockPointOptions point)
	{
		this.point = point;
		return (T) this;
	}

	public Number getPointRange()
	{
		return pointRange;
	}

	public <T extends AbstractSeries<V, E>> T setPointRange(Number pointRange)
	{
		this.pointRange = pointRange;
		return (T) this;
	}

	public Number getTurboThreshold()
	{
		return turboThreshold;
	}

	public <T extends AbstractSeries<V, E>> T setTurboThreshold(Number turboThreshold)
	{
		this.turboThreshold = turboThreshold;
		return (T) this;
	}

	public <T extends AbstractSeries<V, E>> T setType(WHighStockSerieType type)
	{
		this.type = type;
		return (T) this;
	}

}
