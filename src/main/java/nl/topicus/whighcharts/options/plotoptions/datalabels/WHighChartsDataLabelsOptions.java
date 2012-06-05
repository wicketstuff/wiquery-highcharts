package nl.topicus.whighcharts.options.plotoptions.datalabels;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartFunction;
import nl.topicus.whighcharts.options.WHighChartHorizontalAlignmentType;
import nl.topicus.whighcharts.options.jackson.StyleSerializer;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartsDataLabelsOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * The alignment of the data label compared to the point. Can be one of "left",
	 * "center" or "right".
	 * 
	 * Defaults to "center".
	 */
	private WHighChartHorizontalAlignmentType align;

	/**
	 * The text color for the data labels.
	 * 
	 * Defaults to null.
	 */
	private String color;

	/**
	 * Enable or disable the data labels. Defaults to false.
	 */
	private Boolean enabled;

	/**
	 * Callback JavaScript function to format the data label. Available data are:
	 * this.percentage Stacked series and pies only. The point's percentage of the total.
	 * this.point The point object. The point name, if defined, is available through
	 * this.point.name. this.series: The series object. The series name is available
	 * through this.series.name. this.total Stacked series only. The total value at this
	 * point's x value. this.x: The y value. this.y: The y value. Default value:
	 * 
	 * formatter: function() { return this.y; }
	 */
	private WHighChartFunction formatter;

	/**
	 * Text rotation in degrees. Defaults to 0.
	 */
	private Number rotation;

	/**
	 * Styles for the label.
	 */
	@JsonSerialize(using = StyleSerializer.class, include = Inclusion.NON_NULL)
	private String style;

	/**
	 * The x position offset of the label relative to the point.
	 * 
	 * Defaults to 0.
	 */
	private Number x;

	/**
	 * The y position offset of the label relative to the point.
	 * 
	 * Defaults to -6.
	 */
	private Number y;

	public WHighChartHorizontalAlignmentType getAlign()
	{
		return align;
	}

	public WHighChartsDataLabelsOptions setAlign(WHighChartHorizontalAlignmentType align)
	{
		this.align = align;
		return this;
	}

	public String getColor()
	{
		return color;
	}

	public WHighChartsDataLabelsOptions setColor(String color)
	{
		this.color = color;
		return this;
	}

	public Boolean getEnabled()
	{
		return enabled;
	}

	public WHighChartsDataLabelsOptions setEnabled(Boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}

	public WHighChartFunction getFormatter()
	{
		return formatter;
	}

	public WHighChartsDataLabelsOptions setFormatter(WHighChartFunction formatter)
	{
		this.formatter = formatter;
		return this;
	}

	public Number getRotation()
	{
		return rotation;
	}

	public WHighChartsDataLabelsOptions setRotation(Number rotation)
	{
		this.rotation = rotation;
		return this;
	}

	public String getStyle()
	{
		return style;
	}

	public WHighChartsDataLabelsOptions setStyle(String style)
	{
		this.style = style;
		return this;
	}

	public Number getX()
	{
		return x;
	}

	public WHighChartsDataLabelsOptions setX(Number x)
	{
		this.x = x;
		return this;
	}

	public Number getY()
	{
		return y;
	}

	public WHighChartsDataLabelsOptions setY(Number y)
	{
		this.y = y;
		return this;
	}

}
