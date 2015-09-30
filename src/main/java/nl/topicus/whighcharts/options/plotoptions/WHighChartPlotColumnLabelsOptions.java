package nl.topicus.whighcharts.options.plotoptions;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartFunction;
import nl.topicus.whighcharts.options.WHighChartFunctionString;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartPlotColumnLabelsOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Enable or disable the data labels. Defaults to true.
	 */
	private Boolean enabled;

	private WHighChartFunction formatter;

	private String color;

	private Number x;

	private Number y;

	public Number getX()
	{
		return x;
	}

	public WHighChartPlotColumnLabelsOptions setX(Number x)
	{
		this.x = x;
		return this;
	}

	public Number getY()
	{
		return y;
	}

	public WHighChartPlotColumnLabelsOptions setY(Number y)
	{
		this.y = y;
		return this;
	}

	public Boolean getEnabled()
	{
		return enabled;
	}

	public WHighChartPlotColumnLabelsOptions setEnabled(Boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}

	public WHighChartFunction getFormatter()
	{
		return formatter;
	}

	public WHighChartPlotColumnLabelsOptions setFormatter(WHighChartFunction formatter)
	{
		this.formatter = formatter;
		return this;
	}

	public WHighChartPlotColumnLabelsOptions setFormatter(String formatter)
	{
		return setFormatter(new WHighChartFunctionString(formatter));
	}

	public WHighChartPlotColumnLabelsOptions setSelection(String formatter)
	{
		return setFormatter(new WHighChartFunctionString(formatter));
	}

	public String getColor()
	{
		return color;
	}

	public WHighChartPlotColumnLabelsOptions setColor(String color)
	{
		this.color = color;
		return this;
	}
}
