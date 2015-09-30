package nl.topicus.whighcharts.options.legend;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartHorizontalAlignmentType;
import nl.topicus.whighcharts.options.WHighChartVerticalAlignmentType;
import nl.topicus.whighcharts.options.jackson.ToStringNoQuoteWithCurlyBracketsSerializer;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartLegendOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private WHighChartHorizontalAlignmentType align;

	private String backgroundColor;

	/**
	 * The color of the drawn border around the legend. Defaults to #909090.
	 */
	private String borderColor;

	/**
	 * The border corner radius of the legend. Defaults to 5.
	 */
	private Number borderRadius;

	/**
	 * The width of the drawn border around the legend. Defaults to 1.
	 */
	private Number borderWidth;

	/**
	 * Enable or disable the legend. Defaults to true.
	 */
	private Boolean enabled;

	/**
	 * When the legend is floating, the plot area ignores it and is allowed to be placed
	 * below it. Defaults to false.
	 */
	private Boolean floating;

	/**
	 * CSS styles for each legend item when the corresponding series or point is hidden.
	 * Properties are inherited from style unless overridden here. Defaults to:
	 * itemHiddenStyle: { color: '#CCC' }
	 */
	@JsonSerialize(include = Inclusion.NON_NULL, using = ToStringNoQuoteWithCurlyBracketsSerializer.class)
	private String itemHiddenStyle;

	/**
	 * CSS styles for each legend item in hover mode. Properties are inherited from style
	 * unless overridden here. Defaults to: itemHoverStyle: { color: '#000' }
	 */
	@JsonSerialize(include = Inclusion.NON_NULL, using = ToStringNoQuoteWithCurlyBracketsSerializer.class)
	private String itemHoverStyle;

	/**
	 * CSS styles for each legend item. Defaults to: itemStyle: { cursor: 'pointer',
	 * color: '#3E576F' }
	 */
	@JsonSerialize(include = Inclusion.NON_NULL, using = ToStringNoQuoteWithCurlyBracketsSerializer.class)
	private String itemStyle;

	/**
	 * The width for each legend item. This is useful in a horizontal layout with many
	 * items when you want the items to align vertically. Defaults to null.
	 */
	private Number itemWidth;

	/**
	 * The layout of the legend items. Can be one of "horizontal" or "vertical". Defaults
	 * to "horizontal".
	 */
	private WHighChartLegendLayoutType layout;

	/**
	 * Callback function to format each of the series' labels. The this keyword refers to
	 * the series object, or the point object in case of pie charts. Defaults to:
	 * labelFormatter: function() { return this.name }
	 */
	private String labelFormatter;

	/**
	 * Line height for the legend items. Deprecated as of 2.1. Defaults to 16.
	 */
	private Number lineHeight;

	/**
	 * If the plot area sized is calculated automatically and the legend is not floating,
	 * the legend margin is the space between the legend and the axis labels or plot area.
	 * Defaults to 15.
	 */
	private Number margin;

	/**
	 * Whether to reverse the order of the legend items compared to the order of the
	 * series or points as defined in the configuration object. Defaults to false.
	 */
	private Boolean reversed;

	/**
	 * Whether to apply a drop shadow to the legend. A backgroundColor also needs to be
	 * applied for this to take effect. Defaults to false.
	 */
	private Boolean shadow;

	/**
	 * CSS styles for the legend area. In the 1.x versions the position of the legend area
	 * was determined by CSS. In 2.x, the position is determined by properties like align,
	 * verticalAlign, x and y, but the styles are still parsed for backwards
	 * compatibility. symbolPadding : Number The pixel padding between the legend item
	 * symbol and the legend item text. Defaults to 5.
	 */
	@JsonSerialize(include = Inclusion.NON_NULL, using = ToStringNoQuoteWithCurlyBracketsSerializer.class)
	private String style;

	/**
	 * The pixel width of the legend item symbol. Defaults to 30.
	 */
	private Number symbolWidth;

	/**
	 * The vertical alignment of the legend box. Can be one of "top", "middle" or
	 * "bottom". Vertical position can be further determined by the y option. Defaults to
	 * "bottom".
	 */
	private WHighChartVerticalAlignmentType verticalAlign;

	/**
	 * The width of the legend box, not including style.padding. Defaults to null.
	 */
	private Number width;

	/**
	 * The x offset of the legend relative to it's horizontal alignment align within
	 * chart.spacingLeft and chart.spacingRight. Negative x moves it to the left, positive
	 * x moves it to the right. The default value of 15 together with align: "center" puts
	 * it in the center of the plot area. Defaults to 15.
	 */
	private Number x;

	/**
	 * The vertical offset of the legend relative to it's vertical alignment verticalAlign
	 * within chart.spacingTop and chart.spacingBottom. Negative y moves it up, positive y
	 * moves it down. Defaults to 0.
	 */
	private Number y;

	public WHighChartHorizontalAlignmentType getAlign()
	{
		return align;
	}

	public WHighChartLegendOptions setAlign(WHighChartHorizontalAlignmentType align)
	{
		this.align = align;
		return this;
	}

	public String getBackgroundColor()
	{
		return backgroundColor;
	}

	public WHighChartLegendOptions setBackgroundColor(String backgroundColor)
	{
		this.backgroundColor = backgroundColor;
		return this;
	}

	public String getBorderColor()
	{
		return borderColor;
	}

	public WHighChartLegendOptions setBorderColor(String borderColor)
	{
		this.borderColor = borderColor;
		return this;
	}

	public Number getBorderRadius()
	{
		return borderRadius;
	}

	public WHighChartLegendOptions setBorderRadius(Number borderRadius)
	{
		this.borderRadius = borderRadius;
		return this;
	}

	public Number getBorderWidth()
	{
		return borderWidth;
	}

	public WHighChartLegendOptions setBorderWidth(Number borderWidth)
	{
		this.borderWidth = borderWidth;
		return this;
	}

	public Boolean getEnabled()
	{
		return enabled;
	}

	public WHighChartLegendOptions setEnabled(Boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}

	public Boolean getFloating()
	{
		return floating;
	}

	public WHighChartLegendOptions setFloating(Boolean floating)
	{
		this.floating = floating;
		return this;
	}

	public String getItemHiddenStyle()
	{
		return itemHiddenStyle;
	}

	public WHighChartLegendOptions setItemHiddenStyle(String itemHiddenStyle)
	{
		this.itemHiddenStyle = itemHiddenStyle;
		return this;
	}

	public String getItemHoverStyle()
	{
		return itemHoverStyle;
	}

	public WHighChartLegendOptions setItemHoverStyle(String itemHoverStyle)
	{
		this.itemHoverStyle = itemHoverStyle;
		return this;
	}

	public String getItemStyle()
	{
		return itemStyle;
	}

	public WHighChartLegendOptions setItemStyle(String itemStyle)
	{
		this.itemStyle = itemStyle;
		return this;
	}

	public Number getItemWidth()
	{
		return itemWidth;
	}

	public WHighChartLegendOptions setItemWidth(Number itemWidth)
	{
		this.itemWidth = itemWidth;
		return this;
	}

	public WHighChartLegendLayoutType getLayout()
	{
		return layout;
	}

	public WHighChartLegendOptions setLayout(WHighChartLegendLayoutType layout)
	{
		this.layout = layout;
		return this;
	}

	public String getLabelFormatter()
	{
		return labelFormatter;
	}

	public WHighChartLegendOptions setLabelFormatter(String labelFormatter)
	{
		this.labelFormatter = labelFormatter;
		return this;
	}

	public Number getLineHeight()
	{
		return lineHeight;
	}

	public WHighChartLegendOptions setLineHeight(Number lineHeight)
	{
		this.lineHeight = lineHeight;
		return this;
	}

	public Number getMargin()
	{
		return margin;
	}

	public WHighChartLegendOptions setMargin(Number margin)
	{
		this.margin = margin;
		return this;
	}

	public Boolean getReversed()
	{
		return reversed;
	}

	public WHighChartLegendOptions setReversed(Boolean reversed)
	{
		this.reversed = reversed;
		return this;
	}

	public Boolean getShadow()
	{
		return shadow;
	}

	public WHighChartLegendOptions setShadow(Boolean shadow)
	{
		this.shadow = shadow;
		return this;
	}

	public String getStyle()
	{
		return style;
	}

	public WHighChartLegendOptions setStyle(String style)
	{
		this.style = style;
		return this;
	}

	public Number getSymbolWidth()
	{
		return symbolWidth;
	}

	public WHighChartLegendOptions setSymbolWidth(Number symbolWidth)
	{
		this.symbolWidth = symbolWidth;
		return this;
	}

	public WHighChartVerticalAlignmentType getVerticalAlign()
	{
		return verticalAlign;
	}

	public WHighChartLegendOptions setVerticalAlign(WHighChartVerticalAlignmentType verticalAlign)
	{
		this.verticalAlign = verticalAlign;
		return this;
	}

	public Number getWidth()
	{
		return width;
	}

	public WHighChartLegendOptions setWidth(Number width)
	{
		this.width = width;
		return this;
	}

	public Number getX()
	{
		return x;
	}

	public WHighChartLegendOptions setX(Number x)
	{
		this.x = x;
		return this;
	}

	public Number getY()
	{
		return y;
	}

	public WHighChartLegendOptions setY(Number y)
	{
		this.y = y;
		return this;
	}

}
