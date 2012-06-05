package nl.topicus.whighcharts.options.axis;

import java.io.Serializable;

import nl.topicus.whighcharts.options.plotoptions.WHighChartPlotDashStyleType;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartAxisPlotLinesOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * The color of the line.
	 * 
	 * Defaults to null.
	 */
	private String color;

	/**
	 * The dashing or dot style for the plot line. Defaults to Solid.
	 */
	private WHighChartPlotDashStyleType dashStyle;

	/**
	 * An id used for identifying the plot line in Axis.removePlotLine.
	 * 
	 * Defaults to null.
	 */
	private String id;

	/**
	 * Text labels for the plot lines.
	 */
	private WHighChartAxisPlotLinesLabelOptions label;

	/**
	 * The position of the line in axis units.
	 * 
	 * Defaults to null.
	 */
	private Number value;

	/**
	 * The width or thickness of the plot line.
	 * 
	 * Defaults to null.
	 */
	private Number width;

	/**
	 * The z index of the plot line within the chart.
	 * 
	 * Defaults to null.
	 */
	private Number zIndex;

	public String getColor()
	{
		return color;
	}

	public WHighChartAxisPlotLinesOptions setColor(String color)
	{
		this.color = color;
		return this;
	}

	public WHighChartPlotDashStyleType getDashStyle()
	{
		return dashStyle;
	}

	public WHighChartAxisPlotLinesOptions setDashStyle(WHighChartPlotDashStyleType dashStyle)
	{
		this.dashStyle = dashStyle;
		return this;
	}

	public String getId()
	{
		return id;
	}

	public WHighChartAxisPlotLinesOptions setId(String id)
	{
		this.id = id;
		return this;
	}

	public WHighChartAxisPlotLinesLabelOptions getLabel()
	{
		if (label == null)
			label = new WHighChartAxisPlotLinesLabelOptions();
		return label;
	}

	public WHighChartAxisPlotLinesOptions setLabel(WHighChartAxisPlotLinesLabelOptions label)
	{
		this.label = label;
		return this;
	}

	public Number getValue()
	{
		return value;
	}

	public WHighChartAxisPlotLinesOptions setValue(Number value)
	{
		this.value = value;
		return this;
	}

	public Number getWidth()
	{
		return width;
	}

	public WHighChartAxisPlotLinesOptions setWidth(Number width)
	{
		this.width = width;
		return this;
	}

	public Number getzIndex()
	{
		return zIndex;
	}

	public WHighChartAxisPlotLinesOptions setzIndex(Number zIndex)
	{
		this.zIndex = zIndex;
		return this;
	}

}
