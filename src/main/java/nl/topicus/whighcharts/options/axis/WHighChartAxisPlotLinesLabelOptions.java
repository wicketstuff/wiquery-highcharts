package nl.topicus.whighcharts.options.axis;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartHorizontalAlignmentType;
import nl.topicus.whighcharts.options.WHighChartStyleOptions;
import nl.topicus.whighcharts.options.WHighChartVerticalAlignmentType;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartAxisPlotLinesLabelOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Horizontal alignment of the label. Can be one of "left", "center" or "right".
	 * 
	 * Defaults to "center".
	 */
	private WHighChartHorizontalAlignmentType align;

	/**
	 * Vertical alignment of the label relative to the plot band. Can be one of "top",
	 * "middle" or "bottom".
	 * 
	 * Defaults to "top".
	 */
	private WHighChartVerticalAlignmentType verticalAlign;

	/**
	 * Rotation of the text label in degrees Defaults to 0.
	 */
	private Number rotation;

	/**
	 * CSS styles for the text label.
	 */
	private WHighChartStyleOptions style;

	/**
	 * The string text itself. A subset of HTML is supported.
	 */
	private String text;

	/**
	 * The text alignment for the label. While align determines where the texts anchor
	 * point is placed within the plot band, textAlign determines how the text is aligned
	 * against its anchor point. Possible values are "left", "center" and "right".
	 * 
	 * Defaults to the same as the align option.
	 */
	private WHighChartHorizontalAlignmentType textAlign;

	/**
	 * Horizontal position relative the alignment.
	 * 
	 * Default varies by orientation.
	 */
	private Number x;

	/**
	 * Vertical position of the text baseline relative to the alignment.
	 * 
	 * Default varies by orientation.
	 */
	private Number y;

	public WHighChartHorizontalAlignmentType getAlign()
	{
		return align;
	}

	public WHighChartAxisPlotLinesLabelOptions setAlign(WHighChartHorizontalAlignmentType align)
	{
		this.align = align;
		return this;
	}

	public WHighChartVerticalAlignmentType getVerticalAlign()
	{
		return verticalAlign;
	}

	public WHighChartAxisPlotLinesLabelOptions setVerticalAlign(
			WHighChartVerticalAlignmentType verticalAlign)
	{
		this.verticalAlign = verticalAlign;
		return this;
	}

	public Number getRotation()
	{
		return rotation;
	}

	public WHighChartAxisPlotLinesLabelOptions setRotation(Number rotation)
	{
		this.rotation = rotation;
		return this;
	}

	public WHighChartStyleOptions getStyle()
	{
		return style;
	}

	public WHighChartAxisPlotLinesLabelOptions setStyle(WHighChartStyleOptions style)
	{
		this.style = style;
		return this;
	}

	public String getText()
	{
		return text;
	}

	public WHighChartAxisPlotLinesLabelOptions setText(String text)
	{
		this.text = text;
		return this;
	}

	public WHighChartHorizontalAlignmentType getTextAlign()
	{
		return textAlign;
	}

	public WHighChartAxisPlotLinesLabelOptions setTextAlign(
			WHighChartHorizontalAlignmentType textAlign)
	{
		this.textAlign = textAlign;
		return this;
	}

	public Number getX()
	{
		return x;
	}

	public WHighChartAxisPlotLinesLabelOptions setX(Number x)
	{
		this.x = x;
		return this;
	}

	public Number getY()
	{
		return y;
	}

	public WHighChartAxisPlotLinesLabelOptions setY(Number y)
	{
		this.y = y;
		return this;
	}

}
