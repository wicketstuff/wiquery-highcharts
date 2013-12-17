package nl.topicus.whighcharts.options.axis;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonInclude(Include.NON_NULL)
public class WHighChartAxisPlotLinesOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String color;

	private Number width;

	private Number value;

	private WHighChartAxisPlotLinesLabelOptions label;

	public String getColor()
	{
		return color;
	}

	public WHighChartAxisPlotLinesOptions setColor(String color)
	{
		this.color = color;
		return this;
	}

	public WHighChartAxisPlotLinesOptions setWidth(Number width)
	{
		this.width = width;
		return this;
	}

	public Number getWidth()
	{
		return width;
	}

	public WHighChartAxisPlotLinesOptions setLabel(WHighChartAxisPlotLinesLabelOptions label)
	{
		this.label = label;
		return this;
	}

	public WHighChartAxisPlotLinesLabelOptions getLabel()
	{
		return label;
	}

	public WHighChartAxisPlotLinesOptions setValue(Number value)
	{
		this.value = value;
		return this;
	}

	public Number getValue()
	{
		return value;
	}
}
