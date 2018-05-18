package nl.topicus.whighcharts.web.pages.examples;

import nl.topicus.whighcharts.components.WHighChart;
import nl.topicus.whighcharts.options.WHighChartHorizontalAlignmentType;
import nl.topicus.whighcharts.options.WHighChartVerticalAlignmentType;
import nl.topicus.whighcharts.options.chart.WHighChartChartOptionsType;
import nl.topicus.whighcharts.options.legend.WHighChartLegendLayoutType;
import nl.topicus.whighcharts.options.series.IntegerSeries;
import nl.topicus.whighcharts.options.series.IntegerSeriesEntry;
import nl.topicus.whighcharts.web.pages.BasePage;

public class AreaInvertedPage extends BasePage
{
	private static final long serialVersionUID = 1L;

	public AreaInvertedPage()
	{
		WHighChart<Integer, IntegerSeriesEntry> chart =
			new WHighChart<Integer, IntegerSeriesEntry>("container");
		chart.getOptions().getExporting().setEnabled(true);

		chart.getOptions().getChart().setType(WHighChartChartOptionsType.area).setInverted(true);
		chart.getOptions().getTitle().setText("Average fruit consumption during one week");
		chart.getOptions().getSubtitle()
			.setStyle("position: 'absolute', right: '0px', bottom: '10px'");

		chart.getOptions().getLegend().setLayout(WHighChartLegendLayoutType.vertical)
			.setAlign(WHighChartHorizontalAlignmentType.right)
			.setVerticalAlign(WHighChartVerticalAlignmentType.top).setX(-150).setY(100)
			.setFloating(true).setBorderWidth(1).setBackgroundColor("#FFFFFF");

		chart.getOptions().getxAxis().setCategories("Monday", "Tuesday", "Wednesday", "Thursday",
			"Friday", "Saturday", "Sunday");

		chart.getOptions().getyAxis().getTitle().setText("Number of units");
		chart.getOptions().getyAxis().getLabels().setFormatter("return this.value;");
		chart.getOptions().getyAxis().setMin(0);

		chart.getOptions().getTooltip().setFormatter("return ''+ this.x +': '+ this.y;");

		chart.getOptions().getPlotOptions().getArea().setFillOpacity(0.5d);

		chart.getOptions().addSeries(new IntegerSeries(3, 4, 3, 5, 4, 10, 12).setName("John"));
		chart.getOptions().addSeries(new IntegerSeries(1, 3, 4, 3, 3, 5, 4).setName("Jane"));

		add(chart);
	}
}
