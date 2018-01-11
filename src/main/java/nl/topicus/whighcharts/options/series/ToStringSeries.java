package nl.topicus.whighcharts.options.series;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonInclude(Include.NON_NULL)
public class ToStringSeries extends ValueSeries<Object, ToStringSeriesEntry>
{
	private static final long serialVersionUID = 1L;

	public ToStringSeries(Object... values)
	{
		for (Object value : values)
			addEntry(value);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ToStringSeries addEntry(Object value)
	{
		addEntry(new ToStringSeriesEntry(value));
		return this;
	}
}
