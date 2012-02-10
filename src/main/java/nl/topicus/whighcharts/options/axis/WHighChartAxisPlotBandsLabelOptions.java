package nl.topicus.whighcharts.options.axis;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartHorizontalAlignmentType;
import nl.topicus.whighcharts.options.WHighChartVerticalAlignmentType;
import nl.topicus.whighcharts.options.jackson.StyleSerializer;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartAxisPlotBandsLabelOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Horizontal alignment of the label. Can be one of "left", "center" or "right".
	 * 
	 * Defaults to "center".
	 */
	private WHighChartHorizontalAlignmentType algin;

	/**
	 * Vertical alignment of the label relative to the plot band. Can be one of "top",
	 * "middle" or "bottom".
	 * 
	 * Defaults to "top".
	 */
	private WHighChartVerticalAlignmentType verticalAlign;

	/**
	 * Rotation of the text label in degrees
	 * 
	 * Defaults to 0.
	 */
	private Number rotation;

	/**
	 * CSS styles for the text label.
	 */
	@JsonSerialize(using = StyleSerializer.class, include = Inclusion.NON_NULL)
	private String style;

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

	public WHighChartHorizontalAlignmentType getAlgin()
	{
		return algin;
	}

	public WHighChartAxisPlotBandsLabelOptions setAlgin(WHighChartHorizontalAlignmentType algin)
	{
		this.algin = algin;
		return this;
	}

	public WHighChartVerticalAlignmentType getVerticalAlign()
	{
		return verticalAlign;
	}

	public WHighChartAxisPlotBandsLabelOptions setVerticalAlign(
			WHighChartVerticalAlignmentType verticalAlign)
	{
		this.verticalAlign = verticalAlign;
		return this;
	}

	public Number getRotation()
	{
		return rotation;
	}

	public WHighChartAxisPlotBandsLabelOptions setRotation(Number rotation)
	{
		this.rotation = rotation;
		return this;
	}

	public String getStyle()
	{
		return style;
	}

	public WHighChartAxisPlotBandsLabelOptions setStyle(String style)
	{
		this.style = style;
		return this;
	}

	public String getText()
	{
		return text;
	}

	public WHighChartAxisPlotBandsLabelOptions setText(String text)
	{
		this.text = text;
		return this;
	}

	public WHighChartHorizontalAlignmentType getTextAlign()
	{
		return textAlign;
	}

	public WHighChartAxisPlotBandsLabelOptions setTextAlign(
			WHighChartHorizontalAlignmentType textAlign)
	{
		this.textAlign = textAlign;
		return this;
	}

	public Number getX()
	{
		return x;
	}

	public WHighChartAxisPlotBandsLabelOptions setX(Number x)
	{
		this.x = x;
		return this;
	}

	public Number getY()
	{
		return y;
	}

	public WHighChartAxisPlotBandsLabelOptions setY(Number y)
	{
		this.y = y;
		return this;
	}
}
