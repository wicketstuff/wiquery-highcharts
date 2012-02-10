package nl.topicus.whighcharts.options.navigation;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartHorizontalAlignmentType;
import nl.topicus.whighcharts.options.WHighChartVerticalAlignmentType;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * A collection of options for buttons appearing in the exporting module.
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartNavigationButtonOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Alignment for the buttons.
	 * 
	 * Defaults to "right".
	 */
	private WHighChartHorizontalAlignmentType align;

	/**
	 * Background color or gradient for the buttons.
	 * 
	 * Defaults to
	 * 
	 * <pre>
	 * backgroundColor: {
	 * 	linearGradient: [0, 0, 0, 20],
	 * 	stops: [
	 * 		[0.4, '#F7F7F7'],
	 * 		[0.6, '#E3E3E3']
	 * 	]
	 * }
	 * </pre>
	 */
	private String backgroundColor;

	/**
	 * The border color of the buttons
	 * 
	 * Defaults to "#B0B0B0".
	 */
	private String borderColor;

	/**
	 * The border corner radius of the buttons
	 * 
	 * Defaults to 3.
	 */
	private Number borderRadius;

	/**
	 * The border width of the buttons
	 * 
	 * Defaults to 1.
	 */
	private Number borderWidth;

	/**
	 * Whether to enable buttons
	 * 
	 * Defaults to true.
	 */
	private Boolean enabled;

	/**
	 * Pixel height of the buttons
	 * 
	 * Defaults to 20.
	 */
	private Number height;

	/**
	 * Color of the button border on hover
	 * 
	 * Defaults to #909090.
	 */
	private String hoverBorderColor;

	/**
	 * Fill color for the symbol within the button on hover
	 * 
	 * Defaults to #81A7CF.
	 */
	private String hoverSymbolFill;

	/**
	 * Stroke (line) color for the symbol within the button on hover
	 * 
	 * Defaults to #4572A5.
	 */
	private String hoverSymbolStroke;

	/**
	 * Fill color for the symbol within the button
	 * 
	 * Defaults to #E0E0E0.
	 */
	private String symbolFill;

	/**
	 * The pixel size of the symbol on the button
	 * 
	 * Defaults to 12.
	 */
	private Number symbolSize;

	/**
	 * The color of the symbol's stroke or line
	 * 
	 * Defaults to "#A0A0A0".
	 */
	private String symbolStroke;

	/**
	 * The pixel stroke width of the symbol on the button
	 * 
	 * Defaults to 1.
	 */
	private Number symbolStrokeWidth;

	/**
	 * The x position of the center of the symbol inside the button.
	 * 
	 * Defaults to 11.5.
	 */
	private Number symbolX;

	/**
	 * The y position of the center of the symbol inside the button.
	 * 
	 * Defaults to 10.5.
	 */
	private Number symbolY;

	/**
	 * The vertical alignment of the buttons. Can be one of "top", "middle" or "bottom".
	 * 
	 * Defaults to "top".
	 */
	private WHighChartVerticalAlignmentType verticalAlign;

	/**
	 * The pixel width of the button
	 * 
	 * Defaults to 24.
	 */
	private Number width;

	/**
	 * The vertical offset of the button's position relative to its verticalAlign.
	 * 
	 * Defaults to 10.
	 */
	private Number y;

	public WHighChartHorizontalAlignmentType getAlign()
	{
		return align;
	}

	public WHighChartNavigationButtonOptions setAlign(WHighChartHorizontalAlignmentType align)
	{
		this.align = align;
		return this;
	}

	public String getBackgroundColor()
	{
		return backgroundColor;
	}

	public WHighChartNavigationButtonOptions setBackgroundColor(String backgroundColor)
	{
		this.backgroundColor = backgroundColor;
		return this;
	}

	public String getBorderColor()
	{
		return borderColor;
	}

	public WHighChartNavigationButtonOptions setBorderColor(String borderColor)
	{
		this.borderColor = borderColor;
		return this;
	}

	public Number getBorderRadius()
	{
		return borderRadius;
	}

	public WHighChartNavigationButtonOptions setBorderRadius(Number borderRadius)
	{
		this.borderRadius = borderRadius;
		return this;
	}

	public Number getBorderWidth()
	{
		return borderWidth;
	}

	public WHighChartNavigationButtonOptions setBorderWidth(Number borderWidth)
	{
		this.borderWidth = borderWidth;
		return this;
	}

	public Boolean getEnabled()
	{
		return enabled;
	}

	public WHighChartNavigationButtonOptions setEnabled(Boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}

	public Number getHeight()
	{
		return height;
	}

	public WHighChartNavigationButtonOptions setHeight(Number height)
	{
		this.height = height;
		return this;
	}

	public String getHoverBorderColor()
	{
		return hoverBorderColor;
	}

	public WHighChartNavigationButtonOptions setHoverBorderColor(String hoverBorderColor)
	{
		this.hoverBorderColor = hoverBorderColor;
		return this;
	}

	public String getHoverSymbolFill()
	{
		return hoverSymbolFill;
	}

	public WHighChartNavigationButtonOptions setHoverSymbolFill(String hoverSymbolFill)
	{
		this.hoverSymbolFill = hoverSymbolFill;
		return this;
	}

	public String getHoverSymbolStroke()
	{
		return hoverSymbolStroke;
	}

	public WHighChartNavigationButtonOptions setHoverSymbolStroke(String hoverSymbolStroke)
	{
		this.hoverSymbolStroke = hoverSymbolStroke;
		return this;
	}

	public String getSymbolFill()
	{
		return symbolFill;
	}

	public WHighChartNavigationButtonOptions setSymbolFill(String symbolFill)
	{
		this.symbolFill = symbolFill;
		return this;
	}

	public Number getSymbolSize()
	{
		return symbolSize;
	}

	public WHighChartNavigationButtonOptions setSymbolSize(Number symbolSize)
	{
		this.symbolSize = symbolSize;
		return this;
	}

	public String getSymbolStroke()
	{
		return symbolStroke;
	}

	public WHighChartNavigationButtonOptions setSymbolStroke(String symbolStroke)
	{
		this.symbolStroke = symbolStroke;
		return this;
	}

	public Number getSymbolStrokeWidth()
	{
		return symbolStrokeWidth;
	}

	public WHighChartNavigationButtonOptions setSymbolStrokeWidth(Number symbolStrokeWidth)
	{
		this.symbolStrokeWidth = symbolStrokeWidth;
		return this;
	}

	public Number getSymbolX()
	{
		return symbolX;
	}

	public WHighChartNavigationButtonOptions setSymbolX(Number symbolX)
	{
		this.symbolX = symbolX;
		return this;
	}

	public Number getSymbolY()
	{
		return symbolY;
	}

	public WHighChartNavigationButtonOptions setSymbolY(Number symbolY)
	{
		this.symbolY = symbolY;
		return this;
	}

	public WHighChartVerticalAlignmentType getVerticalAlign()
	{
		return verticalAlign;
	}

	public WHighChartNavigationButtonOptions setVerticalAlign(
			WHighChartVerticalAlignmentType verticalAlign)
	{
		this.verticalAlign = verticalAlign;
		return this;
	}

	public Number getWidth()
	{
		return width;
	}

	public WHighChartNavigationButtonOptions setWidth(Number width)
	{
		this.width = width;
		return this;
	}

	public Number getY()
	{
		return y;
	}

	public WHighChartNavigationButtonOptions setY(Number y)
	{
		this.y = y;
		return this;
	}
}
