package nl.topicus.whighcharts.web.pages.examples;

import nl.topicus.whighcharts.components.WHighChart;
import nl.topicus.whighcharts.options.chart.WHighChartChartOptionsType;
import nl.topicus.whighcharts.options.series.IntegerSeries;
import nl.topicus.whighcharts.options.series.IntegerSeriesEntry;
import nl.topicus.whighcharts.web.pages.BasePage;

public class AreaNegativePage extends BasePage
{
	private static final long serialVersionUID = 1L;

	public AreaNegativePage()
	{
		WHighChart<Integer, IntegerSeriesEntry> chart =
			new WHighChart<Integer, IntegerSeriesEntry>("container");
		chart.getOptions().getExporting().setEnabled(true);
		chart.getOptions().getChart().setType(WHighChartChartOptionsType.area);
		chart.getOptions().getTitle().setText("Area chart with negative values");

		chart.getOptions().getxAxis().setCategories("Apples", "Oranges", "Pears", "Grapes",
			"Bananas");

		chart.getOptions().getTooltip()
			.setFormatter("return ''+ this.series.name +': '+ this.y +'';");

		chart.getOptions().getCredits().setEnabled(false);

		chart.getOptions().addSeries(new IntegerSeries(5, 3, 4, 7, 2).setName("John"));
		chart.getOptions().addSeries(new IntegerSeries(2, -2, -3, 2, 1).setName("Jane"));
		chart.getOptions().addSeries(new IntegerSeries(3, 4, 4, -2, 5).setName("Joe"));

		add(chart);
	}
}
