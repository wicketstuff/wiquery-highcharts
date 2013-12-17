package nl.topicus.whighcharts.options.plotoptions;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonInclude(Include.NON_NULL)
@SuppressWarnings("rawtypes")
public class WHighChartPlotOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private WHighChartPlotAreaOptions area;

	private AbstractWHighChartPlotChartOptions areaspline;

	private WHighChartPlotBarOptions bar;

	private WHighChartPlotColumnOptions column;

	private AbstractWHighChartPlotChartOptions line;

	private WHighChartPlotPieOptions pie;

	private WHighChartPlotSeriesOptions series;

	private AbstractWHighChartPlotChartOptions scatter;

	private AbstractWHighChartPlotChartOptions spline;

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

	public AbstractWHighChartPlotChartOptions getAreaspline()
	{
		if (areaspline == null)
			areaspline = new AbstractWHighChartPlotChartOptions();

		return areaspline;
	}

	public WHighChartPlotOptions setAreaspline(AbstractWHighChartPlotChartOptions areaspline)
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

	public AbstractWHighChartPlotChartOptions getLine()
	{
		if (line == null)
			line = new AbstractWHighChartPlotChartOptions();

		return line;
	}

	public WHighChartPlotOptions setLine(AbstractWHighChartPlotChartOptions line)
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

	public AbstractWHighChartPlotChartOptions getScatter()
	{
		if (scatter == null)
			scatter = new AbstractWHighChartPlotChartOptions();

		return scatter;
	}

	public WHighChartPlotOptions setScatter(AbstractWHighChartPlotChartOptions scatter)
	{
		this.scatter = scatter;
		return this;
	}

	public AbstractWHighChartPlotChartOptions getSpline()
	{
		if (spline == null)
			spline = new AbstractWHighChartPlotChartOptions();

		return spline;
	}

	public WHighChartPlotOptions setSpline(AbstractWHighChartPlotChartOptions spline)
	{
		this.spline = spline;
		return this;
	}
}
