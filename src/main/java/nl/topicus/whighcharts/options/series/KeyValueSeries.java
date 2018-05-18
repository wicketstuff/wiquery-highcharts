package nl.topicus.whighcharts.options.series;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonInclude(Include.NON_NULL)
public abstract class KeyValueSeries<K, V, E extends KeyValueSeriesEntry<K, V>>
		extends AbstractSeries<V, E>
{
	private static final long serialVersionUID = 1L;

	public abstract E addEntry(K key, V value);
}
