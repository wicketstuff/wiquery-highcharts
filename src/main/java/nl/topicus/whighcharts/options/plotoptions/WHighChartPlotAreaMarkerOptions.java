package nl.topicus.whighcharts.options.plotoptions;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import nl.topicus.whighcharts.options.WHighChartMarkerStatesOptions;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonInclude(Include.NON_NULL)
public class WHighChartPlotAreaMarkerOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Boolean enabled;

	private WHighChartPlotAreaMarkerSymbolType symbol;

	private Number radius;

	private WHighChartMarkerStatesOptions states;

	public Boolean getEnabled()
	{
		return enabled;
	}

	public WHighChartPlotAreaMarkerOptions setEnabled(Boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}

	public WHighChartPlotAreaMarkerSymbolType getSymbol()
	{
		return symbol;
	}

	public WHighChartPlotAreaMarkerOptions setSymbol(WHighChartPlotAreaMarkerSymbolType symbol)
	{
		this.symbol = symbol;
		return this;
	}

	public Number getRadius()
	{
		return radius;
	}

	public WHighChartPlotAreaMarkerOptions setRadius(Number radius)
	{
		this.radius = radius;
		return this;
	}

	public WHighChartMarkerStatesOptions getStates()
	{
		if (states == null)
			states = new WHighChartMarkerStatesOptions();

		return states;
	}
}
