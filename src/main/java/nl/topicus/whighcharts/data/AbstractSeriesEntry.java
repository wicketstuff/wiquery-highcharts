package nl.topicus.whighcharts.data;

import java.util.Arrays;
import java.util.List;

import org.codehaus.jackson.annotate.JsonValue;

public class AbstractSeriesEntry<K, V> implements SeriesEntry<K, V>
{
	private K key;

	private V value;

	public AbstractSeriesEntry(K key, V value)
	{
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey()
	{
		return key;
	}

	@Override
	public V getValue()
	{
		return value;
	}

	@JsonValue
	public List<Object> values()
	{
		return Arrays.asList(getKey(), getValue());
	}
}