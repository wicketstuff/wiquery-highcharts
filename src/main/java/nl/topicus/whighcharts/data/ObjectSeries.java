package nl.topicus.whighcharts.data;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public abstract class ObjectSeries extends AbstractSeries<Number, ObjectSeriesEntry>
{
	@Override
	@SuppressWarnings("unchecked")
	public ObjectSeries addEntry(ObjectSeriesEntry entry)
	{
		getData().add(entry);
		return this;
	}
}
