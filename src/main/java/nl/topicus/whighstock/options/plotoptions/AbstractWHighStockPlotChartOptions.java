package nl.topicus.whighstock.options.plotoptions;

import nl.topicus.whighcharts.options.plotoptions.AbstractWHighChartPlotChartOptions;
import nl.topicus.whighstock.options.point.WHighStockPointOptions;
import nl.topicus.whighstock.options.series.datagrouping.WHighStockDatagroupingOptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public abstract class AbstractWHighStockPlotChartOptions<T extends AbstractWHighChartPlotChartOptions<T>>
		extends AbstractWHighChartPlotChartOptions<T>
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
	private Object tooltip;

	/**
	 * When a series contains a data array that is longer than (T) this, only one
	 * dimensional arrays of numbers, or two dimensional arrays with x and y values are
	 * allowed. Also, only the first point is tested, and the rest are assumed to be the
	 * same format. (T) this saves expensive data checking and indexing in long series.
	 * 
	 * Defaults to 1000.
	 */
	private Number turboThreshold;

	public String getCompare()
	{
		return compare;
	}

	public T setCompare(String compare)
	{
		this.compare = compare;
		return (T) this;
	}

	public Number getCropThreshold()
	{
		return cropThreshold;
	}

	public T setCropThreshold(Number cropThreshold)
	{
		this.cropThreshold = cropThreshold;
		return (T) this;
	}

	public WHighStockDatagroupingOptions getDataGrouping()
	{
		return dataGrouping;
	}

	public T setDataGrouping(WHighStockDatagroupingOptions dataGrouping)
	{
		this.dataGrouping = dataGrouping;
		return (T) this;
	}

	public Number getGapSize()
	{
		return gapSize;
	}

	public T setGapSize(Number gapSize)
	{
		this.gapSize = gapSize;
		return (T) this;
	}

	public Number getLegendIndex()
	{
		return legendIndex;
	}

	public T setLegendIndex(Number legendIndex)
	{
		this.legendIndex = legendIndex;
		return (T) this;
	}

	@Override
	public WHighStockPointOptions getPoint()
	{
		return point;
	}

	public T setPoint(WHighStockPointOptions point)
	{
		this.point = point;
		return (T) this;
	}

	public Number getPointRange()
	{
		return pointRange;
	}

	public T setPointRange(Number pointRange)
	{
		this.pointRange = pointRange;
		return (T) this;
	}

	public Object getTooltip()
	{
		return tooltip;
	}

	public T setTooltip(Object tooltip)
	{
		this.tooltip = tooltip;
		return (T) this;
	}

	public Number getTurboThreshold()
	{
		return turboThreshold;
	}

	public T setTurboThreshold(Number turboThreshold)
	{
		this.turboThreshold = turboThreshold;
		return (T) this;
	}

}
