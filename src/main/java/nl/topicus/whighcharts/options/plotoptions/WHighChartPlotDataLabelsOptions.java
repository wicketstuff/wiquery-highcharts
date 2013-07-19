package nl.topicus.whighcharts.options.plotoptions;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartFunction;
import nl.topicus.whighcharts.options.WHighChartFunctionString;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartPlotDataLabelsOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Enable or disable the data labels. Defaults to true.
	 */
	private Boolean enabled;

	private WHighChartFunction formatter;

	public Boolean getEnabled()
	{
		return enabled;
	}

	public WHighChartPlotDataLabelsOptions setEnabled(Boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}

	public WHighChartFunction getFormatter()
	{
		return formatter;
	}

	public WHighChartPlotDataLabelsOptions setFormatter(WHighChartFunction formatter)
	{
		this.formatter = formatter;
		return this;
	}

	public WHighChartPlotDataLabelsOptions setFormatter(String formatter)
	{
		return setFormatter(new WHighChartFunctionString(formatter));
	}

	public WHighChartPlotDataLabelsOptions setSelection(String formatter)
	{
		return setFormatter(new WHighChartFunctionString(formatter));
	}
}
