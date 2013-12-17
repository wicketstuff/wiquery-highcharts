package nl.topicus.whighcharts.options.series;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonInclude(Include.NON_NULL)
public class ValueSeries<V> extends AbstractSeries<V, ValueSeriesEntry<V>>
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
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
