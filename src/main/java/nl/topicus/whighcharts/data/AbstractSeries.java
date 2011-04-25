package nl.topicus.whighcharts.data;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public abstract class AbstractSeries<K, V, E extends SeriesEntry<K, V>> implements Series<K, V, E>
{
	private String name;

	private List<E> data = new ArrayList<E>();

	@Override
	public String getName()
	{
		return name;
	}

	public AbstractSeries<K, V, E> setName(String name)
	{
		this.name = name;
		return this;
	}

	@Override
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
