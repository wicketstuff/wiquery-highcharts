package nl.topicus.whighcharts.options.plotoptions;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonInclude(Include.NON_NULL)
public class WHighChartPlotColumnOptions extends
		AbstractWHighChartPlotChartOptions<WHighChartPlotColumnOptions>
{
	private static final long serialVersionUID = 1L;

}
