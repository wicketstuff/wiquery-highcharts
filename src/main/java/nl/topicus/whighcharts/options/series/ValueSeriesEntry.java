package nl.topicus.whighcharts.options.series;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonInclude(Include.NON_NULL)
public abstract class ValueSeriesEntry<V> implements ISeriesEntry<V>
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
