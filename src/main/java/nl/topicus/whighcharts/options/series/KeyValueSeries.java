package nl.topicus.whighcharts.options.series;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

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
