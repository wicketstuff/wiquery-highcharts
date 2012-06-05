package nl.topicus.whighstock.options.series.datagrouping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockDatagroupingOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * <p>
	 * The method of approximation inside a group. When for example 30 days are grouped
	 * into one month, this determines what value should represent the group. Possible
	 * values are "average", "open", "high", "low", "close" and "sum". For OHLC and
	 * candlestick series the approximation is "ohlc" by default, which finds the open,
	 * high, low and close values within all the grouped data.
	 * </p>
	 * 
	 * <p>
	 * Custom aggregate methods can be added by assigning a callback function as the
	 * approximation. This function takes a numeric array as the argument and should
	 * return a single numeric value or null. Note that the numeric array will never
	 * contain null values, only true numbers. Instead, if null values are present in the
	 * raw data, the numeric array will have an .hasNulls property set to true. For
	 * single-value data sets the data is available in the first argument of the callback
	 * function. For OHLC data sets, all the open values are in the first argument, all
	 * high values in the second etc.
	 * </p>
	 * 
	 * <p>
	 * Defaults to "average".
	 * </p>
	 */
	private WHighStockDatagroupingApproximation approximation;

	/**
	 * Enable or disable data grouping.
	 * 
	 * Defaults to true.
	 */
	private Boolean enabled;

	/**
	 * When data grouping is forced, it runs no matter how small the intervals are. This
	 * can be handy for example when the sum should be calculated for values appearing at
	 * random times within each hour.
	 * 
	 * Defaults to false.
	 */
	private Boolean forced;

	/**
	 * The approximate pixel width of each group. If for example a series with 30 points
	 * is displayed over a 600 pixel wide plot area, no grouping is performed. If however
	 * the series contains so many points that the spacing is less than the
	 * groupPixelWidth, Highcharts will try to group it into appropriate groups so that
	 * each is more or less two pixels wide. If multiple series with different group pixel
	 * widths are drawn on the same x axis, all series will take the greatest width. For
	 * example, line series have 2px default group width, while column series have 10px.
	 * If combined, both the line and the column will have 10px by default.
	 * 
	 * Defaults to 2.
	 */
	private Number groupPixelWidth;

	/**
	 * Normally, a group is indexed by the start of that group, so for example when 30
	 * daily values are grouped into one month, that month's x value will be the 1st of
	 * the month. This apparently shifts the data to the left. When the smoothed option is
	 * true, this is compensated for. The data is shifted to the middle of the group, and
	 * min and max values are preserved. Internally, this is used in the Navigator series.
	 * 
	 * Defaults to false.
	 */
	private Boolean smoothed;

	/**
	 * An array determining what time intervals the data is allowed to be grouped to. Each
	 * array item is an array where the first value is the time unit and the second value
	 * another array of allowed multiples.
	 * 
	 * Defaults to:
	 * 
	 * <pre>
	 * units: [[
	 * 	'millisecond', // unit name
	 * 	[1, 2, 5, 10, 20, 25, 50, 100, 200, 500] // allowed multiples
	 * ], [
	 * 	'second',
	 * 	[1, 2, 5, 10, 15, 30]
	 * ], [
	 * 	'minute',
	 * 	[1, 2, 5, 10, 15, 30]
	 * ], [
	 * 	'hour',
	 * 	[1, 2, 3, 4, 6, 8, 12]
	 * ], [
	 * 	'day',
	 * 	[1]
	 * ], [
	 * 	'week',
	 * 	[1]
	 * ], [
	 * 	'month',
	 * 	[1, 3, 6]
	 * ], [
	 * 	'year',
	 * 	null
	 * ]]
	 * </pre>
	 */
	private List<WHighStockGroupingUnitOptions> units;

	public WHighStockDatagroupingApproximation getApproximation()
	{
		return approximation;
	}

	public WHighStockDatagroupingOptions setApproximation(
			WHighStockDatagroupingApproximation approximation)
	{
		this.approximation = approximation;
		return this;
	}

	public Boolean getEnabled()
	{
		return enabled;
	}

	public WHighStockDatagroupingOptions setEnabled(Boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}

	public Boolean getForced()
	{
		return forced;
	}

	public WHighStockDatagroupingOptions setForced(Boolean forced)
	{
		this.forced = forced;
		return this;
	}

	public Number getGroupPixelWidth()
	{
		return groupPixelWidth;
	}

	public WHighStockDatagroupingOptions setGroupPixelWidth(Number groupPixelWidth)
	{
		this.groupPixelWidth = groupPixelWidth;
		return this;
	}

	public Boolean getSmoothed()
	{
		return smoothed;
	}

	public WHighStockDatagroupingOptions setSmoothed(Boolean smoothed)
	{
		this.smoothed = smoothed;
		return this;
	}

	public List<WHighStockGroupingUnitOptions> getUnits()
	{
		if (units == null)
			units = new ArrayList<WHighStockGroupingUnitOptions>();
		return units;
	}

	public WHighStockDatagroupingOptions setUnits(List<WHighStockGroupingUnitOptions> units)
	{
		this.units = units;
		return this;
	}

}
