package nl.topicus.whighcharts.options.series;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonInclude(Include.NON_NULL)
public class IntegerSeries extends ValueSeries<Integer, IntegerSeriesEntry>
{
	private static final long serialVersionUID = 1L;

	public IntegerSeries(Integer... values)
	{
		for (Integer value : values)
			addEntry(value);
	}

	@SuppressWarnings("unchecked")
	@Override
	public IntegerSeries addEntry(Integer value)
	{
		addEntry(new IntegerSeriesEntry(value));
		return this;
	}
}
