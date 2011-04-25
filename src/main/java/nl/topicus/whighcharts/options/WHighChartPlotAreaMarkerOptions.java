package nl.topicus.whighcharts.options;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartPlotAreaMarkerOptions
{
	private Boolean enabled;

	private WHighChartPlotAreaMarkerSymbol symbol;

	private Double radius;

	private Object states;

	public Boolean getEnabled()
	{
		return enabled;
	}

	public WHighChartPlotAreaMarkerOptions setEnabled(Boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}

	public WHighChartPlotAreaMarkerSymbol getSymbol()
	{
		return symbol;
	}

	public WHighChartPlotAreaMarkerOptions setSymbol(WHighChartPlotAreaMarkerSymbol symbol)
	{
		this.symbol = symbol;
		return this;
	}

	public Double getRadius()
	{
		return radius;
	}

	public WHighChartPlotAreaMarkerOptions setRadius(Double radius)
	{
		this.radius = radius;
		return this;
	}

	public Object getStates()
	{
		return states;
	}

	public WHighChartPlotAreaMarkerOptions setStates(Object states)
	{
		this.states = states;
		return this;
	}
}
