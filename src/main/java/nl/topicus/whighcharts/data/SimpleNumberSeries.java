package nl.topicus.whighcharts.data;

import java.io.Serializable;

public class SimpleNumberSeries<T extends Number> extends
		AbstractSeries<Integer, T, SimpleNumberSeriesEntry<T>> implements Serializable
{
	private static final long serialVersionUID = 1L;

	public SimpleNumberSeries(String name, T... values)
	{
		setName(name);

		for (T curValue : values)
		{
			addEntry(curValue);
		}
	}

	public SimpleNumberSeries<T> addEntry(T value)
	{
		addEntry(new SimpleNumberSeriesEntry<T>(null, value));
		return this;
	}
}
