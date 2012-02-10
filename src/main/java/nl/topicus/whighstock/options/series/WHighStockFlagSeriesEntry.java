package nl.topicus.whighstock.options.series;

import nl.topicus.whighcharts.options.series.ISeriesEntry;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockFlagSeriesEntry implements ISeriesEntry<Object>
{
	private static final long serialVersionUID = 1L;

	/** The x value of the point Defaults to null. */
	private Number x;

	/** The y value of the point Defaults to null. */
	private Number y;

	private String title;

	private String text;

	public WHighStockFlagSeriesEntry()
	{

	}

	public WHighStockFlagSeriesEntry(Number x, Number y, String title, String text)
	{
		super();
		this.x = x;
		this.y = y;
		this.title = title;
		this.text = text;
	}

	public Number getX()
	{
		return x;
	}

	public WHighStockFlagSeriesEntry setX(Number x)
	{
		this.x = x;
		return this;
	}

	public Number getY()
	{
		return y;
	}

	public WHighStockFlagSeriesEntry setY(Number y)
	{
		this.y = y;
		return this;
	}

	public String getTitle()
	{
		return title;
	}

	public WHighStockFlagSeriesEntry setTitle(String title)
	{
		this.title = title;
		return this;
	}

	public String getText()
	{
		return text;
	}

	public WHighStockFlagSeriesEntry setText(String text)
	{
		this.text = text;
		return this;
	}

	@Override
	public Object getValue()
	{
		return null;
	}

}