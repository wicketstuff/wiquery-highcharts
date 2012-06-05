package nl.topicus.whighstock.options.series;

import nl.topicus.whighcharts.options.jackson.StyleSerializer;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockFlagSeries extends
		AbstractWHighStockSeriesOptions<Object, WHighStockFlagSeriesEntry>
{
	private static final long serialVersionUID = 1L;

	private String onSeries;

	private String shape;

	private Number width;

	@JsonSerialize(using = StyleSerializer.class, include = Inclusion.NON_NULL)
	private String style;

	@Override
	@SuppressWarnings("unchecked")
	public WHighStockFlagSeries addEntry(WHighStockFlagSeriesEntry entry)
	{
		getData().add(entry);
		return this;
	}

	public WHighStockFlagSeries addEntry(Number x, Number y, String title, String text)
	{
		getData().add(new WHighStockFlagSeriesEntry(x, y, title, text));
		return this;
	}

	public String getOnSeries()
	{
		return onSeries;
	}

	public WHighStockFlagSeries setOnSeries(String onSeries)
	{
		this.onSeries = onSeries;
		return this;
	}

	public String getShape()
	{
		return shape;
	}

	public WHighStockFlagSeries setShape(String shape)
	{
		this.shape = shape;
		return this;
	}

	public Number getWidth()
	{
		return width;
	}

	public WHighStockFlagSeries setWidth(Number width)
	{
		this.width = width;
		return this;
	}

	public String getStyle()
	{
		return style;
	}

	public WHighStockFlagSeries setStyle(String style)
	{
		this.style = style;
		return this;
	}

}
