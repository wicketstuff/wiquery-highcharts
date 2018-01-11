package nl.topicus.whighcharts.options.series;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import nl.topicus.whighcharts.options.WHighChartFunction;
import nl.topicus.whighcharts.options.WHighChartFunctionString;
import nl.topicus.whighcharts.options.WHighChartHorizontalAlignmentType;
import nl.topicus.whighcharts.options.jackson.ToStringNoQuoteWithCurlyBracketsSerializer;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonInclude(Include.NON_NULL)
public class WHighChartSeriesDataLabelsOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Boolean enabled;

	private String color;

	private WHighChartHorizontalAlignmentType align;

	private Number x;

	private Number y;

	private WHighChartFunction formatter;

	@JsonSerialize(using = ToStringNoQuoteWithCurlyBracketsSerializer.class)
	@JsonInclude(value = Include.NON_NULL)
	private String style;

	public Boolean getEnabled()
	{
		return enabled;
	}

	public WHighChartSeriesDataLabelsOptions setEnabled(Boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}

	public String getColor()
	{
		return color;
	}

	public WHighChartSeriesDataLabelsOptions setColor(String color)
	{
		this.color = color;
		return this;
	}

	public WHighChartHorizontalAlignmentType getAlign()
	{
		return align;
	}

	public WHighChartSeriesDataLabelsOptions setAlign(WHighChartHorizontalAlignmentType align)
	{
		this.align = align;
		return this;
	}

	public Number getX()
	{
		return x;
	}

	public WHighChartSeriesDataLabelsOptions setX(Number x)
	{
		this.x = x;
		return this;
	}

	public Number getY()
	{
		return y;
	}

	public WHighChartSeriesDataLabelsOptions setY(Number y)
	{
		this.y = y;
		return this;
	}

	public WHighChartFunction getFormatter()
	{
		return formatter;
	}

	public WHighChartSeriesDataLabelsOptions setFormatter(WHighChartFunction formatter)
	{
		this.formatter = formatter;
		return this;
	}

	public WHighChartSeriesDataLabelsOptions setFormatter(String formatter)
	{
		setFormatter(new WHighChartFunctionString(formatter));
		return this;
	}

	public String getStyle()
	{
		return style;
	}

	public WHighChartSeriesDataLabelsOptions setStyle(String style)
	{
		this.style = style;
		return this;
	}
}
