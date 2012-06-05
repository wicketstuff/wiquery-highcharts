package nl.topicus.whighstock.options.point;

import java.io.Serializable;

import nl.topicus.whighcharts.options.plotoptions.point.WHighChartPointOptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * Config options for the individual point as given in series.data.
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockPointOptions extends WHighChartPointOptions implements Serializable
{

	private static final long serialVersionUID = 1L;

	@Override
	public Boolean getSliced()
	{
		throw new RuntimeException(
			"Function not implemented. Not available in HighStock, only in HighCharts");
	}

	@Override
	public WHighChartPointOptions setSliced(Boolean sliced)
	{
		throw new RuntimeException(
			"Function not implemented. Not available in HighStock, only in HighCharts");
	}

	@Override
	public Number getLegendIndex()
	{
		throw new RuntimeException(
			"Function not implemented. Not available in HighStock, only in HighCharts");
	}

	@Override
	public WHighChartPointOptions setLegendIndex(Number legendIndex)
	{
		throw new RuntimeException(
			"Function not implemented. Not available in HighStock, only in HighCharts");
	}
}
