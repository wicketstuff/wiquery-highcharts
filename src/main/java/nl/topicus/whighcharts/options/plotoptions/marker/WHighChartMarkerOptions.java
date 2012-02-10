package nl.topicus.whighcharts.options.plotoptions.marker;

import java.io.Serializable;

import nl.topicus.whighcharts.options.plotoptions.states.WHighChartMarkerStatesOptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartMarkerOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Enable or disable the point marker.
	 * 
	 * Defaults to true.
	 */
	private Boolean enabled;

	/**
	 * The fill color of the point marker. When null, the series' or point's color is
	 * used.
	 * 
	 * Defaults to null.
	 */
	private String fillColor;

	/**
	 * The color of the point marker's outline. When null, the series' or point's color is
	 * used.
	 * 
	 * Defaults to "#FFFFFF".
	 */
	private String lineColor;

	/**
	 * The width of the point marker's outline.
	 * 
	 * Defaults to 0.
	 */
	private Number lineWidth;

	/**
	 * The radius of the point marker.
	 * 
	 * Defaults to 0.
	 */
	private Number radius;

	/**
	 * Interaction states for the point marker.
	 */
	private WHighChartMarkerStatesOptions states;

	/**
	 * A predefined shape or symbol for the marker. When null, the symbol is pulled from
	 * options.symbols. Other possible values are "circle", "square", "diamond",
	 * "triangle" and "triangle-down". Additionally, the URL to a graphic can be given on
	 * this form: "url(graphic.png)". Defaults to null.
	 */
	private WHighChartMarkerSymbolType symbol;

	public Boolean getEnabled()
	{
		return enabled;
	}

	public WHighChartMarkerOptions setEnabled(Boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}

	public String getFillColor()
	{
		return fillColor;
	}

	public WHighChartMarkerOptions setFillColor(String fillColor)
	{
		this.fillColor = fillColor;
		return this;
	}

	public String getLineColor()
	{
		return lineColor;
	}

	public WHighChartMarkerOptions setLineColor(String lineColor)
	{
		this.lineColor = lineColor;
		return this;
	}

	public Number getLineWidth()
	{
		return lineWidth;
	}

	public WHighChartMarkerOptions setLineWidth(Number lineWidth)
	{
		this.lineWidth = lineWidth;
		return this;
	}

	public Number getRadius()
	{
		return radius;
	}

	public WHighChartMarkerOptions setRadius(Number radius)
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

	public WHighChartMarkerOptions setStates(WHighChartMarkerStatesOptions states)
	{
		this.states = states;
		return this;
	}

	public WHighChartMarkerSymbolType getSymbol()
	{
		return symbol;
	}

	public WHighChartMarkerOptions setSymbol(WHighChartMarkerSymbolType symbol)
	{
		this.symbol = symbol;
		return this;
	}

}
