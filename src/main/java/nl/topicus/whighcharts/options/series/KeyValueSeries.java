package nl.topicus.whighcharts.options.series;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class KeyValueSeries<K, V> extends AbstractSeries<V, KeyValueSeriesEntry<K, V>>
{
	private static final long serialVersionUID = 1L;

	public KeyValueSeries<K, V> addEntry(K key, V value)
	{
		addEntry(new KeyValueSeriesEntry<K, V>(key, value));
		return this;
	}
}
