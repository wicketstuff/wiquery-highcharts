/**
 * 
 */
package nl.topicus.whighstock.options.tooltip;

import nl.topicus.whighcharts.options.tooltip.WHighChartTooltipOptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * Options for the tooltip that appears when the user hovers over a series or point.
 * 
 * @author remcozigterman
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockTooltipOptions extends WHighChartTooltipOptions
{
	private static final long serialVersionUID = 1L;

	/**
	 * How many decimals to show for the point.change value when the series.compare option
	 * is set. This is overridable in each series' tooltip options object.
	 * 
	 * The default is to preserve all decimals.
	 */
	private Number changeDecimals;

	/**
	 * The HTML of the tooltip header line. Variables are enclosed by curly brackets.
	 * Available variables are point.key, series.name and series.color. The point.key
	 * variable contains the category name, x value or datetime string depending on the
	 * type of axis. For datetime axes, the point.key date format can be set using
	 * tooltip.xDateFormat.
	 * 
	 * Defaults to <span style="font-size: 10px">{point.key}</span><br/>
	 */
	private String headerFormat;

	/**
	 * The HTML of the point's line in the tooltip. Variables are enclosed by curly
	 * brackets. Available variables are point.x, point.y, point.change, series.name and
	 * series.color and other properties on the same form. Furthermore, point.y can be
	 * extended by the tooltip.yPrefix and tooltip.ySuffix variables. This can also be
	 * overridden for each series, which makes it a good hook for displaying units.
	 * 
	 * Defaults to <span style="color:{series.color}">{series.name}</span>:
	 * <b>{point.y}</b><br/>
	 */
	private String pointFormat;

	/**
	 * The format for the date in the tooltip header. If data grouping is used, the
	 * default is a smart guess based on how close the closest points are. It is pulled
	 * from the #plotOptions.dataGrouping.dateTimeLabelFormats array.
	 */
	private String xDateFormat;

	/**
	 * How many decimals to show in each series' y value. This is overridable in each
	 * series' tooltip options object.
	 * 
	 * The default is to preserve all decimals.
	 */
	private Number yDecimals;

	/**
	 * A string to prepend to each series' y value. Overridable in each series' tooltip
	 * options object.
	 * 
	 * Defaults to "".
	 */
	private String yPrefix;

	/**
	 * A string to append to each series' y value. Overridable in each series' tooltip
	 * options object.
	 * 
	 * Defaults to "".
	 */
	private String ySuffix;

	public Number getChangeDecimals()
	{
		return changeDecimals;
	}

	public WHighStockTooltipOptions setChangeDecimals(Number changeDecimals)
	{
		this.changeDecimals = changeDecimals;

		return this;
	}

	public String getHeaderFormat()
	{
		return headerFormat;
	}

	public WHighStockTooltipOptions setHeaderFormat(String headerFormat)
	{
		this.headerFormat = headerFormat;

		return this;
	}

	public String getPointFormat()
	{
		return pointFormat;
	}

	public WHighStockTooltipOptions setPointFormat(String pointFormat)
	{
		this.pointFormat = pointFormat;

		return this;
	}

	public String getxDateFormat()
	{
		return xDateFormat;
	}

	public WHighStockTooltipOptions setxDateFormat(String xDateFormat)
	{
		this.xDateFormat = xDateFormat;

		return this;
	}

	public Number getyDecimals()
	{
		return yDecimals;
	}

	public WHighStockTooltipOptions setyDecimals(Number yDecimals)
	{
		this.yDecimals = yDecimals;

		return this;
	}

	public String getyPrefix()
	{
		return yPrefix;
	}

	public WHighStockTooltipOptions setyPrefix(String yPrefix)
	{
		this.yPrefix = yPrefix;

		return this;
	}

	public String getySuffix()
	{
		return ySuffix;
	}

	public WHighStockTooltipOptions setySuffix(String ySuffix)
	{
		this.ySuffix = ySuffix;

		return this;
	}
}
