package nl.topicus.whighstock.options.series;

import java.util.Arrays;

import nl.topicus.whighcharts.options.series.ISeriesEntry;

import org.codehaus.jackson.annotate.JsonValue;

public class WHighStockCandlestickEntry<K, V> implements ISeriesEntry<V>
{
	private static final long serialVersionUID = 1L;

	private K key;

	private V open;

	private V high;

	private V low;

	private V close;

	public WHighStockCandlestickEntry(K key, V open, V high, V low, V close)
	{
		this.key = key;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;

	}

	@Override
	public V getValue()
	{
		return open;
	}

	@JsonValue
	public Object value()
	{
		return Arrays.asList(key, open, high, low, close);
	}
}