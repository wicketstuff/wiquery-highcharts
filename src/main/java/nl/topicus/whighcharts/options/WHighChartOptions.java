package nl.topicus.whighcharts.options;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import nl.topicus.whighcharts.components.WHighChart;
import nl.topicus.whighcharts.data.Series;
import nl.topicus.whighcharts.data.SeriesEntry;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartOptions<K, V, E extends SeriesEntry<K, V>> implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Reference to the main chart object, not to be serialized into an option;
	 */
	@JsonIgnore
	private WHighChart<K, V, E> wHighChart;

	private WHighChartChartOptions chart;

	private WHighChartColorsOptions colors;

	private WHighChartCreditsOptions credits;

	private WHighChartGlobalOptions global;

	private WHighChartLabelsOptions labels;

	private WHighChartLangOptions lang;

	private WHighChartLegendOptions legend;

	private WHighChartLoadingOptions loading;

	private WHighChartPointOptions point;

	private WHighChartPlotOptions plotOptions;

	private WHighChartTitleOptions title;

	private WHighChartTooltipOptions tooltip;

	private List<Series<K, V, E>> series;

	private WHighChartSubtitleOptions subtitle;

	private WHighChartSymbolsOptions symbols;

	private WHighChartAxisOptions xAxis;

	private WHighChartAxisOptions yAxis;

	/**
	 * Exporting module
	 */

	private WHighChartExportingOptions exporting;

	private WHighChartNavigationOptions navigation;

	public WHighChartOptions(WHighChart<K, V, E> wHighChart)
	{
		getChart().setRenderTo(wHighChart.getMarkupId());
	}

	public WHighChartChartOptions getChart()
	{
		if (chart == null)
			chart = new WHighChartChartOptions();
		return chart;
	}

	public WHighChartColorsOptions getColors()
	{
		return colors;
	}

	public WHighChartCreditsOptions getCredits()
	{
		return credits;
	}

	public WHighChartExportingOptions getExporting()
	{
		return exporting;
	}

	public WHighChartGlobalOptions getGlobal()
	{
		return global;
	}

	public WHighChartLabelsOptions getLabels()
	{
		return labels;
	}

	public WHighChartLangOptions getLang()
	{
		return lang;
	}

	public WHighChartLegendOptions getLegend()
	{
		return legend;
	}

	public WHighChartLoadingOptions getLoading()
	{
		return loading;
	}

	public WHighChartNavigationOptions getNavigation()
	{
		return navigation;
	}

	public WHighChartPlotOptions getPlotOptions()
	{
		if (plotOptions == null)
			plotOptions = new WHighChartPlotOptions();
		return plotOptions;
	}

	public WHighChartPointOptions getPoint()
	{
		return point;
	}

	public List<Series<K, V, E>> getSeries()
	{
		if (series == null)
			series = new ArrayList<Series<K, V, E>>();
		return series;
	}

	public WHighChartOptions<K, V, E> addSeries(Series<K, V, E> serie)
	{
		getSeries().add(serie);
		return this;
	}

	public WHighChartSubtitleOptions getSubtitle()
	{
		if (subtitle == null)
			subtitle = new WHighChartSubtitleOptions();
		return subtitle;
	}

	public WHighChartSymbolsOptions getSymbols()
	{
		return symbols;
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

	public WHighChart<K, V, E> getwHighChart()
	{
		return wHighChart;
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

	public WHighChartOptions<K, V, E> setChart(WHighChartChartOptions chart)
	{
		this.chart = chart;
		return this;
	}

	public WHighChartOptions<K, V, E> setColors(WHighChartColorsOptions colors)
	{
		this.colors = colors;
		return this;
	}

	public WHighChartOptions<K, V, E> setCredits(WHighChartCreditsOptions credits)
	{
		this.credits = credits;
		return this;
	}

	public WHighChartOptions<K, V, E> setExporting(WHighChartExportingOptions exporting)
	{
		this.exporting = exporting;
		return this;
	}

	public WHighChartOptions<K, V, E> setGlobal(WHighChartGlobalOptions global)
	{
		this.global = global;
		return this;
	}

	public WHighChartOptions<K, V, E> setLabels(WHighChartLabelsOptions labels)
	{
		this.labels = labels;
		return this;
	}

	public WHighChartOptions<K, V, E> setLang(WHighChartLangOptions lang)
	{
		this.lang = lang;
		return this;
	}

	public WHighChartOptions<K, V, E> setLegend(WHighChartLegendOptions legend)
	{
		this.legend = legend;
		return this;
	}

	public WHighChartOptions<K, V, E> setLoading(WHighChartLoadingOptions loading)
	{
		this.loading = loading;
		return this;
	}

	public WHighChartOptions<K, V, E> setNavigation(WHighChartNavigationOptions navigation)
	{
		this.navigation = navigation;
		return this;
	}

	public WHighChartOptions<K, V, E> setPlotOptions(WHighChartPlotOptions plotOptions)
	{
		this.plotOptions = plotOptions;
		return this;
	}

	public WHighChartOptions<K, V, E> setPoint(WHighChartPointOptions point)
	{
		this.point = point;
		return this;
	}

	public WHighChartOptions<K, V, E> setSubtitle(WHighChartSubtitleOptions subtitle)
	{
		this.subtitle = subtitle;
		return this;
	}

	public WHighChartOptions<K, V, E> setSymbols(WHighChartSymbolsOptions symbols)
	{
		this.symbols = symbols;
		return this;
	}

	public WHighChartOptions<K, V, E> setTitle(WHighChartTitleOptions title)
	{
		this.title = title;
		return this;
	}

	public WHighChartOptions<K, V, E> setTooltip(WHighChartTooltipOptions tooltip)
	{
		this.tooltip = tooltip;
		return this;
	}

	public WHighChartOptions<K, V, E> setxAxis(WHighChartAxisOptions xAxis)
	{
		this.xAxis = xAxis;
		return this;
	}

	public WHighChartOptions<K, V, E> setyAxis(WHighChartAxisOptions yAxis)
	{
		this.yAxis = yAxis;
		return this;
	}
}
