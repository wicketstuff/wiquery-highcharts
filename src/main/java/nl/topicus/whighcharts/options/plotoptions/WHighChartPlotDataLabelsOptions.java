package nl.topicus.whighcharts.options.plotoptions;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartFunction;
import nl.topicus.whighcharts.options.WHighChartFunctionString;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonInclude(Include.NON_NULL)
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
