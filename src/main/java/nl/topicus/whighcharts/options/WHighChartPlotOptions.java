package nl.topicus.whighcharts.options;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
@SuppressWarnings("rawtypes")
public class WHighChartPlotOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private WHighChartPlotAreaOptions area;

	private AbstractWHighChartPlotChartOptions areaspline;

	private AbstractWHighChartPlotChartOptions bar;

	private AbstractWHighChartPlotChartOptions column;

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

	public AbstractWHighChartPlotChartOptions getBar()
	{
		if (bar == null)
			bar = new AbstractWHighChartPlotChartOptions();

		return bar;
	}

	public WHighChartPlotOptions setBar(AbstractWHighChartPlotChartOptions bar)
	{
		this.bar = bar;
		return this;
	}

	public AbstractWHighChartPlotChartOptions getColumn()
	{
		if (column == null)
			column = new AbstractWHighChartPlotChartOptions();

		return column;
	}

	public WHighChartPlotOptions setColumn(AbstractWHighChartPlotChartOptions column)
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
