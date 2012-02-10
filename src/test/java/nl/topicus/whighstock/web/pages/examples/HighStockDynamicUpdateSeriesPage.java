package nl.topicus.whighstock.web.pages.examples;

import java.util.Calendar;

import nl.topicus.whighcharts.web.pages.BasePage;
import nl.topicus.whighstock.components.WHighStock;
import nl.topicus.whighstock.options.rangeselector.WHighStockButtonOptions;
import nl.topicus.whighstock.options.rangeselector.WHighStockButtonOptions.WHighStockButtonType;
import nl.topicus.whighstock.options.series.WHighStockKeyValueSeries;

public class HighStockDynamicUpdateSeriesPage extends BasePage
{
	private static final long serialVersionUID = 1L;

	public HighStockDynamicUpdateSeriesPage()
	{
		WHighStock chart = new WHighStock("container");

		chart.getOptions().getGlobal().setUseUTC(false);

		StringBuilder onLoad = new StringBuilder("var series = this.series[0];\n");
		onLoad.append("setInterval(function() {\n");
		onLoad.append("    var x = (new Date()).getTime(), // current time\n");
		onLoad.append("    y = Math.round(Math.random() * 100);\n");
		onLoad.append("    series.addPoint([x, y], true, true);\n");
		onLoad.append("}, 1000);\n");
		chart.getOptions().getChart().getEvents().setLoad(onLoad.toString());

		chart.getOptions().getRangeSelector()
			.add(new WHighStockButtonOptions(WHighStockButtonType.minute, 1, "1M"));
		chart.getOptions().getRangeSelector()
			.add(new WHighStockButtonOptions(WHighStockButtonType.minute, 5, "5M"));
		chart.getOptions().getRangeSelector()
			.add(new WHighStockButtonOptions(WHighStockButtonType.all, null, "All"));
		chart.getOptions().getRangeSelector().setInputEnabled(false);
		chart.getOptions().getRangeSelector().setSelected(0);

		chart.getOptions().getTitle().setText("Live random data");

		WHighStockKeyValueSeries<Long, Double> randomData = getValues();
		randomData.setName("Random Data");
		chart.getOptions().addSeries(randomData);

		add(chart);
	}

	private WHighStockKeyValueSeries<Long, Double> getValues()
	{
		WHighStockKeyValueSeries<Long, Double> serie = new WHighStockKeyValueSeries<Long, Double>();

		Long timeStamp = Calendar.getInstance().getTime().getTime();

		for (int i = -999; i <= 0; i++)
		{
			serie.addEntry(timeStamp + i, Math.random() * 100);
		}
		return serie;
	}
}
