package nl.topicus.whighstock.options.plotoptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockPlotAreaOptions extends
		AbstractWHighStockPlotChartOptions<WHighStockPlotAreaOptions>
{
	private static final long serialVersionUID = 1L;

	/**
	 * Fill color or gradient for the area. When null, the series' color is used with the
	 * series' fillOpacity.
	 * 
	 * Defaults to null.
	 */
	private String fillColor;

	/**
	 * Fill opacity for the area.
	 * 
	 * Defaults to .75.
	 */
	private Number fillOpacity;

	/**
	 * A separate color for the graph line. By default the line takes the color of the
	 * series, but the lineColor setting allows setting a separate color for the line
	 * without altering the fillColor.
	 * 
	 * Defaults to null.
	 */
	private String lineColor;

	/**
	 * The Y axis value to serve as the base for the area, for distinguishing between
	 * values above and below a threshold.
	 * 
	 * Defaults to 0.
	 */
	private Number threshold;

	public String getFillColor()
	{
		return fillColor;
	}

	public WHighStockPlotAreaOptions setFillColor(String fillColor)
	{
		this.fillColor = fillColor;
		return this;
	}

	public Number getFillOpacity()
	{
		return fillOpacity;
	}

	public WHighStockPlotAreaOptions setFillOpacity(Number fillOpacity)
	{
		this.fillOpacity = fillOpacity;
		return this;
	}

	public String getLineColor()
	{
		return lineColor;
	}

	public WHighStockPlotAreaOptions setLineColor(String lineColor)
	{
		this.lineColor = lineColor;
		return this;
	}

	public Number getThreshold()
	{
		return threshold;
	}

	public WHighStockPlotAreaOptions setThreshold(Number threshold)
	{
		this.threshold = threshold;
		return this;
	}

}
