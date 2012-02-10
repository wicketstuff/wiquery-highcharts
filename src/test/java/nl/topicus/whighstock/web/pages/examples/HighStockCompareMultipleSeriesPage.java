package nl.topicus.whighstock.web.pages.examples;

import java.io.File;
import java.io.IOException;

import nl.topicus.whighcharts.options.axis.WHighChartAxisPlotLinesOptions;
import nl.topicus.whighcharts.web.pages.BasePage;
import nl.topicus.whighstock.components.WHighStock;
import nl.topicus.whighstock.options.series.WHighStockKeyValueSeries;
import nl.topicus.whighstock.options.yaxis.WHighStockYAxisOptions;

import org.apache.commons.io.FileUtils;

public class HighStockCompareMultipleSeriesPage extends BasePage
{
	private static final long serialVersionUID = 1L;

	public HighStockCompareMultipleSeriesPage()
	{
		WHighStock chart = new WHighStock("container");

		chart.getOptions().getRangeSelector().setSelected(4);

		WHighStockYAxisOptions yAxis = new WHighStockYAxisOptions();

		yAxis.getLabels().setFormatter("return (this.value > 0 ? '+' : '') + this.value + '%';");

		WHighChartAxisPlotLinesOptions plotLine = new WHighChartAxisPlotLinesOptions();
		plotLine.setValue(0);
		plotLine.setWidth(2);
		plotLine.setColor("silver");
		yAxis.addPlotLine(plotLine);
		chart.getOptions().addyAxis(yAxis);

		chart.getOptions().getPlotOptions().getSeries().setCompare("percent");

		chart
			.getOptions()
			.getTooltip()
			.setPointFormat(
				"<span style=\"color:{series.color}\">{series.name}</span>: <b>{point.y}</b> ({point.change}%)<br/>");
		chart.getOptions().getTooltip().setyDecimals(2);

		chart.getOptions().addSeries(getValues("MSFT"));
		chart.getOptions().addSeries(getValues("AAPL"));
		chart.getOptions().addSeries(getValues("GOOG"));

		add(chart);
	}

	private WHighStockKeyValueSeries<Long, Double> getValues(String name)
	{
		WHighStockKeyValueSeries<Long, Double> serie = new WHighStockKeyValueSeries<Long, Double>();
		serie.setName(name);

		// csv file containing data
		try
		{

			for (String line : FileUtils.readLines(new File(
				HighStockCompareMultipleSeriesPage.class.getResource(
					"/nl/topicus/whighstock/web/pages/examples/" + name.toLowerCase() + ".csv")
					.getFile())))
			{
				if (!line.startsWith("/*"))
				{
					serie.addEntry(new Long(line.split(",")[0]), new Double(line.split(",")[1]));
				}
			}
		}
		catch (IOException exception)
		{
			throw new RuntimeException(exception);
		}
		return serie;
	}
}
