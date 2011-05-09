package nl.topicus.whighcharts.data;

import java.io.Serializable;

public interface ISeriesEntry<V> extends Serializable
{
	public V getValue();
}
