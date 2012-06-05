package nl.topicus.whighcharts.options.exporting.buttons;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartButtonsOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Options for the export button.
	 */
	private WHighChartExportButtonOptions exportButton;

	/**
	 * Options for the print button.
	 */
	private WHighChartPrintButtonOptions printButton;

	public WHighChartExportButtonOptions getExportButton()
	{
		if (exportButton == null)
		{
			exportButton = new WHighChartExportButtonOptions();
		}
		return exportButton;
	}

	public WHighChartButtonsOptions setExportButton(WHighChartExportButtonOptions exportButton)
	{
		this.exportButton = exportButton;
		return this;
	}

	public WHighChartPrintButtonOptions getPrintButton()
	{
		if (printButton == null)
		{
			printButton = new WHighChartPrintButtonOptions();
		}
		return printButton;
	}

	public WHighChartButtonsOptions setPrintButton(WHighChartPrintButtonOptions printButton)
	{
		this.printButton = printButton;
		return this;
	}

}
