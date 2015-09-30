package nl.topicus.whighcharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartStyleOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String color;

	private String fontSize;

	public WHighChartStyleOptions setColor(String color)
	{
		this.color = color;
		return this;
	}

	public String getColor()
	{
		return color;
	}

	public WHighChartStyleOptions setFontSize(String fontSize)
	{
		this.fontSize = fontSize;
		return this;
	}

	public String getFontSize()
	{
		return fontSize;
	}
}
