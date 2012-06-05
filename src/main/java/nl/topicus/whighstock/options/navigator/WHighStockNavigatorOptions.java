package nl.topicus.whighstock.options.navigator;

import java.io.Serializable;

import nl.topicus.whighcharts.options.series.ISeries;
import nl.topicus.whighcharts.options.series.ISeriesEntry;
import nl.topicus.whighstock.options.yaxis.WHighStockAxisOptions;
import nl.topicus.whighstock.options.yaxis.WHighStockYAxisOptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * The navigator is a small series below the main series, displaying a view of the entire
 * data set. It provides tools to zoom in and out on parts of the data as well as panning
 * across the dataset.
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockNavigatorOptions implements Serializable
{

	private static final long serialVersionUID = 1L;

	/**
	 * An integer identifying the index to use for the base series, or a string
	 * representing the id of the series.
	 * 
	 * Defaults to 0.
	 */
	private String baseSeries;

	/**
	 * Enable or disable the navigator
	 * 
	 * Defaults to true.
	 */
	private Boolean enabled;

	/**
	 * The height of the navigator
	 * 
	 * Defaults to 40.
	 */
	private Number height;

	/**
	 * The distance from the nearest element, the X axis or X axis labels
	 * 
	 * Defaults to 10.
	 */
	private Number margin;

	/**
	 * The color of the mask covering the areas of the navigator series that are currently
	 * not visible in the main series. The default color is white with an opacity of 0.75
	 * to see the series below.
	 * 
	 * Defaults to rgba(255, 255, 255, 0.75).
	 */
	private String maskFill;

	/**
	 * The color of the line marking the currently zoomed area in the navigator
	 * 
	 * Defaults to #444.
	 */
	private String outlineColor;

	/**
	 * The width of the line marking the currently zoomed area in the navigator
	 * 
	 * Defaults to 2.
	 */
	private Number outlineWidth;

	/**
	 * Options for the handles for dragging the zoomed area. Available options are
	 * backgroundColor and borderColor.
	 */
	private Object handles;

	/**
	 * Options for the navigator series. Available options are the same as any series,
	 * documented at plotOptions and series.
	 */
	private ISeries< ? , ISeriesEntry< ? >> series;

	/**
	 * Options for the navigator X axis. Available options are the same as any X axis,
	 * documented at xAxis.
	 */
	private WHighStockAxisOptions xAxis;

	/**
	 * Options for the navigator Y axis. Available options are the same as any y axis,
	 * documented at yAxis.
	 */
	private WHighStockYAxisOptions yAxis;

	public Object getBaseSeries()
	{
		return baseSeries;
	}

	public WHighStockNavigatorOptions setBaseSeries(String baseSeries)
	{
		this.baseSeries = baseSeries;
		return this;
	}

	public WHighStockNavigatorOptions setBaseSeries(Integer baseSeries)
	{
		this.baseSeries = baseSeries.toString();
		return this;
	}

	public Boolean getEnabled()
	{
		return enabled;
	}

	public WHighStockNavigatorOptions setEnabled(Boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}

	public Number getHeight()
	{
		return height;
	}

	public WHighStockNavigatorOptions setHeight(Number height)
	{
		this.height = height;
		return this;
	}

	public Number getMargin()
	{
		return margin;
	}

	public WHighStockNavigatorOptions setMargin(Number margin)
	{
		this.margin = margin;
		return this;
	}

	public String getMaskFill()
	{
		return maskFill;
	}

	public WHighStockNavigatorOptions setMaskFill(String maskFill)
	{
		this.maskFill = maskFill;
		return this;
	}

	public String getOutlineColor()
	{
		return outlineColor;
	}

	public WHighStockNavigatorOptions setOutlineColor(String outlineColor)
	{
		this.outlineColor = outlineColor;
		return this;
	}

	public Number getOutlineWidth()
	{
		return outlineWidth;
	}

	public WHighStockNavigatorOptions setOutlineWidth(Number outlineWidth)
	{
		this.outlineWidth = outlineWidth;
		return this;
	}

	public Object getHandles()
	{
		return handles;
	}

	public WHighStockNavigatorOptions setHandles(Object handles)
	{
		this.handles = handles;
		return this;
	}

	public ISeries< ? , ISeriesEntry< ? >> getSeries()
	{
		return series;
	}

	public WHighStockNavigatorOptions setSeries(ISeries< ? , ISeriesEntry< ? >> series)
	{
		this.series = series;
		return this;
	}

	public WHighStockAxisOptions getxAxis()
	{
		return xAxis;
	}

	public WHighStockNavigatorOptions setxAxis(WHighStockAxisOptions xAxis)
	{
		this.xAxis = xAxis;
		return this;
	}

	public WHighStockYAxisOptions getyAxis()
	{
		return yAxis;
	}

	public WHighStockNavigatorOptions setyAxis(WHighStockYAxisOptions yAxis)
	{
		this.yAxis = yAxis;
		return this;
	}
}
