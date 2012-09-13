package nl.topicus.whighcharts.options.axis;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartFunction;
import nl.topicus.whighcharts.options.WHighChartFunctionString;
import nl.topicus.whighcharts.options.WHighChartHorizontalAlignmentType;
import nl.topicus.whighcharts.options.jackson.ToStringNoQuoteWithCurlyBracketsSerializer;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartAxisLabelsOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * What part of the string the given position is anchored to. Can be one of "left",
	 * "center" or "right". In inverted charts, x axis label alignment and y axis
	 * alignment are swapped. Defaults to "center".
	 */
	private WHighChartHorizontalAlignmentType align;

	/**
	 * Enable or disable the axis labels. Defaults to true.
	 */
	private Boolean enabled;

	/**
	 * Callback JavaScript function to format the label. The value is given by this.value.
	 * Defaults to: function() { return this.value; }
	 */
	private WHighChartFunction formatter;

	/**
	 * Rotation of the labels in degrees. Defaults to 0.
	 */
	private Number rotation;

	/**
	 * Horizontal axes only. The number of lines to spread the labels over to make room or
	 * tighter labels. Defaults to null.
	 */
	private Number staggerLines;

	/**
	 * To show only every n'th label on the axis, set the step to n. Setting the step to 2
	 * shows every other label. Defaults to null.
	 */
	private Number step;

	/**
	 * CSS styles for the label. Defaults to: style: { color: '#6D869F', fontWeight:
	 * 'bold' }
	 */
	@JsonSerialize(include = Inclusion.NON_NULL, using = ToStringNoQuoteWithCurlyBracketsSerializer.class)
	private String style;

	/**
	 * The x position offset of the label relative to the tick position on the axis.
	 * Defaults to 0.
	 */
	private Number x;

	/**
	 * The y position offset of the label relative to the tick position on the axis.
	 * Defaults to 0.
	 */
	private Number y;

	public WHighChartHorizontalAlignmentType getAlign()
	{
		return align;
	}

	public WHighChartAxisLabelsOptions setAlign(WHighChartHorizontalAlignmentType align)
	{
		this.align = align;
		return this;
	}

	public Boolean isEnabled()
	{
		return enabled;
	}

	public WHighChartAxisLabelsOptions setEnabled(Boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}

	public WHighChartFunction getFormatter()
	{
		return formatter;
	}

	public WHighChartAxisLabelsOptions setFormatter(WHighChartFunction formatter)
	{
		this.formatter = formatter;
		return this;
	}

	public WHighChartAxisLabelsOptions setFormatter(String formatter)
	{
		return setFormatter(new WHighChartFunctionString(formatter));
	}

	public Number getRotation()
	{
		return rotation;
	}

	public WHighChartAxisLabelsOptions setRotation(Number rotation)
	{
		this.rotation = rotation;
		return this;
	}

	public Number getStaggerLines()
	{
		return staggerLines;
	}

	public WHighChartAxisLabelsOptions setStaggerLines(Number staggerLines)
	{
		this.staggerLines = staggerLines;
		return this;
	}

	public Number getStep()
	{
		return step;
	}

	public WHighChartAxisLabelsOptions setStep(Number step)
	{
		this.step = step;
		return this;
	}

	public String getStyle()
	{
		return style;
	}

	public WHighChartAxisLabelsOptions setStyle(String style)
	{
		this.style = style;
		return this;
	}

	public Number getX()
	{
		return x;
	}

	public WHighChartAxisLabelsOptions setX(Number x)
	{
		this.x = x;
		return this;
	}

	public Number getY()
	{
		return y;
	}

	public WHighChartAxisLabelsOptions setY(Number y)
	{
		this.y = y;
		return this;
	}

}
