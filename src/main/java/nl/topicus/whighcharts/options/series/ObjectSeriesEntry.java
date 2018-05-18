package nl.topicus.whighcharts.options.series;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonInclude(Include.NON_NULL)
public class ObjectSeriesEntry implements ISeriesEntry<Number>
{
	private static final long serialVersionUID = 1L;

	/**
	 * Individual color for the point. Defaults to null.
	 */
	private String color;

	/**
	 * Individual events for the point. Defaults to null.
	 */
	private String events;

	/**
	 * An id for the point. This can be used after render time to get a pointer to the point
	 * object through chart.get(). Defaults to null.
	 */
	private String id;

	/**
	 * An individual point marker for the point. Defaults to null.
	 */
	private String marker;

	/**
	 * The name of the point as shown in the legend, tooltip, dataLabel etc. Defaults to "".
	 */
	private String name;

	/**
	 * Pie series only. Whether to display a slice offset from the center. Defaults to false.
	 */
	private Boolean sliced;

	/**
	 * The x value of the point Defaults to null.
	 */
	private Number x;

	/**
	 * The y value of the point Defaults to null.
	 */
	private Number y;

	public ObjectSeriesEntry(String name, Number value)
	{
		setName(name);
		setY(value);
	}

	public String getColor()
	{
		return color;
	}

	public ObjectSeriesEntry setColor(String color)
	{
		this.color = color;
		return this;
	}

	public String getEvents()
	{
		return events;
	}

	public ObjectSeriesEntry setEvents(String events)
	{
		this.events = events;
		return this;
	}

	public String getId()
	{
		return id;
	}

	public ObjectSeriesEntry setId(String id)
	{
		this.id = id;
		return this;
	}

	public String getMarker()
	{
		return marker;
	}

	public ObjectSeriesEntry setMarker(String marker)
	{
		this.marker = marker;
		return this;
	}

	public String getName()
	{
		return name;
	}

	public ObjectSeriesEntry setName(String name)
	{
		this.name = name;
		return this;
	}

	public Boolean getSliced()
	{
		return sliced;
	}

	public ObjectSeriesEntry setSliced(Boolean sliced)
	{
		this.sliced = sliced;
		return this;
	}

	public Number getX()
	{
		return x;
	}

	public ObjectSeriesEntry setX(Number x)
	{
		this.x = x;
		return this;
	}

	public Number getY()
	{
		return y;
	}

	public ObjectSeriesEntry setY(Number y)
	{
		this.y = y;
		return this;
	}

	@Override
	public Number getValue()
	{
		return getY();
	}
}