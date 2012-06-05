/**
 * 
 */
package nl.topicus.whighstock.options.chart;

import nl.topicus.whighcharts.options.chart.WHighChartChartOptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * Options regarding the chart area and plot area as well as general chart options.
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockChartOptions extends WHighChartChartOptions
{
	private static final long serialVersionUID = 1L;

	/**
	 * Allow panning the zoomed area by click and drag on the chart. When the zoomType
	 * option is set, panning is disabled.
	 * 
	 * Defaults to true.
	 */
	private Boolean panning;

	/**
	 * The background color of the marker square when selecting (zooming in on) an area of
	 * the chart.
	 * 
	 * Defaults to rgba(69,114,167,0.25).
	 */
	private String selectionMarkerFill;

	public Boolean getPanning()
	{
		return panning;
	}

	public WHighStockChartOptions setPlanning(Boolean panning)
	{
		this.panning = panning;
		return this;
	}

	public String getSelectionMarkerFill()
	{
		return selectionMarkerFill;
	}

	public WHighStockChartOptions setSelectionMarkerFill(String selectionMarkerFill)
	{
		this.selectionMarkerFill = selectionMarkerFill;
		return this;
	}

	/**
	 * Function not implemented. Not available in HighStock, only in HighCharts
	 */
	@Override
	public Boolean getInverted()
	{
		throw new RuntimeException(
			"Function not implemented. Not available in HighStock, only in HighCharts");
	}

	/**
	 * Function not implemented. Not available in HighStock, only in HighCharts
	 */
	@Override
	public WHighChartChartOptions setInverted(Boolean inverted)
	{
		throw new RuntimeException(
			"Function not implemented. Not available in HighStock, only in HighCharts");
	}

	/**
	 * Function not implemented. Not available in HighStock, only in HighCharts
	 */
	@Override
	public Boolean getShowAxes()
	{
		throw new RuntimeException(
			"Function not implemented. Not available in HighStock, only in HighCharts");
	}

	/**
	 * Function not implemented. Not available in HighStock, only in HighCharts
	 */
	@Override
	public WHighChartChartOptions setShowAxes(Boolean showAxes)
	{
		throw new RuntimeException(
			"Function not implemented. Not available in HighStock, only in HighCharts");
	}

}
