package nl.topicus.whighstock.options.legend;

import nl.topicus.whighcharts.options.legend.WHighChartLegendOptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * The legend is a box containing a symbol and name for each series item or point item in
 * the chart.
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockLegendOptions extends WHighChartLegendOptions
{
	private static final long serialVersionUID = 1L;

	/**
	 * The pixel bottom margin for each legend item.
	 * 
	 * Defaults to 0.
	 */
	private Number itemMarginBottom;

	/**
	 * The pixel top margin for each legend item.
	 * 
	 * Defaults to 0.
	 */
	private Number itemMarginTop;

	/**
	 * The inner padding of the legend box.
	 * 
	 * Defaults to 5.
	 */
	private Number padding;

	public Number getItemMarginBottom()
	{
		return itemMarginBottom;
	}

	public WHighStockLegendOptions setItemMarginBottom(Number itemMarginBottom)
	{
		this.itemMarginBottom = itemMarginBottom;
		return this;
	}

	public Number getItemMarginTop()
	{
		return itemMarginTop;
	}

	public WHighStockLegendOptions setItemMarginTop(Number itemMarginTop)
	{
		this.itemMarginTop = itemMarginTop;
		return this;
	}

	public Number getPadding()
	{
		return padding;
	}

	public WHighStockLegendOptions setPadding(Number padding)
	{
		this.padding = padding;
		return this;
	}

}
