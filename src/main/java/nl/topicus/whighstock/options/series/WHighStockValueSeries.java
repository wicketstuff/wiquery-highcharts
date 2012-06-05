package nl.topicus.whighstock.options.series;

import nl.topicus.whighcharts.options.series.ValueSeriesEntry;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockValueSeries<V> extends
		AbstractWHighStockSeriesOptions<V, ValueSeriesEntry<V>>
{
	private static final long serialVersionUID = 1L;

	public WHighStockValueSeries(V... values)
	{
		for (V value : values)
			addEntry(new ValueSeriesEntry<V>(value));
	}

	@SuppressWarnings("unchecked")
	public <T extends WHighStockValueSeries<V>> T addEntry(V value)
	{
		addEntry(new ValueSeriesEntry<V>(value));
		return (T) this;
	}
}
