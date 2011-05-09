package nl.topicus.whighcharts.data;

import java.io.Serializable;
import java.util.List;

public interface ISeries<V, E extends ISeriesEntry<V>> extends Serializable
{
	public List<E> getData();
}
