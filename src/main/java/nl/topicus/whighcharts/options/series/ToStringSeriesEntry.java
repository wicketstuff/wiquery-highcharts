package nl.topicus.whighcharts.options.series;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonInclude(Include.NON_NULL)
public class ToStringSeriesEntry extends ValueSeriesEntry<Object>
{
	private static final long serialVersionUID = 1L;

	public ToStringSeriesEntry(Object value)
	{
		super(value);
	}

	@Override
	@JsonValue
	public Object value()
	{
		return getValue().toString();
	}
}
