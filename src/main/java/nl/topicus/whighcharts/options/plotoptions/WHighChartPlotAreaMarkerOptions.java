package nl.topicus.whighcharts.options.plotoptions;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartMarkerStatesOptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
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
