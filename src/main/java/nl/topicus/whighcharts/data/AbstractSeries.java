package nl.topicus.whighcharts.data;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonValue;

public abstract class AbstractSeries<K, V, E extends SeriesEntry<K, V>> implements Series<K, V, E>
{
	private List<E> data = new ArrayList<E>();

	@Override
	@JsonValue
	public List<E> getData()
	{
		return data;
	}

	public AbstractSeries<K, V, E> addEntry(E entry)
	{
		data.add(entry);
		return this;
	}
}
