package nl.topicus.whighcharts.options.subtitle;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartHorizontalAlignmentType;
import nl.topicus.whighcharts.options.WHighChartVerticalAlignmentType;
import nl.topicus.whighcharts.options.jackson.StyleSerializer;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * The chart's subtitle
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartsSubtitleOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * The horizontal alignment of the subtitle. Can be one of "left", "center" and
	 * "right".
	 * 
	 * Defaults to "center".
	 */
	private WHighChartHorizontalAlignmentType align;

	/**
	 * When the subtitle is floating, the plot area will not move to make space for it.
	 * 
	 * Defaults to false.
	 */
	private Boolean floating;

	/**
	 * The subtitle of the chart.
	 * 
	 * Defaults to "".
	 */
	private String text;

	/**
	 * CSS styles for the title. Exact positioning of the title can be achieved by
	 * changing the margin property, or by adding position: "absolute" and left and top
	 * properties.
	 * 
	 * Defaults to:
	 * 
	 * <pre>
	 * 
	 * 	{
	 * 		color: '#3E576F'
	 * 	}
	 * </pre>
	 */
	@JsonSerialize(using = StyleSerializer.class, include = Inclusion.NON_NULL)
	private String style;

	/**
	 * The vertical alignment of the title. Can be one of "top", "middle" and "bottom".
	 * 
	 * Defaults to "top".
	 */
	private WHighChartVerticalAlignmentType verticalAlign;

	/**
	 * The x position of the subtitle relative to the alignment within chart.spacingLeft
	 * and chart.spacingRight.
	 * 
	 * Defaults to 0.
	 */
	private Number x;

	/**
	 * The y position of the subtitle relative to the alignment within chart.spacingTop
	 * and chart.spacingBottom.
	 * 
	 * Defaults to 30.
	 */
	private Number y;

	public WHighChartHorizontalAlignmentType getAlign()
	{
		return align;
	}

	public WHighChartsSubtitleOptions setAlign(WHighChartHorizontalAlignmentType align)
	{
		this.align = align;
		return this;
	}

	public Boolean getFloating()
	{
		return floating;
	}

	public WHighChartsSubtitleOptions setFloating(Boolean floating)
	{
		this.floating = floating;
		return this;
	}

	public String getText()
	{
		return text;
	}

	public WHighChartsSubtitleOptions setText(String text)
	{
		this.text = text;
		return this;
	}

	public String getStyle()
	{
		return style;
	}

	public WHighChartsSubtitleOptions setStyle(String style)
	{
		this.style = style;
		return this;
	}

	public WHighChartVerticalAlignmentType getVerticalAlign()
	{
		return verticalAlign;
	}

	public WHighChartsSubtitleOptions setVerticalAlign(WHighChartVerticalAlignmentType verticalAlign)
	{
		this.verticalAlign = verticalAlign;
		return this;
	}

	public Number getX()
	{
		return x;
	}

	public WHighChartsSubtitleOptions setX(Number x)
	{
		this.x = x;
		return this;
	}

	public Number getY()
	{
		return y;
	}

	public WHighChartsSubtitleOptions setY(Number y)
	{
		this.y = y;
		return this;
	}

}
