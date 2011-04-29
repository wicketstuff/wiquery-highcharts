package nl.topicus.whighcharts.data;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class ValueSeries<V> extends AbstractSeries<V, ValueSeriesEntry<V>>
{
	public ValueSeries(V... values)
	{
		for (V value : values)
			addEntry(new ValueSeriesEntry<V>(value));
	}

	@SuppressWarnings("unchecked")
	public <T extends ValueSeries<V>> T addEntry(V value)
	{
		addEntry(new ValueSeriesEntry<V>(value));
		return (T) this;
	}
}
