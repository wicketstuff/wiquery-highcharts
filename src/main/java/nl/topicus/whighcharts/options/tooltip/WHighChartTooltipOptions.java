package nl.topicus.whighcharts.options.tooltip;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartFunction;
import nl.topicus.whighcharts.options.WHighChartFunctionString;
import nl.topicus.whighcharts.options.jackson.ToStringNoQuoteWithCurlyBracketsSerializer;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartTooltipOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String backgroundColor;

	private String borderColor;

	private Number borderRadius;

	private Number borderWidth;

	private Boolean crosshairs;

	private Boolean enabled;

	private WHighChartFunction formatter;

	private Boolean shadow;

	private Boolean shared;

	private Number snap;

	@JsonSerialize(include = Inclusion.NON_NULL, using = ToStringNoQuoteWithCurlyBracketsSerializer.class)
	private String style;

	public String getBackgroundColor()
	{
		return backgroundColor;
	}

	public WHighChartTooltipOptions setBackgroundColor(String backgroundColor)
	{
		this.backgroundColor = backgroundColor;
		return this;
	}

	public String getBorderColor()
	{
		return borderColor;
	}

	public WHighChartTooltipOptions setBorderColor(String borderColor)
	{
		this.borderColor = borderColor;
		return this;
	}

	public Number getBorderRadius()
	{
		return borderRadius;
	}

	public WHighChartTooltipOptions setBorderRadius(Number borderRadius)
	{
		this.borderRadius = borderRadius;
		return this;
	}

	public Number getBorderWidth()
	{
		return borderWidth;
	}

	public WHighChartTooltipOptions setBorderWidth(Number borderWidth)
	{
		this.borderWidth = borderWidth;
		return this;
	}

	public Boolean getCrosshairs()
	{
		return crosshairs;
	}

	public WHighChartTooltipOptions setCrosshairs(Boolean crosshairs)
	{
		this.crosshairs = crosshairs;
		return this;
	}

	public Boolean getEnabled()
	{
		return enabled;
	}

	public WHighChartTooltipOptions setEnabled(Boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}

	public WHighChartFunction getFormatter()
	{
		return formatter;
	}

	public WHighChartTooltipOptions setFormatter(WHighChartFunction formatter)
	{
		this.formatter = formatter;
		return this;
	}

	/**
	 * Sets the string as content of a function() {}.
	 * 
	 * @see WHighChartFunctionString
	 */
	public WHighChartTooltipOptions setFormatter(String formatter)
	{
		return setFormatter(new WHighChartFunctionString(formatter));
	}

	public Boolean getShadow()
	{
		return shadow;
	}

	public WHighChartTooltipOptions setShadow(Boolean shadow)
	{
		this.shadow = shadow;
		return this;
	}

	public Boolean getShared()
	{
		return shared;
	}

	public WHighChartTooltipOptions setShared(Boolean shared)
	{
		this.shared = shared;
		return this;
	}

	public Number getSnap()
	{
		return snap;
	}

	public WHighChartTooltipOptions setSnap(Number snap)
	{
		this.snap = snap;
		return this;
	}

	public String getStyle()
	{
		return style;
	}

	public WHighChartTooltipOptions setStyle(String style)
	{
		this.style = style;
		return this;
	}
}
