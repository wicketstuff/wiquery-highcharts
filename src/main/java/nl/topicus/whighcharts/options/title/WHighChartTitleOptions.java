package nl.topicus.whighcharts.options.title;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartHorizontalAlignmentType;
import nl.topicus.whighcharts.options.WHighChartVerticalAlignmentType;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartTitleOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * The horizontal alignment of the title. Can be one of "left", "center" and "right".
	 * Defaults to "center".
	 */
	private WHighChartHorizontalAlignmentType align;

	/**
	 * When the title is floating, the plot area will not move to make space for it.
	 * Defaults to false.
	 */
	private Boolean floating;

	/**
	 * The margin between the title and the plot area, or if a subtitle is present, the
	 * margin between the subtitle and the plot area. Defaults to 15.
	 */
	private Number margin;

	/**
	 * The title of the chart. To disable the title, set the text to null. Defaults to
	 * "Chart title".
	 */
	private String text;

	/**
	 * CSS styles for the title. Use this for font styling, but use align, x and yfor text
	 * alignment. Defaults to: { color: '#3E576F', fontSize: '16px' }
	 */
	private String style;

	/**
	 * The vertical alignment of the title. Can be one of "top", "middle" and "bottom".
	 * Defaults to "top".
	 */
	private WHighChartVerticalAlignmentType verticalAlign;

	/**
	 * The x position of the title relative to the alignment within chart.spacingLeft and
	 * chart.spacingRight. Defaults to 0.
	 */
	private Number x;

	/**
	 * The y position of the title relative to the alignment within chart.spacingTop and
	 * chart.spacingBottom. Defaults to 25.
	 */
	private Number y;

	public WHighChartHorizontalAlignmentType getAlign()
	{
		return align;
	}

	public WHighChartTitleOptions setAlign(WHighChartHorizontalAlignmentType align)
	{
		this.align = align;
		return this;
	}

	public Boolean getFloating()
	{
		return floating;
	}

	public WHighChartTitleOptions setFloating(Boolean floating)
	{
		this.floating = floating;
		return this;
	}

	public Number getMargin()
	{
		return margin;
	}

	public WHighChartTitleOptions setMargin(Number margin)
	{
		this.margin = margin;
		return this;
	}

	public String getText()
	{
		return text;
	}

	public WHighChartTitleOptions setText(String text)
	{
		this.text = text;
		return this;
	}

	public String getStyle()
	{
		return style;
	}

	public WHighChartTitleOptions setStyle(String style)
	{
		this.style = style;
		return this;
	}

	public WHighChartVerticalAlignmentType getVerticalAlign()
	{
		return verticalAlign;
	}

	public WHighChartTitleOptions setVerticalAlign(WHighChartVerticalAlignmentType verticalAlign)
	{
		this.verticalAlign = verticalAlign;
		return this;
	}

	public Number getX()
	{
		return x;
	}

	public WHighChartTitleOptions setX(Number x)
	{
		this.x = x;
		return this;
	}

	public Number getY()
	{
		return y;
	}

	public WHighChartTitleOptions setY(Number y)
	{
		this.y = y;
		return this;
	}
}
