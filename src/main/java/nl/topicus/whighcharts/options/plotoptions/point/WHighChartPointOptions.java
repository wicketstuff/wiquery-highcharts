package nl.topicus.whighcharts.options.plotoptions.point;

import java.io.Serializable;

import nl.topicus.whighcharts.options.plotoptions.marker.WHighChartMarkerOptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartPointOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Individual color for the point.
	 * 
	 * Defaults to null.
	 */
	private String color;

	/**
	 * Individual events for the point.
	 * 
	 * Defaults to null.
	 */
	private WHighChartPointEventsOptions events;

	/**
	 * An id for the point. This can be used after render time to get a pointer to the
	 * point object through chart.get().
	 * 
	 * Defaults to null.
	 */
	private String id;

	/**
	 * An individual point marker for the point.
	 * 
	 * Defaults to null.
	 */
	private WHighChartMarkerOptions marker;

	/**
	 * Pies only. The sequential index of the pie slice in the legend.
	 * 
	 * Defaults to undefined.
	 */
	private Number legendIndex;

	/**
	 * The name of the point as shown in the legend, tooltip, dataLabel etc.
	 * 
	 * Defaults to "".
	 */
	private String name;

	/**
	 * Pie series only. Whether to display a slice offset from the center.
	 * 
	 * Defaults to false.
	 */
	private Boolean sliced;

	/**
	 * The x value of the point
	 * 
	 * Defaults to null.
	 */
	private Number x;

	/**
	 * The y value of the point
	 * 
	 * Defaults to null.
	 */
	private Number y;

	public String getColor()
	{
		return color;
	}

	public WHighChartPointOptions setColor(String color)
	{
		this.color = color;
		return this;
	}

	public WHighChartPointEventsOptions getEvents()
	{
		if (events == null)
			events = new WHighChartPointEventsOptions();

		return events;
	}

	public WHighChartPointOptions setEvents(WHighChartPointEventsOptions events)
	{
		this.events = events;
		return this;
	}

	public String getId()
	{
		return id;
	}

	public WHighChartPointOptions setId(String id)
	{
		this.id = id;
		return this;
	}

	public WHighChartMarkerOptions getMarker()
	{
		if (marker == null)
		{
			marker = new WHighChartMarkerOptions();
		}
		return marker;
	}

	public WHighChartPointOptions setMarker(WHighChartMarkerOptions marker)
	{
		this.marker = marker;
		return this;
	}

	public Number getLegendIndex()
	{
		return legendIndex;
	}

	public WHighChartPointOptions setLegendIndex(Number legendIndex)
	{
		this.legendIndex = legendIndex;
		return this;
	}

	public String getName()
	{
		return name;
	}

	public WHighChartPointOptions setName(String name)
	{
		this.name = name;
		return this;
	}

	public Boolean getSliced()
	{
		return sliced;
	}

	public WHighChartPointOptions setSliced(Boolean sliced)
	{
		this.sliced = sliced;
		return this;
	}

	public Number getX()
	{
		return x;
	}

	public WHighChartPointOptions setX(Number x)
	{
		this.x = x;
		return this;
	}

	public Number getY()
	{
		return y;
	}

	public WHighChartPointOptions setY(Number y)
	{
		this.y = y;
		return this;
	}
}
