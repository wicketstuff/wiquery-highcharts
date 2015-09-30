package nl.topicus.whighcharts.options.lang;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

/**
 * Language object. The language object is global and it can't be set on each chart
 * initiation. Instead, use Highcharts.setOptions to set it before any chart is initiated.
 * Highcharts.setOptions({ lang: { months: ['Janvier', 'Février', 'Mars', 'Avril', 'Mai',
 * 'Juin', 'Juillet', 'Août', 'Septembre', 'Octobre', 'Novembre', 'Décembre'], weekdays:
 * ['Dimanche', 'Lundi', 'Mardi', 'Mercredi', 'Jeudi', 'Vendredi', 'Samedi'] } });
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartLangOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * The default decimal point used in the Highcharts.numberFormat method unless
	 * otherwise specified in the function arguments. Defaults to ".".
	 */
	private String decimalPoint;

	/**
	 * Exporting module only. The text for the PNG download menu item. Defaults to
	 * "Download PNG image".
	 */
	private String downloadPNG;

	/**
	 * Exporting module only. The text for the JPEG download menu item. Defaults to
	 * "Download JPEG image".
	 */
	private String downloadJPEG;

	/**
	 * Exporting module only. The text for the PDF download menu item. Defaults to
	 * "Download PDF document".
	 */
	private String downloadPDF;

	/**
	 * Exporting module only. The text for the SVG download menu item. Defaults to
	 * "Download SVG vector image".
	 */
	private String downloadSVG;

	/**
	 * Exporting module only. The tooltip text for the export button. Defaults to
	 * "Export to raster or vector image".
	 */
	private String exportButtonTitle;

	/**
	 * The loading text that appears when the chart is set into the loading state
	 * following a call to chart.showLoading. Defaults to Loading....
	 */
	private String loading;

	/**
	 * An array containing the months names. Defaults to ['January', 'February', 'March',
	 * 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November',
	 * 'December'].
	 */
	private List<String> months;

	/**
	 * Exporting module only. The tooltip text for the print button. Defaults to
	 * "Print the chart".
	 */
	private String printButtonTitle;

	/**
	 * The text for the label appearing when a chart is zoomed. Defaults to Reset zoom.
	 */
	private String resetZoom;

	/**
	 * The tooltip title for the label appearing when a chart is zoomed. Defaults to Reset
	 * zoom level 1:1.
	 */
	private String resetZoomTitle;

	/**
	 * The default thousands separator used in the Highcharts.numberFormat method unless
	 * otherwise specified in the function arguments. Defaults to ",".
	 */
	private String thousandsSep;

	/**
	 * An array containing the weekday names. Defaults to ['Sunday', 'Monday', 'Tuesday',
	 * 'Wednesday', 'Thursday', 'Friday', 'Saturday'].
	 */
	private List<String> weekdays;

	public String getDecimalPoint()
	{
		return decimalPoint;
	}

	public WHighChartLangOptions setDecimalPoint(String decimalPoint)
	{
		this.decimalPoint = decimalPoint;
		return this;
	}

	public String getDownloadPNG()
	{
		return downloadPNG;
	}

	public WHighChartLangOptions setDownloadPNG(String downloadPNG)
	{
		this.downloadPNG = downloadPNG;
		return this;
	}

	public String getDownloadJPEG()
	{
		return downloadJPEG;
	}

	public WHighChartLangOptions setDownloadJPEG(String downloadJPEG)
	{
		this.downloadJPEG = downloadJPEG;
		return this;
	}

	public String getDownloadPDF()
	{
		return downloadPDF;
	}

	public WHighChartLangOptions setDownloadPDF(String downloadPDF)
	{
		this.downloadPDF = downloadPDF;
		return this;
	}

	public String getDownloadSVG()
	{
		return downloadSVG;
	}

	public WHighChartLangOptions setDownloadSVG(String downloadSVG)
	{
		this.downloadSVG = downloadSVG;
		return this;
	}

	public String getExportButtonTitle()
	{
		return exportButtonTitle;
	}

	public WHighChartLangOptions setExportButtonTitle(String exportButtonTitle)
	{
		this.exportButtonTitle = exportButtonTitle;
		return this;
	}

	public String getLoading()
	{
		return loading;
	}

	public WHighChartLangOptions setLoading(String loading)
	{
		this.loading = loading;
		return this;
	}

	public List<String> getMonths()
	{
		return months;
	}

	public WHighChartLangOptions setMonths(List<String> months)
	{
		this.months = months;
		return this;
	}

	public WHighChartLangOptions setMonths(String... months)
	{
		this.months = Arrays.asList(months);
		return this;
	}

	public String getPrintButtonTitle()
	{
		return printButtonTitle;
	}

	public WHighChartLangOptions setPrintButtonTitle(String printButtonTitle)
	{
		this.printButtonTitle = printButtonTitle;
		return this;
	}

	public String getResetZoom()
	{
		return resetZoom;
	}

	public WHighChartLangOptions setResetZoom(String resetZoom)
	{
		this.resetZoom = resetZoom;
		return this;
	}

	public String getResetZoomTitle()
	{
		return resetZoomTitle;
	}

	public WHighChartLangOptions setResetZoomTitle(String resetZoomTitle)
	{
		this.resetZoomTitle = resetZoomTitle;
		return this;
	}

	public String getThousandsSep()
	{
		return thousandsSep;
	}

	public WHighChartLangOptions setThousandsSep(String thousandsSep)
	{
		this.thousandsSep = thousandsSep;
		return this;
	}

	public List<String> getWeekdays()
	{
		return weekdays;
	}

	public WHighChartLangOptions setWeekdays(List<String> weekdays)
	{
		this.weekdays = weekdays;
		return this;
	}

	public WHighChartLangOptions setWeekdays(String... weekdays)
	{
		this.weekdays = Arrays.asList(weekdays);
		return this;
	}

}
