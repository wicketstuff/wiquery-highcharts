/**
 * 
 */
package nl.topicus.whighstock.options;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import nl.topicus.whighcharts.options.credits.WHighChartCreditsOptions;
import nl.topicus.whighcharts.options.exporting.WHighChartExportingOptions;
import nl.topicus.whighcharts.options.global.WHighChartGlobalOptions;
import nl.topicus.whighcharts.options.labels.WHighChartLabelsOptions;
import nl.topicus.whighcharts.options.loading.WHighChartLoadingOptions;
import nl.topicus.whighcharts.options.navigation.WHighChartNavigationOptions;
import nl.topicus.whighcharts.options.series.ISeries;
import nl.topicus.whighcharts.options.subtitle.WHighChartsSubtitleOptions;
import nl.topicus.whighcharts.options.symbols.WHighChartSymbolsOptionsType;
import nl.topicus.whighcharts.options.title.WHighChartTitleOptions;
import nl.topicus.whighstock.components.WHighStock;
import nl.topicus.whighstock.options.chart.WHighStockChartOptions;
import nl.topicus.whighstock.options.lang.WHighStockLangOptions;
import nl.topicus.whighstock.options.legend.WHighStockLegendOptions;
import nl.topicus.whighstock.options.navigator.WHighStockNavigatorOptions;
import nl.topicus.whighstock.options.plotoptions.WHighStockPlotOptions;
import nl.topicus.whighstock.options.point.WHighStockPointOptions;
import nl.topicus.whighstock.options.rangeselector.WHighStockRangeSelectorOptions;
import nl.topicus.whighstock.options.scrollbar.WHighStockScrollbarOptions;
import nl.topicus.whighstock.options.tooltip.WHighStockTooltipOptions;
import nl.topicus.whighstock.options.yaxis.WHighStockAxisOptions;
import nl.topicus.whighstock.options.yaxis.WHighStockYAxisOptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private WHighStockChartOptions chart;

	private List<String> colors;

	private WHighChartCreditsOptions credits;

	private WHighChartGlobalOptions global;

	private WHighChartLabelsOptions labels;

	private WHighStockLangOptions lang;

	private WHighStockLegendOptions legend;

	private WHighChartLoadingOptions loading;

	private WHighStockNavigatorOptions navigator;

	private WHighStockPlotOptions plotOptions;

	private WHighStockPointOptions point;

	private WHighStockRangeSelectorOptions rangeSelector;

	private WHighStockScrollbarOptions scrollbar;

	private WHighChartsSubtitleOptions subtitle;

	private List<WHighChartSymbolsOptionsType> symbols;

	private WHighChartTitleOptions title;

	private WHighStockTooltipOptions tooltip;

	private List<WHighStockYAxisOptions> yAxis;

	private List<WHighStockAxisOptions> xAxis;

	private List<ISeries> series;

	// exporting module
	private WHighChartExportingOptions exporting;

	private WHighChartNavigationOptions navigation;

	public WHighStockOptions(WHighStock wHighStock)
	{
		getChart().setRenderTo(wHighStock);
	}

	public WHighStockChartOptions getChart()
	{
		if (chart == null)
			chart = new WHighStockChartOptions();
		return chart;
	}

	public WHighStockOptions setChart(WHighStockChartOptions chart)
	{
		this.chart = chart;
		return this;
	}

	public List<String> getColors()
	{
		if (colors == null)
			colors = new ArrayList<String>();
		return colors;
	}

	public WHighStockOptions addColor(String color)
	{
		getColors().add(color);

		return this;
	}

	public WHighChartCreditsOptions getCredits()
	{
		if (credits == null)
			credits = new WHighChartCreditsOptions();
		return credits;
	}

	public WHighStockOptions setCredits(WHighChartCreditsOptions credits)
	{
		this.credits = credits;
		return this;
	}

	public WHighStockOptions setColors(List<String> colors)
	{
		this.colors = colors;
		return this;
	}

	public WHighChartGlobalOptions getGlobal()
	{
		if (global == null)
			global = new WHighChartGlobalOptions();
		return global;
	}

	public WHighStockOptions setGlobal(WHighChartGlobalOptions global)
	{
		this.global = global;
		return this;
	}

	public WHighChartLabelsOptions getLabels()
	{
		if (labels == null)
			labels = new WHighChartLabelsOptions();
		return labels;
	}

	public WHighStockOptions setLabels(WHighChartLabelsOptions labels)
	{
		this.labels = labels;
		return this;
	}

	public WHighStockLangOptions getLang()
	{
		if (lang == null)
			lang = new WHighStockLangOptions();
		return lang;
	}

	public WHighStockOptions setLang(WHighStockLangOptions lang)
	{
		this.lang = lang;
		return this;
	}

	public WHighStockLegendOptions getLegend()
	{
		if (legend == null)
			legend = new WHighStockLegendOptions();
		return legend;
	}

	public WHighStockOptions setLegend(WHighStockLegendOptions legend)
	{
		this.legend = legend;
		return this;
	}

	public WHighChartLoadingOptions getLoading()
	{
		if (loading == null)
			loading = new WHighChartLoadingOptions();
		return loading;
	}

	public WHighStockOptions setLoading(WHighChartLoadingOptions loading)
	{
		this.loading = loading;
		return this;
	}

	public WHighStockNavigatorOptions getNavigator()
	{
		if (navigator == null)
			navigator = new WHighStockNavigatorOptions();
		return navigator;
	}

	public WHighStockOptions setNavigator(WHighStockNavigatorOptions navigator)
	{
		this.navigator = navigator;
		return this;
	}

	public WHighStockPlotOptions getPlotOptions()
	{
		if (plotOptions == null)
			plotOptions = new WHighStockPlotOptions();
		return plotOptions;
	}

	public WHighStockOptions setPlotOptions(WHighStockPlotOptions plotOptions)
	{
		this.plotOptions = plotOptions;
		return this;
	}

	public WHighStockPointOptions getPoint()
	{
		if (point == null)
			point = new WHighStockPointOptions();
		return point;
	}

	public WHighStockOptions setPoint(WHighStockPointOptions point)
	{
		this.point = point;
		return this;
	}

	public WHighStockRangeSelectorOptions getRangeSelector()
	{
		if (rangeSelector == null)
			rangeSelector = new WHighStockRangeSelectorOptions();
		return rangeSelector;
	}

	public WHighStockOptions setRangeSelector(WHighStockRangeSelectorOptions rangeSelector)
	{
		this.rangeSelector = rangeSelector;
		return this;
	}

	public WHighStockScrollbarOptions getScrollbar()
	{
		if (scrollbar == null)
			scrollbar = new WHighStockScrollbarOptions();
		return scrollbar;
	}

	public WHighStockOptions setScrollbar(WHighStockScrollbarOptions scrollbar)
	{
		this.scrollbar = scrollbar;
		return this;
	}

	public WHighChartsSubtitleOptions getSubtitle()
	{
		if (subtitle == null)
			subtitle = new WHighChartsSubtitleOptions();
		return subtitle;
	}

	public WHighStockOptions setSubtitle(WHighChartsSubtitleOptions subtitle)
	{
		this.subtitle = subtitle;
		return this;
	}

	public List<WHighChartSymbolsOptionsType> getSymbols()
	{
		if (symbols == null)
			symbols = new ArrayList<WHighChartSymbolsOptionsType>();
		return symbols;
	}

	public WHighStockOptions addSymbol(WHighChartSymbolsOptionsType symbol)
	{
		getSymbols().add(symbol);
		return this;
	}

	public WHighStockOptions setSymbols(List<WHighChartSymbolsOptionsType> symbols)
	{
		this.symbols = symbols;
		return this;
	}

	public WHighChartTitleOptions getTitle()
	{
		if (title == null)
			title = new WHighChartTitleOptions();
		return title;
	}

	public WHighStockOptions setTitle(WHighChartTitleOptions title)
	{
		this.title = title;
		return this;
	}

	public WHighStockTooltipOptions getTooltip()
	{
		if (tooltip == null)
			tooltip = new WHighStockTooltipOptions();
		return tooltip;
	}

	public WHighStockOptions setTooltip(WHighStockTooltipOptions tooltip)
	{
		this.tooltip = tooltip;
		return this;
	}

	public List<WHighStockYAxisOptions> getyAxis()
	{
		if (yAxis == null)
			yAxis = new ArrayList<WHighStockYAxisOptions>();
		return yAxis;
	}

	public WHighStockOptions addyAxis(WHighStockYAxisOptions yAxisOptions)
	{
		getyAxis().add(yAxisOptions);

		return this;
	}

	public WHighStockOptions setyAxis(List<WHighStockYAxisOptions> yAxis)
	{
		this.yAxis = yAxis;
		return this;
	}

	public List<WHighStockAxisOptions> getxAxis()
	{
		if (xAxis == null)
			xAxis = new ArrayList<WHighStockAxisOptions>();
		return xAxis;
	}

	public WHighStockOptions addxAxis(WHighStockAxisOptions xAxisOptions)
	{
		getxAxis().add(xAxisOptions);

		return this;
	}

	public WHighStockOptions setxAxis(List<WHighStockAxisOptions> xAxis)
	{
		this.xAxis = xAxis;
		return this;
	}

	public List<ISeries> getSeries()
	{
		if (series == null)
			series = new ArrayList<ISeries>();
		return series;
	}

	public WHighStockOptions addSeries(ISeries serieOptions)
	{
		getSeries().add(serieOptions);
		return this;
	}

	public WHighStockOptions setSeries(List<ISeries> series)
	{
		this.series = series;
		return this;
	}

	public WHighChartExportingOptions getExporting()
	{
		if (exporting == null)
			exporting = new WHighChartExportingOptions();
		return exporting;
	}

	public WHighStockOptions setExporting(WHighChartExportingOptions exporting)
	{
		this.exporting = exporting;
		return this;
	}

	public WHighChartNavigationOptions getNavigation()
	{
		if (navigation == null)
			navigation = new WHighChartNavigationOptions();
		return navigation;
	}

	public WHighStockOptions setNavigation(WHighChartNavigationOptions navigation)
	{
		this.navigation = navigation;
		return this;
	}

}
