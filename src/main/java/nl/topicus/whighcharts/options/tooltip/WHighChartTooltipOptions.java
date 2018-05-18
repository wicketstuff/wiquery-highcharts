package nl.topicus.whighcharts.options.tooltip;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import nl.topicus.whighcharts.options.WHighChartFunction;
import nl.topicus.whighcharts.options.WHighChartFunctionString;
import nl.topicus.whighcharts.options.jackson.ToStringNoQuoteWithCurlyBracketsSerializer;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonInclude(Include.NON_NULL)
public class WHighChartTooltipOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String backgroundColor;

	private String borderColor;

	private Number borderRadius;

	private Number borderWidth;

	// crosshairs: null,

	private Boolean enabled;

	private WHighChartFunction formatter;

	/**
	 * The HTML of the tooltip header line. Variables are enclosed by curly brackets.
	 * Available variables are point.key, series.name, series.color and other members from
	 * the point and series objects. The point.key variable contains the category name, x
	 * value or datetime string depending on the type of axis. For datetime axes, the
	 * point.key date format can be set using tooltip.xDateFormat.
	 *
	 * <p>
	 * Defaults to <span style="font-size: 10px">{point.key}</span>
	 * </p>
	 */
	private String headerFormat;

	/**
	 * The HTML of the point's line in the tooltip. Variables are enclosed by curly
	 * brackets. Available variables are point.x, point.y, series.name and series.color
	 * and other properties on the same form. Furthermore, point.y can be extended by the
	 * tooltip.yPrefix and tooltip.ySuffix variables. This can also be overridden for each
	 * series, which makes it a good hook for displaying units.
	 *
	 * <p>
	 * Defaults to <span style="color:{series.color}">{series.name}</span>:
	 * <b>{point.y}</b>
	 * </p>
	 */
	private String pointFormat;

	/**
	 * A string to append to the tooltip format. Defaults to false.
	 */
	private String footerFormat;

	private Boolean shadow;

	private Boolean shared;

	private Number snap;

	@JsonSerialize(using = ToStringNoQuoteWithCurlyBracketsSerializer.class)
	@JsonInclude(value = Include.NON_NULL)
	private String style;

	/**
	 * Use HTML to render the contents of the tooltip instead of SVG. Using HTML allows
	 * advanced formatting like tables and images in the tooltip. It is also recommended
	 * for rtl languages as it works around rtl bugs in early Firefox. Defaults to false.
	 */
	private Boolean useHTML;

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

	public WHighChartTooltipOptions setFormatter(String formatter)
	{
		return setFormatter(new WHighChartFunctionString(formatter));
	}

	public String getHeaderFormat()
	{
		return headerFormat;
	}

	public WHighChartTooltipOptions setHeaderFormat(String headerFormat)
	{
		this.headerFormat = headerFormat;
		return this;
	}

	public String getPointFormat()
	{
		return pointFormat;
	}

	public WHighChartTooltipOptions setPointFormat(String pointFormat)
	{
		this.pointFormat = pointFormat;
		return this;
	}

	public String getFooterFormat()
	{
		return footerFormat;
	}

	public WHighChartTooltipOptions setFooterFormat(String footerFormat)
	{
		this.footerFormat = footerFormat;
		return this;
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

	public Boolean getUseHTML()
	{
		return useHTML;
	}

	public WHighChartTooltipOptions setUseHTML(Boolean useHTML)
	{
		this.useHTML = useHTML;
		return this;
	}
}
