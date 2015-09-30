package nl.topicus.whighcharts.options.axis;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartAxisDateTimeLabelFormats implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String day;

	private String month;

	private String year;

	public String getDay()
	{
		return day;
	}

	public WHighChartAxisDateTimeLabelFormats setDay(String day)
	{
		this.day = day;
		return this;
	}

	public String getMonth()
	{
		return month;
	}

	public WHighChartAxisDateTimeLabelFormats setMonth(String month)
	{
		this.month = month;
		return this;
	}

	public String getYear()
	{
		return year;
	}

	public WHighChartAxisDateTimeLabelFormats setYear(String year)
	{
		this.year = year;
		return this;
	}
}
