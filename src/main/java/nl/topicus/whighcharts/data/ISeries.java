package nl.topicus.whighcharts.data;

import java.util.List;

public interface ISeries<V, E extends ISeriesEntry<V>>
{
	public List<E> getData();
}
