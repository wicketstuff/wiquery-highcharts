package nl.topicus.whighcharts.options.axis;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartAxisPlotBandsOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String color;

	private Number from;

	private Number to;

	public Number getFrom()
	{
		return from;
	}

	public WHighChartAxisPlotBandsOptions setFrom(Number from)
	{
		this.from = from;
		return this;
	}

	public Number getTo()
	{
		return to;
	}

	public WHighChartAxisPlotBandsOptions setTo(Number to)
	{
		this.to = to;
		return this;
	}

	public String getColor()
	{
		return color;
	}

	public WHighChartAxisPlotBandsOptions setColor(String color)
	{
		this.color = color;
		return this;
	}
}
