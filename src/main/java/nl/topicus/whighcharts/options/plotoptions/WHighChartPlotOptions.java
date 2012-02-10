package nl.topicus.whighcharts.options.plotoptions;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartPlotOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private WHighChartPlotAreaOptions area;

	private WHighChartPlotAreaSplineOptions areaspline;

	private WHighChartPlotBarOptions bar;

	private WHighChartPlotColumnOptions column;

	private WHighChartPlotLineOptions line;

	private WHighChartPlotPieOptions pie;

	private WHighChartPlotSeriesOptions series;

	private WHighChartPlotScatterOptions scatter;

	private WHighChartPlotSplineOptions spline;

	public WHighChartPlotAreaOptions getArea()
	{
		if (area == null)
			area = new WHighChartPlotAreaOptions();

		return area;
	}

	public WHighChartPlotOptions setArea(WHighChartPlotAreaOptions area)
	{
		this.area = area;
		return this;
	}

	public WHighChartPlotAreaSplineOptions getAreaspline()
	{
		if (areaspline == null)
			areaspline = new WHighChartPlotAreaSplineOptions();

		return areaspline;
	}

	public WHighChartPlotOptions setAreaspline(WHighChartPlotAreaSplineOptions areaspline)
	{
		this.areaspline = areaspline;
		return this;
	}

	public WHighChartPlotBarOptions getBar()
	{
		if (bar == null)
			bar = new WHighChartPlotBarOptions();

		return bar;
	}

	public WHighChartPlotOptions setBar(WHighChartPlotBarOptions bar)
	{
		this.bar = bar;
		return this;
	}

	public WHighChartPlotColumnOptions getColumn()
	{
		if (column == null)
			column = new WHighChartPlotColumnOptions();

		return column;
	}

	public WHighChartPlotOptions setColumn(WHighChartPlotColumnOptions column)
	{
		this.column = column;
		return this;
	}

	public WHighChartPlotLineOptions getLine()
	{
		if (line == null)
			line = new WHighChartPlotLineOptions();

		return line;
	}

	public WHighChartPlotOptions setLine(WHighChartPlotLineOptions line)
	{
		this.line = line;
		return this;
	}

	public WHighChartPlotPieOptions getPie()
	{
		if (pie == null)
			pie = new WHighChartPlotPieOptions();

		return pie;
	}

	public WHighChartPlotOptions setPie(WHighChartPlotPieOptions pie)
	{
		this.pie = pie;
		return this;
	}

	public WHighChartPlotSeriesOptions getSeries()
	{
		if (series == null)
			series = new WHighChartPlotSeriesOptions();

		return series;
	}

	public WHighChartPlotOptions setSeries(WHighChartPlotSeriesOptions series)
	{
		this.series = series;
		return this;
	}

	public WHighChartPlotScatterOptions getScatter()
	{
		if (scatter == null)
			scatter = new WHighChartPlotScatterOptions();

		return scatter;
	}

	public WHighChartPlotOptions setScatter(WHighChartPlotScatterOptions scatter)
	{
		this.scatter = scatter;
		return this;
	}

	public WHighChartPlotSplineOptions getSpline()
	{
		if (spline == null)
			spline = new WHighChartPlotSplineOptions();

		return spline;
	}

	public WHighChartPlotOptions setSpline(WHighChartPlotSplineOptions spline)
	{
		this.spline = spline;
		return this;
	}
}
