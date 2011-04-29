package nl.topicus.whighcharts.data;

import java.util.Arrays;

import org.codehaus.jackson.annotate.JsonValue;

public class KeyValueSeriesEntry<K, V> implements ISeriesEntry<V>
{
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
