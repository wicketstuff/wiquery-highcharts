package nl.topicus.whighcharts.options.plotoptions;

import java.util.List;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartPlotPieOptions extends
		AbstractWHighChartPlotChartOptions<WHighChartPlotPieOptions>
{
	private static final long serialVersionUID = 1L;

	/**
	 * The color of the border surronding each slice.
	 * 
	 * Defaults to "#FFFFFF".
	 */
	private String borderColor;

	/**
	 * The width of the border surronding each slice.
	 * 
	 * Defaults to 1.
	 */
	private Number borderWidth;

	/**
	 * The center of the pie chart relative to the plot area. Can be percentages or pixel
	 * values.
	 * 
	 * Defaults to ['50%', '50%'].
	 */
	private List<String> center;

	/**
	 * The size of the inner diameter for the pie. A size greater than 0 renders a donut
	 * chart. Can be a percentage or pixel value. Percentages are relative to the size of
	 * the plot area. Pixel values are given as integers.
	 * 
	 * Defaults to 0.
	 */
	private String innerSize;

	/**
	 * The diameter of the pie relative to the plot area. Can be a percentage or pixel
	 * value. Pixel values are given as integers.
	 * 
	 * Defaults to "75%".
	 */
	private String size;

	/**
	 * If a point is sliced, moved out from the center, how many pixels should it be
	 * moved?
	 * 
	 * Defaults to 10.
	 */
	private Number slicedOffset;

	public String getBorderColor()
	{
		return borderColor;
	}

	public WHighChartPlotPieOptions setBorderColor(String borderColor)
	{
		this.borderColor = borderColor;
		return this;
	}

	public Number getBorderWidth()
	{
		return borderWidth;
	}

	public WHighChartPlotPieOptions setBorderWidth(Number borderWidth)
	{
		this.borderWidth = borderWidth;
		return this;
	}

	public List<String> getCenter()
	{
		return center;
	}

	public WHighChartPlotPieOptions setCenter(List<String> center)
	{
		this.center = center;
		return this;
	}

	public String getInnerSize()
	{
		return innerSize;
	}

	public WHighChartPlotPieOptions setInnerSize(String innerSize)
	{
		this.innerSize = innerSize;
		return this;
	}

	public String getSize()
	{
		return size;
	}

	public WHighChartPlotPieOptions setSize(String size)
	{
		this.size = size;
		return this;
	}

	public Number getSlicedOffset()
	{
		return slicedOffset;
	}

	public WHighChartPlotPieOptions setSlicedOffset(Number slicedOffset)
	{
		this.slicedOffset = slicedOffset;
		return this;
	}

}
