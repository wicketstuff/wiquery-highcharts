package nl.topicus.whighstock.options.plotoptions;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockPlotOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private WHighStockPlotAreaOptions area;

	private WHighStockPlotAreaSplineOptions areaspline;

	private WHighStockPlotColumnOptions column;

	private WHighStockPlotLineOptions line;

	private WHighStockPlotSeriesOptions series;

	private WHighStockPlotScatterOptions scatter;

	private WHighStockPlotSplineOptions spline;

	private WHighStockPlotOhlcOptions ohlc;

	private WHighStockPlotCandlestickOptions candlestick;

	private WHighStockPlotFlagsOptions flags;

	public WHighStockPlotAreaOptions getArea()
	{
		if (area == null)
			area = new WHighStockPlotAreaOptions();
		return area;
	}

	public WHighStockPlotOptions setArea(WHighStockPlotAreaOptions area)
	{
		this.area = area;
		return this;
	}

	public WHighStockPlotAreaSplineOptions getAreaspline()
	{
		if (areaspline == null)
			areaspline = new WHighStockPlotAreaSplineOptions();
		return areaspline;
	}

	public WHighStockPlotOptions setAreaspline(WHighStockPlotAreaSplineOptions areaspline)
	{
		this.areaspline = areaspline;
		return this;
	}

	public WHighStockPlotColumnOptions getColumn()
	{
		if (column == null)
			column = new WHighStockPlotColumnOptions();
		return column;
	}

	public WHighStockPlotOptions setColumn(WHighStockPlotColumnOptions column)
	{
		this.column = column;
		return this;
	}

	public WHighStockPlotLineOptions getLine()
	{
		if (line == null)
			line = new WHighStockPlotLineOptions();
		return line;
	}

	public WHighStockPlotOptions setLine(WHighStockPlotLineOptions line)
	{
		this.line = line;
		return this;
	}

	public WHighStockPlotSeriesOptions getSeries()
	{
		if (series == null)
			series = new WHighStockPlotSeriesOptions();
		return series;
	}

	public WHighStockPlotOptions setSeries(WHighStockPlotSeriesOptions series)
	{
		this.series = series;
		return this;
	}

	public WHighStockPlotScatterOptions getScatter()
	{
		if (scatter == null)
			scatter = new WHighStockPlotScatterOptions();
		return scatter;
	}

	public WHighStockPlotOptions setScatter(WHighStockPlotScatterOptions scatter)
	{
		this.scatter = scatter;
		return this;
	}

	public WHighStockPlotSplineOptions getSpline()
	{
		if (spline == null)
			spline = new WHighStockPlotSplineOptions();
		return spline;
	}

	public WHighStockPlotOptions setSpline(WHighStockPlotSplineOptions spline)
	{
		this.spline = spline;
		return this;
	}

	public WHighStockPlotOhlcOptions getOhlc()
	{
		if (ohlc == null)
			ohlc = new WHighStockPlotOhlcOptions();
		return ohlc;
	}

	public WHighStockPlotOptions setOhlc(WHighStockPlotOhlcOptions ohlc)
	{
		this.ohlc = ohlc;
		return this;
	}

	public WHighStockPlotCandlestickOptions getCandlestick()
	{
		if (candlestick == null)
			candlestick = new WHighStockPlotCandlestickOptions();
		return candlestick;
	}

	public WHighStockPlotOptions setCandlestick(WHighStockPlotCandlestickOptions candlestick)
	{
		this.candlestick = candlestick;
		return this;
	}

	public WHighStockPlotFlagsOptions getFlags()
	{
		if (flags == null)
			flags = new WHighStockPlotFlagsOptions();
		return flags;
	}

	public WHighStockPlotOptions setFlags(WHighStockPlotFlagsOptions flags)
	{
		this.flags = flags;
		return this;
	}

}
