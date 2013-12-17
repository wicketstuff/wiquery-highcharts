package nl.topicus.whighcharts.options.series;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonInclude(Include.NON_NULL)
public class ObjectSeries extends AbstractSeries<Number, ObjectSeriesEntry>
{
	private static final long serialVersionUID = 1L;

	@Override
	@SuppressWarnings("unchecked")
	public ObjectSeries addEntry(ObjectSeriesEntry entry)
	{
		getData().add(entry);
		return this;
	}
}
