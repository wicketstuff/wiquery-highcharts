package nl.topicus.whighstock.web.pages.examples;

import java.io.File;
import java.io.IOException;

import nl.topicus.whighcharts.web.pages.BasePage;
import nl.topicus.whighstock.components.WHighStock;
import nl.topicus.whighstock.options.series.WHighStockFlagSeries;
import nl.topicus.whighstock.options.series.WHighStockFlagSeriesEntry;
import nl.topicus.whighstock.options.series.WHighStockKeyValueSeries;
import nl.topicus.whighstock.options.series.WHighStockSerieType;
import nl.topicus.whighstock.options.yaxis.WHighStockYAxisOptions;

import org.apache.commons.io.FileUtils;

public class HighStockFlagMarkingEventsPage extends BasePage
{
	private static final long serialVersionUID = 1L;

	public HighStockFlagMarkingEventsPage()
	{
		WHighStock chart = new WHighStock("container");

		chart.getOptions().getRangeSelector().setSelected(1);

		chart.getOptions().getTitle().setText("USD to EUR exchange rate");

		chart.getOptions().getTooltip().setStyle("{width: '200px'}");
		chart.getOptions().getTooltip().setyDecimals(4);

		WHighStockYAxisOptions yAxis = new WHighStockYAxisOptions();
		yAxis.getTitle().setText("Exchange rate");
		chart.getOptions().addyAxis(yAxis);

		WHighStockKeyValueSeries<Long, Double> dataSeries = getValues();
		dataSeries.setName("USD to EUR");
		dataSeries.setId("dataseries");
		chart.getOptions().addSeries(dataSeries);

		WHighStockFlagSeries flags = getFlags();
		flags.setType(WHighStockSerieType.flags);
		flags.setOnSeries("dataseries");
		flags.setShape("circlepin");
		flags.setWidth(16);
		chart.getOptions().addSeries(flags);

		add(chart);
	}

	private WHighStockKeyValueSeries<Long, Double> getValues()
	{
		WHighStockKeyValueSeries<Long, Double> serie = new WHighStockKeyValueSeries<Long, Double>();

		// csv file containing data
		try
		{

			for (String line : FileUtils.readLines(new File(HighStockFlagMarkingEventsPage.class
				.getResource("/nl/topicus/whighstock/web/pages/examples/usdeur.csv").getFile())))
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

	private WHighStockFlagSeries getFlags()
	{
		WHighStockFlagSeries flags = new WHighStockFlagSeries();
		flags.addEntry(new WHighStockFlagSeriesEntry().setX(new Long("1303689600000"))
			.setTitle("H").setText("Euro Contained by Channel Resistance"));
		flags.addEntry(new WHighStockFlagSeriesEntry().setX(new Long("1303948800000"))
			.setTitle("G").setText("EURUSD: Bulls Clear Path to 1.50 Figure"));
		flags.addEntry(new WHighStockFlagSeriesEntry().setX(new Long("1304467200000"))
			.setTitle("F").setText("EURUSD: Rate Decision to End Standstill"));
		flags.addEntry(new WHighStockFlagSeriesEntry().setX(new Long("1304553600000"))
			.setTitle("E").setText("EURUSD: Enter Short on Channel Break"));
		flags
			.addEntry(new WHighStockFlagSeriesEntry()
				.setX(new Long("1304640000000"))
				.setTitle("D")
				.setText(
					"Forex: U.S. Non-Farm Payrolls Expand 244K, U.S. Dollar Rally Cut Short By Risk Appetite"));
		flags.addEntry(new WHighStockFlagSeriesEntry().setX(new Long("1304640000000"))
			.setTitle("C")
			.setText("US Dollar: Is This the Long-Awaited Recovery or a Temporary Bounce?"));
		flags.addEntry(new WHighStockFlagSeriesEntry().setX(new Long("1304899200000"))
			.setTitle("B").setText("EURUSD: Bearish Trend Change on Tap?"));

		return flags;
	}

}
