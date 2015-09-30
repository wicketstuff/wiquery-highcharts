package nl.topicus.whighcharts.options.plotoptions;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartPlotColumnOptions extends
		AbstractWHighChartPlotChartOptions<WHighChartPlotColumnOptions>
{
	private static final long serialVersionUID = 1L;

	private WHighChartPlotColumnLabelsOptions dataLabels;

	// private WHighChartPlotStackingType stacking;
	//
	// public WHighChartPlotColumnOptions setStacking(WHighChartPlotStackingType stacking)
	// {
	// this.stacking = stacking;
	// return this;
	// }
	//
	// public WHighChartPlotStackingType getStacking()
	// {
	// return stacking;
	// }

	public WHighChartPlotColumnLabelsOptions getDataLabels()
	{
		if (dataLabels == null)
			dataLabels = new WHighChartPlotColumnLabelsOptions();

		return dataLabels;
	}

	public WHighChartPlotColumnOptions setDataLabels(WHighChartPlotColumnLabelsOptions dataLabels)
	{
		this.dataLabels = dataLabels;
		return this;
	}

}
