package nl.topicus.whighcharts.options;

import java.io.Serializable;

import nl.topicus.whighcharts.components.WHighChart;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Reference to the main chart object, not to be serialized into an option;
	 */
	@JsonIgnore
	private WHighChart wHighChart;

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

	private WHighChartSeriesOptions series;

	private WHighChartSubtitleOptions subtitle;

	private WHighChartSymbolsOptions symbols;

	private WHighChartXAxisOptions xAxis;

	private WHighChartYAxisOptions yAxis;

	/**
	 * Exporting module
	 */

	private WHighChartExportingOptions exporting;

	private WHighChartNavigationOptions navigation;

	public WHighChartOptions(WHighChart wHighChart)
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

	public WHighChartSeriesOptions getSeries()
	{
		if (series == null)
			series = new WHighChartSeriesOptions();
		return series;
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

	public WHighChart getwHighChart()
	{
		return wHighChart;
	}

	public WHighChartXAxisOptions getxAxis()
	{
		if (xAxis == null)
			xAxis = new WHighChartXAxisOptions();
		return xAxis;
	}

	public WHighChartYAxisOptions getyAxis()
	{
		if (yAxis == null)
			yAxis = new WHighChartYAxisOptions();
		return yAxis;
	}

	public WHighChartOptions setChart(WHighChartChartOptions chart)
	{
		this.chart = chart;
		return this;
	}

	public WHighChartOptions setColors(WHighChartColorsOptions colors)
	{
		this.colors = colors;
		return this;
	}

	public WHighChartOptions setCredits(WHighChartCreditsOptions credits)
	{
		this.credits = credits;
		return this;
	}

	public WHighChartOptions setExporting(WHighChartExportingOptions exporting)
	{
		this.exporting = exporting;
		return this;
	}

	public WHighChartOptions setGlobal(WHighChartGlobalOptions global)
	{
		this.global = global;
		return this;
	}

	public WHighChartOptions setLabels(WHighChartLabelsOptions labels)
	{
		this.labels = labels;
		return this;
	}

	public WHighChartOptions setLang(WHighChartLangOptions lang)
	{
		this.lang = lang;
		return this;
	}

	public WHighChartOptions setLegend(WHighChartLegendOptions legend)
	{
		this.legend = legend;
		return this;
	}

	public WHighChartOptions setLoading(WHighChartLoadingOptions loading)
	{
		this.loading = loading;
		return this;
	}

	public WHighChartOptions setNavigation(WHighChartNavigationOptions navigation)
	{
		this.navigation = navigation;
		return this;
	}

	public WHighChartOptions setPlotOptions(WHighChartPlotOptions plotOptions)
	{
		this.plotOptions = plotOptions;
		return this;
	}

	public WHighChartOptions setPoint(WHighChartPointOptions point)
	{
		this.point = point;
		return this;
	}

	public WHighChartOptions setSeries(WHighChartSeriesOptions series)
	{
		this.series = series;
		return this;
	}

	public WHighChartOptions setSubtitle(WHighChartSubtitleOptions subtitle)
	{
		this.subtitle = subtitle;
		return this;
	}

	public WHighChartOptions setSymbols(WHighChartSymbolsOptions symbols)
	{
		this.symbols = symbols;
		return this;
	}

	public WHighChartOptions setTitle(WHighChartTitleOptions title)
	{
		this.title = title;
		return this;
	}

	public WHighChartOptions setTooltip(WHighChartTooltipOptions tooltip)
	{
		this.tooltip = tooltip;
		return this;
	}

	public WHighChartOptions setxAxis(WHighChartXAxisOptions xAxis)
	{
		this.xAxis = xAxis;
		return this;
	}

	public WHighChartOptions setyAxis(WHighChartYAxisOptions yAxis)
	{
		this.yAxis = yAxis;
		return this;
	}
}
