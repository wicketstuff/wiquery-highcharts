package nl.topicus.whighcharts.options.labels;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartFunction;
import nl.topicus.whighcharts.options.WHighChartFunctionString;
import nl.topicus.whighcharts.options.WHighChartStyleOptions;
import nl.topicus.whighcharts.options.jackson.ToStringNoQuoteSerializer;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartDataLabels implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String align;

	private String color;

	private Boolean enabled;

	@JsonSerialize(using = ToStringNoQuoteSerializer.class)
	private WHighChartFunction formatter;

	private Number rotation;

	private WHighChartStyleOptions style;

	private Number x;

	private Number y;

	public String getAlign()
	{
		return align;
	}

	public WHighChartDataLabels setAlign(String align)
	{
		this.align = align;
		return this;
	}

	public String getColor()
	{
		return color;
	}

	public WHighChartDataLabels setColor(String color)
	{
		this.color = color;
		return this;
	}

	public WHighChartFunction getFormatter()
	{
		return formatter;
	}

	public WHighChartDataLabels setFormatter(WHighChartFunction formatter)
	{
		this.formatter = formatter;
		return this;
	}

	public WHighChartDataLabels setFormatter(String formatter)
	{
		return setFormatter(new WHighChartFunctionString(formatter));
	}

	public boolean getEnabled()
	{
		return enabled;
	}

	public WHighChartDataLabels setEnabled(boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}

	public Number getRotation()
	{
		return rotation;
	}

	public WHighChartDataLabels setRotation(Number rotation)
	{
		this.rotation = rotation;
		return this;
	}

	public WHighChartDataLabels setStyle(WHighChartStyleOptions style)
	{
		this.style = style;
		return this;
	}

	public WHighChartStyleOptions getStyle()
	{
		return style;
	}

	public Number getX()
	{
		return x;
	}

	public WHighChartDataLabels setX(Number x)
	{
		this.x = x;
		return this;
	}

	public Number getY()
	{
		return y;
	}

	public WHighChartDataLabels setY(Number y)
	{
		this.y = y;
		return this;
	}
}
