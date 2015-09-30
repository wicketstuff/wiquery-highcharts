package nl.topicus.whighcharts.options.series;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonValue;

public class KeyValueSeriesEntry<K, V> implements ISeriesEntry<V>
{
	private static final long serialVersionUID = 1L;

	private K key;

	private V value;

	public KeyValueSeriesEntry(K key, V value)
	{
		setKey(key);
		setValue(value);
	}

	public K getKey()
	{
		return key;
	}

	public KeyValueSeriesEntry<K, V> setKey(K key)
	{
		this.key = key;
		return this;
	}

	@Override
	public V getValue()
	{
		return value;
	}

	public KeyValueSeriesEntry<K, V> setValue(V value)
	{
		this.value = value;
		return this;
	}

	@JsonValue
	public Object value()
	{
		return Arrays.asList(getKey(), getValue());
	}
}
