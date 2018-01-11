package nl.topicus.whighcharts.options.series;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonInclude(Include.NON_NULL)
public abstract class ValueSeries<V, E extends ValueSeriesEntry<V>> extends AbstractSeries<V, E>
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public ValueSeries(V... values)
	{
		for (V value : values)
			addEntry(value);
	}

	public abstract <T extends ValueSeries<V, E>> T addEntry(V value);
}
