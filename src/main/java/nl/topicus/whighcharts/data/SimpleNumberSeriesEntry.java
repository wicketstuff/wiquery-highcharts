package nl.topicus.whighcharts.data;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonValue;

public class SimpleNumberSeriesEntry<T extends Number> extends AbstractSeriesEntry<Integer, T>
		implements Serializable
{
	private static final long serialVersionUID = 1L;

	public SimpleNumberSeriesEntry(Integer key, T value)
	{
		super(key, value);
	}

	@Override
	@JsonValue
	public Object values()
	{
		return getValue();
	}
}