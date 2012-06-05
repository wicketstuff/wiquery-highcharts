package nl.topicus.whighstock.options.series;

import nl.topicus.whighcharts.options.series.ObjectSeriesEntry;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockObjectSeries extends
		AbstractWHighStockSeriesOptions<Number, ObjectSeriesEntry>
{
	private static final long serialVersionUID = 1L;

	@Override
	@SuppressWarnings("unchecked")
	public WHighStockObjectSeries addEntry(ObjectSeriesEntry entry)
	{
		getData().add(entry);
		return this;
	}
}
