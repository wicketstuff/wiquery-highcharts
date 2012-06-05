package nl.topicus.whighstock.options.plotoptions;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockPlotCandlestickOptions extends
		AbstractWHighStockPlotChartOptions<WHighStockPlotCandlestickOptions> implements
		Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * When using automatic point colors pulled from the options.colors collection, this
	 * option determines whether the chart should receive one color per series or one
	 * color per point.
	 * 
	 * Defaults to false.
	 */
	private Boolean colorByPoint;

	/**
	 * Padding between each value groups, in x axis units.
	 * 
	 * Defaults to 0.2.
	 */
	private Number groupPadding;

	public Boolean getColorByPoint()
	{
		return colorByPoint;
	}

	public WHighStockPlotCandlestickOptions setColorByPoint(Boolean colorByPoint)
	{
		this.colorByPoint = colorByPoint;
		return this;
	}

	public Number getGroupPadding()
	{
		return groupPadding;
	}

	public WHighStockPlotCandlestickOptions setGroupPadding(Number groupPadding)
	{
		this.groupPadding = groupPadding;
		return this;
	}

}