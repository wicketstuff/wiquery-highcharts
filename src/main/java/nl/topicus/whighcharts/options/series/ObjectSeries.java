package nl.topicus.whighcharts.options.series;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
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
