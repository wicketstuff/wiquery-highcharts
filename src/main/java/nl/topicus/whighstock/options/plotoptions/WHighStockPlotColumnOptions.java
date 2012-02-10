package nl.topicus.whighstock.options.plotoptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockPlotColumnOptions extends
		AbstractWHighStockPlotChartOptions<WHighStockPlotColumnOptions>
{
	private static final long serialVersionUID = 1L;

	/**
	 * The color of the border surronding each column or bar.
	 * 
	 * Defaults to "#FFFFFF".
	 */
	private String borderColor;

	/**
	 * The corner radius of the border surronding each column or bar.
	 * 
	 * Defaults to 0.
	 */
	private Number borderRadius;

	/**
	 * The width of the border surronding each column or bar.
	 * 
	 * Defaults to 1.
	 */
	private Number borderWidth;

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

	/**
	 * The minimal height for a column or width for a bar. By default, 0 values are not
	 * shown. To visualize a 0 (or close to zero) point, set the minimal point length to a
	 * pixel value like 3. In stacked column charts, minPointLength might not be respected
	 * for tightly packed values.
	 * 
	 * Defaults to 0.
	 */
	private Number minPointLength;

	/**
	 * Padding between each column or bar, in x axis units.
	 * 
	 * Defaults to 0.1.
	 */
	private Number pointPadding;

	/**
	 * A pixel value specifying a fixed width for each column or bar. When null, the width
	 * is calculated from the pointPadding and groupPadding.
	 * 
	 * Defaults to null.
	 */
	private Number pointWidth;

	public String getBorderColor()
	{
		return borderColor;
	}

	public WHighStockPlotColumnOptions setBorderColor(String borderColor)
	{
		this.borderColor = borderColor;
		return this;
	}

	public Number getBorderRadius()
	{
		return borderRadius;
	}

	public WHighStockPlotColumnOptions setBorderRadius(Number borderRadius)
	{
		this.borderRadius = borderRadius;
		return this;
	}

	public Number getBorderWidth()
	{
		return borderWidth;
	}

	public WHighStockPlotColumnOptions setBorderWidth(Number borderWidth)
	{
		this.borderWidth = borderWidth;
		return this;
	}

	public Boolean getColorByPoint()
	{
		return colorByPoint;
	}

	public WHighStockPlotColumnOptions setColorByPoint(Boolean colorByPoint)
	{
		this.colorByPoint = colorByPoint;
		return this;
	}

	public Number getGroupPadding()
	{
		return groupPadding;
	}

	public WHighStockPlotColumnOptions setGroupPadding(Number groupPadding)
	{
		this.groupPadding = groupPadding;
		return this;
	}

	public Number getMinPointLength()
	{
		return minPointLength;
	}

	public WHighStockPlotColumnOptions setMinPointLength(Number minPointLength)
	{
		this.minPointLength = minPointLength;
		return this;
	}

	public Number getPointPadding()
	{
		return pointPadding;
	}

	public WHighStockPlotColumnOptions setPointPadding(Number pointPadding)
	{
		this.pointPadding = pointPadding;
		return this;
	}

	public Number getPointWidth()
	{
		return pointWidth;
	}

	public WHighStockPlotColumnOptions setPointWidth(Number pointWidth)
	{
		this.pointWidth = pointWidth;
		return this;
	}

}
