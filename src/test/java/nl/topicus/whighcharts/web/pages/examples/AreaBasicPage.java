package nl.topicus.whighcharts.web.pages.examples;

import nl.topicus.whighcharts.components.WHighChart;
import nl.topicus.whighcharts.options.chart.WHighChartChartOptionsType;
import nl.topicus.whighcharts.options.plotoptions.WHighChartPlotAreaMarkerSymbolType;
import nl.topicus.whighcharts.options.series.IntegerSeries;
import nl.topicus.whighcharts.options.series.IntegerSeriesEntry;
import nl.topicus.whighcharts.web.pages.BasePage;

public class AreaBasicPage extends BasePage
{
	private static final long serialVersionUID = 1L;

	public AreaBasicPage()
	{
		WHighChart<Integer, IntegerSeriesEntry> chart =
			new WHighChart<Integer, IntegerSeriesEntry>("container");
		chart.getOptions().getExporting().setEnabled(true);

		chart.getOptions().getChart().setType(WHighChartChartOptionsType.area);
		chart.getOptions().getTitle().setText("US and USSR nuclear stockpiles");
		chart.getOptions().getSubtitle().setText(
			"Source: <a href='http://thebulletin.metapress.com/content/c4120650912x74k7/fulltext.pdf'>"
				+ "thebulletin.metapress.com</a>");

		chart.getOptions().getxAxis().getLabels().setFormatter("return this.value;");
		chart.getOptions().getyAxis().getTitle().setText("Nuclear weapon states");
		chart.getOptions().getyAxis().getLabels().setFormatter("return this.value / 1000 +'k';");

		chart.getOptions().getTooltip().setFormatter(
			"return this.series.name +' produced <b>'+ Highcharts.numberFormat(this.y, 0) +'</b><br/>warheads in '+ this.x;");

		chart.getOptions().getPlotOptions().getArea().setPointStart(1940).getMarker()
			.setEnabled(false).setSymbol(WHighChartPlotAreaMarkerSymbolType.circle).setRadius(2)
			.getStates().getHover().setEnabled(true);

		chart.getOptions()
			.addSeries(new IntegerSeries(null, null, null, null, null, 6, 11, 32, 110, 235,
				369, 640, 1005, 1436, 2063, 3057, 4618, 6444, 9822, 15468, 20434, 24126, 27387,
				29459, 31056, 31982, 32040, 31233, 29224, 27342, 26662, 26956, 27912, 28999, 28965,
				27826, 25579, 25722, 24826, 24605, 24304, 23464, 23708, 24099, 24357, 24237, 24401,
				24344, 23586, 22380, 21004, 17287, 14747, 13076, 12555, 12144, 11009, 10950, 10871,
				10824, 10577, 10527, 10475, 10421, 10358, 10295, 10104).setName("USA"));

		chart.getOptions()
			.addSeries(new IntegerSeries(null, null, null, null, null, null, null, null,
				null, null, 5, 25, 50, 120, 150, 200, 426, 660, 869, 1060, 1605, 2471, 3322, 4238,
				5221, 6129, 7089, 8339, 9399, 10538, 11643, 13092, 14478, 15915, 17385, 19055,
				21205, 23044, 25393, 27935, 30062, 32049, 33952, 35804, 37431, 39197, 45000, 43000,
				41000, 39000, 37000, 35000, 33000, 31000, 29000, 27000, 25000, 24000, 23000, 22000,
				21000, 20000, 19000, 18000, 18000, 17000, 16000).setName("USSR/Russia"));

		add(chart);
	}
}
