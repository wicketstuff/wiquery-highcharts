/**
 * 
 */
package nl.topicus.whighstock.options.yaxis;

import nl.topicus.whighcharts.options.axis.WHighChartAxisOptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * The X axis or category axis. Normally this is the horizontal axis, though if the chart
 * is inverted this is the vertical axis. In case of multiple axes, the xAxis node is an
 * array of configuration objects.
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockAxisOptions extends WHighChartAxisOptions
{
	/** Serial Version UID */
	private static final long serialVersionUID = 1L;

	/**
	 * The Z index of the grid lines.
	 * 
	 * Defaults to 1.
	 */
	private Number gridZIndex;

	/**
	 * The minimum range to display. The entire axis will not be allowed to span over a
	 * smaller interval than this. For example, for a datetime axis the main unit is
	 * milliseconds. If minRange is set to 3600000, you can't zoom in more than to one
	 * hour.
	 */
	private Number minRange;

	/**
	 * In an ordinal axis, the points are equally spaced in the chart regardless of the
	 * actual time or x distance between them. This means that missing data for nights or
	 * weekends will not take up space in the chart.
	 * 
	 * Defaults to true.
	 */
	private Boolean ordinal;

	/**
	 * The zoomed range to display when only defining one or none of min or max. For
	 * example, to show the latest month, a range of one month can be set.
	 * 
	 * Defaults to undefined.
	 */
	private Number range;

	/**
	 * Whether to show the axis line and title when the axis has no data.
	 * 
	 * Defaults to true.
	 */
	private Boolean showEmpty;

	public Number getGridZIndex()
	{
		return gridZIndex;
	}

	public WHighStockAxisOptions setGridZIndex(Number gridZIndex)
	{
		this.gridZIndex = gridZIndex;
		return this;
	}

	public Number getMinRange()
	{
		return minRange;
	}

	public WHighStockAxisOptions setMinRange(Number minRange)
	{
		this.minRange = minRange;
		return this;
	}

	public Boolean getOrdinal()
	{
		return ordinal;
	}

	public WHighStockAxisOptions setOrdinal(Boolean ordinal)
	{
		this.ordinal = ordinal;
		return this;
	}

	public Number getRange()
	{
		return range;
	}

	public WHighStockAxisOptions setRange(Number range)
	{
		this.range = range;
		return this;
	}

	public Boolean getShowEmpty()
	{
		return showEmpty;
	}

	public WHighStockAxisOptions setShowEmpty(Boolean showEmpty)
	{
		this.showEmpty = showEmpty;
		return this;
	}
}
