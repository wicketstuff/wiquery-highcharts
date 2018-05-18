package nl.topicus.whighcharts.options;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import nl.topicus.whighcharts.components.WHighChart;
import nl.topicus.whighcharts.options.axis.WHighChartAxisOptions;
import nl.topicus.whighcharts.options.chart.WHighChartChartOptions;
import nl.topicus.whighcharts.options.credits.WHighChartCreditsOptions;
import nl.topicus.whighcharts.options.exporting.WHighChartExportingOptions;
import nl.topicus.whighcharts.options.labels.WHighChartLabelsOptions;
import nl.topicus.whighcharts.options.legend.WHighChartLegendOptions;
import nl.topicus.whighcharts.options.loading.WHighChartLoadingOptions;
import nl.topicus.whighcharts.options.navigation.WHighChartNavigationOptions;
import nl.topicus.whighcharts.options.plotoptions.WHighChartPlotOptions;
import nl.topicus.whighcharts.options.point.WHighChartPointOptions;
import nl.topicus.whighcharts.options.series.ISeries;
import nl.topicus.whighcharts.options.series.ISeriesEntry;
import nl.topicus.whighcharts.options.symbols.WHighChartSymbolsOptionsType;
import nl.topicus.whighcharts.options.title.WHighChartTitleOptions;
import nl.topicus.whighcharts.options.tooltip.WHighChartTooltipOptions;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonInclude(Include.NON_NULL)
public class WHighChartOptions<V, E extends ISeriesEntry<V>> implements Serializable
{
	private static final long serialVersionUID = 1L;

	private WHighChartChartOptions chart;

	private List<String> colors;

	private WHighChartCreditsOptions credits;

	private WHighChartLabelsOptions labels;

	private WHighChartLegendOptions legend;

	private WHighChartLoadingOptions loading;

	private WHighChartPlotOptions plotOptions;

	private WHighChartPointOptions point;

	private WHighChartTitleOptions title;

	private WHighChartTooltipOptions tooltip;

	private List<ISeries<V, E>> series;

	private WHighChartTitleOptions subtitle;

	private List<WHighChartSymbolsOptionsType> symbols;

	private WHighChartAxisOptions xAxis;

	private WHighChartAxisOptions yAxis;

	/**
	 * Exporting module
	 */

	private WHighChartExportingOptions exporting;

	private WHighChartNavigationOptions navigation;

	public WHighChartOptions(WHighChart<V, E> wHighChart)
	{
		getChart().setRenderTo(wHighChart);
	}

	public WHighChartChartOptions getChart()
	{
		if (chart == null)
			chart = new WHighChartChartOptions();
		return chart;
	}

	public List<String> getColors()
	{
		if (colors == null)
			colors = new ArrayList<String>();

		return colors;
	}

	public WHighChartCreditsOptions getCredits()
	{
		if (credits == null)
			credits = new WHighChartCreditsOptions();

		return credits;
	}

	public WHighChartExportingOptions getExporting()
	{
		if (exporting == null)
			exporting = new WHighChartExportingOptions();

		return exporting;
	}

	public WHighChartLabelsOptions getLabels()
	{
		if (labels == null)
			labels = new WHighChartLabelsOptions();

		return labels;
	}

	public WHighChartLegendOptions getLegend()
	{
		if (legend == null)
			legend = new WHighChartLegendOptions();

		return legend;
	}

	public WHighChartLoadingOptions getLoading()
	{
		if (loading == null)
			loading = new WHighChartLoadingOptions();

		return loading;
	}

	public WHighChartPlotOptions getPlotOptions()
	{
		if (plotOptions == null)
			plotOptions = new WHighChartPlotOptions();

		return plotOptions;
	}

	public WHighChartPointOptions getPoint()
	{
		if (point == null)
			point = new WHighChartPointOptions();

		return point;
	}

	public WHighChartNavigationOptions getNavigation()
	{
		if (navigation == null)
			navigation = new WHighChartNavigationOptions();

		return navigation;
	}

	public List<ISeries<V, E>> getSeries()
	{
		if (series == null)
			series = new ArrayList<ISeries<V, E>>();

		return series;
	}

	public WHighChartOptions<V, E> setSeries(List<ISeries<V, E>> series)
	{
		this.series = series;
		return this;
	}

	public WHighChartOptions<V, E> addSeries(ISeries<V, E> serie)
	{
		getSeries().add(serie);
		return this;
	}

	public WHighChartTitleOptions getSubtitle()
	{
		if (subtitle == null)
			subtitle = new WHighChartTitleOptions();
		return subtitle;
	}

	public WHighChartTitleOptions getTitle()
	{
		if (title == null)
			title = new WHighChartTitleOptions();

		return title;
	}

	public WHighChartTooltipOptions getTooltip()
	{
		if (tooltip == null)
			tooltip = new WHighChartTooltipOptions();

		return tooltip;
	}

	public List<WHighChartSymbolsOptionsType> getSymbols()
	{
		if (symbols == null)
			symbols = new ArrayList<WHighChartSymbolsOptionsType>();

		return symbols;
	}

	public WHighChartAxisOptions getxAxis()
	{
		if (xAxis == null)
			xAxis = new WHighChartAxisOptions();
		return xAxis;
	}

	public WHighChartAxisOptions getyAxis()
	{
		if (yAxis == null)
			yAxis = new WHighChartAxisOptions();
		return yAxis;
	}

	public WHighChartOptions<V, E> setChart(WHighChartChartOptions chart)
	{
		this.chart = chart;
		return this;
	}

	public WHighChartOptions<V, E> setColors(List<String> colors)
	{
		this.colors = colors;
		return this;
	}

	public WHighChartOptions<V, E> setColors(String... colors)
	{
		this.colors = Arrays.asList(colors);
		return this;
	}

	public WHighChartOptions<V, E> setCredits(WHighChartCreditsOptions credits)
	{
		this.credits = credits;
		return this;
	}

	public WHighChartOptions<V, E> setExporting(WHighChartExportingOptions exporting)
	{
		this.exporting = exporting;
		return this;
	}

	public WHighChartOptions<V, E> setLabels(WHighChartLabelsOptions labels)
	{
		this.labels = labels;
		return this;
	}

	public WHighChartOptions<V, E> setLegend(WHighChartLegendOptions legend)
	{
		this.legend = legend;
		return this;
	}

	public WHighChartOptions<V, E> setLoading(WHighChartLoadingOptions loading)
	{
		this.loading = loading;
		return this;
	}

	public WHighChartOptions<V, E> setNavigation(WHighChartNavigationOptions navigation)
	{
		this.navigation = navigation;
		return this;
	}

	public WHighChartOptions<V, E> setPlotOptions(WHighChartPlotOptions plotOptions)
	{
		this.plotOptions = plotOptions;
		return this;
	}

	public WHighChartOptions<V, E> setPoint(WHighChartPointOptions point)
	{
		this.point = point;
		return this;
	}

	public WHighChartOptions<V, E> setSubtitle(WHighChartTitleOptions subtitle)
	{
		this.subtitle = subtitle;
		return this;
	}

	public WHighChartOptions<V, E> setSymbols(List<WHighChartSymbolsOptionsType> symbols)
	{
		this.symbols = symbols;
		return this;
	}

	public WHighChartOptions<V, E> setSymbols(WHighChartSymbolsOptionsType... symbols)
	{
		this.symbols = Arrays.asList(symbols);
		return this;
	}

	public WHighChartOptions<V, E> setTitle(WHighChartTitleOptions title)
	{
		this.title = title;
		return this;
	}

	public WHighChartOptions<V, E> setTooltip(WHighChartTooltipOptions tooltip)
	{
		this.tooltip = tooltip;
		return this;
	}

	public WHighChartOptions<V, E> setxAxis(WHighChartAxisOptions xAxis)
	{
		this.xAxis = xAxis;
		return this;
	}

	public WHighChartOptions<V, E> setyAxis(WHighChartAxisOptions yAxis)
	{
		this.yAxis = yAxis;
		return this;
	}
}
