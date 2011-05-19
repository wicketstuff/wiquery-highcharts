package nl.topicus.whighcharts.web.pages.examples;

import nl.topicus.whighcharts.components.WHighChart;
import nl.topicus.whighcharts.options.WHighChartHorizontalAlignmentType;
import nl.topicus.whighcharts.options.WHighChartVerticalAlignmentType;
import nl.topicus.whighcharts.options.chart.WHighChartChartOptionsType;
import nl.topicus.whighcharts.options.legend.WHighChartLegendLayoutType;
import nl.topicus.whighcharts.options.series.ValueSeries;
import nl.topicus.whighcharts.options.series.ValueSeriesEntry;
import nl.topicus.whighcharts.web.pages.BasePage;

public class AreaMissingPage extends BasePage
{
	private static final long serialVersionUID = 1L;

	public AreaMissingPage()
	{
		WHighChart<Integer, ValueSeriesEntry<Integer>> chart =
			new WHighChart<Integer, ValueSeriesEntry<Integer>>("container");
		chart.getOptions().getExporting().setEnabled(true);

		chart.getOptions().getChart().setType(WHighChartChartOptionsType.area)
			.setSpacingBottom(30d);
		chart.getOptions().getTitle().setText("Fruit consumption *");
		chart.getOptions().getSubtitle().setText("* Jane\'s banana consumption is unknown")
			.setFloating(true).setAlign(WHighChartHorizontalAlignmentType.right)
			.setVerticalAlign(WHighChartVerticalAlignmentType.bottom).setY(15);

		chart.getOptions().getLegend().setLayout(WHighChartLegendLayoutType.vertical)
			.setAlign(WHighChartHorizontalAlignmentType.left)
			.setVerticalAlign(WHighChartVerticalAlignmentType.top).setX(150).setY(100)
			.setFloating(true).setBorderWidth(1).setBackgroundColor("#FFFFFF");

		chart
			.getOptions()
			.getxAxis()
			.setCategories("Apples", "Pears", "Oranges", "Bananas", "Grapes", "Plums",
				"Strawberries", "Raspberries");

		chart.getOptions().getyAxis().getTitle().setText("Y-Axis");
		chart.getOptions().getyAxis().getLabels().setFormatter("function() { return this.value; }");

		chart
			.getOptions()
			.getTooltip()
			.setFormatter(
				"function() { return '<b>'+ this.series.name +'</b><br/>'+this.x +': '+ this.y; }");

		chart.getOptions().getPlotOptions().getArea().setFillOpacity(0.5d);

		chart.getOptions().getCredits().setEnabled(false);

		chart.getOptions().addSeries(
			new ValueSeries<Integer>(0, 1, 4, 4, 5, 2, 3, 7).setName("John"));
		chart.getOptions().addSeries(
			new ValueSeries<Integer>(1, 0, 3, null, 3, 1, 2, 1).setName("Jane"));

		add(chart);
	}
}
