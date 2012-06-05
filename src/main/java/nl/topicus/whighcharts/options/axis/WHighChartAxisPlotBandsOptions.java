package nl.topicus.whighcharts.options.axis;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartAxisPlotBandsOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * The color of the plot band.
	 * 
	 * Defaults to null.
	 */
	private String color;

	/**
	 * The start position of the plot band in axis units.
	 * 
	 * Defaults to null.
	 */
	private Number from;

	/**
	 * An id used for identifying the plot band in Axis.removePlotBand.
	 * 
	 * Defaults to null.
	 */
	private String id;

	/**
	 * Text labels for the plot bands.
	 */
	private WHighChartAxisPlotBandsLabelOptions label;

	/**
	 * The end position of the plot band in axis units.
	 * 
	 * Defaults to null.
	 */
	private Number to;

	/**
	 * The z index of the plot band within the chart.
	 * 
	 * Defaults to null.
	 */
	private Number zIndex;

	public String getColor()
	{
		return color;
	}

	public WHighChartAxisPlotBandsOptions setColor(String color)
	{
		this.color = color;
		return this;
	}

	public Number getFrom()
	{
		return from;
	}

	public WHighChartAxisPlotBandsOptions setFrom(Number from)
	{
		this.from = from;
		return this;
	}

	public String getId()
	{
		return id;
	}

	public WHighChartAxisPlotBandsOptions setId(String id)
	{
		this.id = id;
		return this;
	}

	public WHighChartAxisPlotBandsLabelOptions getLabel()
	{
		if (label == null)
			label = new WHighChartAxisPlotBandsLabelOptions();
		return label;
	}

	public WHighChartAxisPlotBandsOptions setLabel(WHighChartAxisPlotBandsLabelOptions label)
	{
		this.label = label;
		return this;
	}

	public Number getTo()
	{
		return to;
	}

	public WHighChartAxisPlotBandsOptions setTo(Number to)
	{
		this.to = to;
		return this;
	}

	public Number getzIndex()
	{
		return zIndex;
	}

	public WHighChartAxisPlotBandsOptions setzIndex(Number zIndex)
	{
		this.zIndex = zIndex;
		return this;
	}

}
