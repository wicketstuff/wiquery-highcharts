package nl.topicus.whighstock.options.series;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockCandlestickSeries<K, V> extends
		AbstractWHighStockSeriesOptions<V, WHighStockCandlestickEntry<K, V>>
{
	private static final long serialVersionUID = 1L;

	public WHighStockCandlestickSeries<K, V> addEntry(K key, V open, V high, V low, V close)
	{
		getData().add(new WHighStockCandlestickEntry<K, V>(key, open, high, low, close));
		return this;
	}
}
