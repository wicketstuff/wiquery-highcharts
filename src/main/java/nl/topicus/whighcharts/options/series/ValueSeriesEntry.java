package nl.topicus.whighcharts.options.series;

import com.fasterxml.jackson.annotation.JsonValue;

public class ValueSeriesEntry<V> implements ISeriesEntry<V>
{
	private static final long serialVersionUID = 1L;

	private V value;

	public ValueSeriesEntry(V value)
	{
		setValue(value);
	}

	@Override
	public V getValue()
	{
		return value;
	}

	public ValueSeriesEntry<V> setValue(V value)
	{
		this.value = value;
		return this;
	}

	@JsonValue
	public Object value()
	{
		return getValue();
	}
}
