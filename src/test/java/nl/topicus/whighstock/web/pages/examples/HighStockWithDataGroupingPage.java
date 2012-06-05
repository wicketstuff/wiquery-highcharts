package nl.topicus.whighstock.web.pages.examples;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import nl.topicus.whighcharts.options.chart.WHighChartChartOptionsZoomType;
import nl.topicus.whighcharts.options.series.ValueSeriesEntry;
import nl.topicus.whighcharts.web.pages.BasePage;
import nl.topicus.whighstock.components.WHighStock;
import nl.topicus.whighstock.options.rangeselector.WHighStockButtonOptions;
import nl.topicus.whighstock.options.rangeselector.WHighStockButtonOptions.WHighStockButtonType;
import nl.topicus.whighstock.options.series.WHighStockValueSeries;
import nl.topicus.whighstock.options.yaxis.WHighStockYAxisOptions;

import org.apache.commons.io.FileUtils;
import org.odlabs.wiquery.core.javascript.JsStatement;

public class HighStockWithDataGroupingPage extends BasePage
{
	private static final long serialVersionUID = 1L;

	public HighStockWithDataGroupingPage()
	{
		WHighStock chart = new WHighStock("container")
		{
			private static final long serialVersionUID = 1L;

			@Override
			public JsStatement statement()
			{
				JsStatement statement = new JsStatement();
				statement.append("var start = + new Date();\n");
				statement.append(super.statement().render());
				return statement;
			}

		};

		StringBuilder onLoad = new StringBuilder("	this.setTitle(null, {\n");
		onLoad.append("		text: 'Built chart at '+ (new Date() - start) +'ms'\n");
		onLoad.append("	});\n");
		chart.getOptions().getChart().getEvents().setLoad(onLoad.toString());
		chart.getOptions().getChart().setZoomType(WHighChartChartOptionsZoomType.x);

		chart.getOptions().getRangeSelector()
			.add(new WHighStockButtonOptions(WHighStockButtonType.day, 3, "3d"));
		chart.getOptions().getRangeSelector()
			.add(new WHighStockButtonOptions(WHighStockButtonType.week, 1, "1w"));
		chart.getOptions().getRangeSelector()
			.add(new WHighStockButtonOptions(WHighStockButtonType.month, 1, "1m"));
		chart.getOptions().getRangeSelector()
			.add(new WHighStockButtonOptions(WHighStockButtonType.month, 6, "6m"));
		chart.getOptions().getRangeSelector()
			.add(new WHighStockButtonOptions(WHighStockButtonType.year, 1, "1y"));
		chart.getOptions().getRangeSelector()
			.add(new WHighStockButtonOptions(WHighStockButtonType.all, null, "all"));
		chart.getOptions().getRangeSelector().setSelected(3);

		WHighStockYAxisOptions yAxis = new WHighStockYAxisOptions();
		yAxis.getTitle().setText("Temperature (°C)");
		chart.getOptions().addyAxis(yAxis);

		chart.getOptions().getTitle()
			.setText("Hourly temperatures in Vik i Sogn, Norway, 2004-2010");
		chart.getOptions().getSubtitle().setText("Built chart at...");

		WHighStockValueSeries<Double> serie = getValues();
		serie.setName("Temperature");
		Calendar startPoint = Calendar.getInstance();
		startPoint.set(Calendar.YEAR, 2004);
		startPoint.set(Calendar.MONTH, 3);
		startPoint.set(Calendar.DAY_OF_MONTH, 1);
		startPoint.set(Calendar.HOUR, 0);
		startPoint.set(Calendar.MINUTE, 0);
		startPoint.set(Calendar.SECOND, 0);
		startPoint.set(Calendar.MILLISECOND, 0);

		serie.setPointStart(startPoint.getTime().getTime());
		serie.setPointInterval(3600 * 1000);
		serie.getTooltip().setyDecimals(1);
		serie.getTooltip().setySuffix("°C");
		chart.getOptions().addSeries(serie);
		add(chart);
	}

	private WHighStockValueSeries<Double> getValues()
	{
		WHighStockValueSeries<Double> serie = new WHighStockValueSeries<Double>();

		// csv file containing data
		try
		{

			for (String line : FileUtils.readLines(new File(HighStockWithDataGroupingPage.class
				.getResource("/nl/topicus/whighstock/web/pages/examples/large-dataset.csv")
				.getFile())))
			{
				if (line != null && !"null".equals(line))
					serie.addEntry(Double.valueOf(line));
				else
					serie.addEntry(new ValueSeriesEntry<Double>(null));
			}
		}
		catch (IOException exception)
		{
			throw new RuntimeException(exception);
		}

		return serie;
	}
}
