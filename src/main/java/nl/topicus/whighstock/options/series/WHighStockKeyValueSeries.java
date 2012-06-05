package nl.topicus.whighstock.options.series;

import nl.topicus.whighcharts.options.series.KeyValueSeriesEntry;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockKeyValueSeries<K, V> extends
		AbstractWHighStockSeriesOptions<V, KeyValueSeriesEntry<K, V>>
{
	private static final long serialVersionUID = 1L;

	public WHighStockKeyValueSeries<K, V> addEntry(K key, V value)
	{
		addEntry(new KeyValueSeriesEntry<K, V>(key, value));
		return this;
	}
}
