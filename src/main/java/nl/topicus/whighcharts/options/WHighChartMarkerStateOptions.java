package nl.topicus.whighcharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartMarkerStateOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Enable or disable the point marker. Defaults to true.
	 */
	private Boolean enabled;

	/**
	 * The fill color of the point marker. When null, the series' or point's color is
	 * used. Defaults to null.
	 */
	private String fillColor;

	/**
	 * The color of the point marker's outline. When null, the series' or point's color is
	 * used. Defaults to "#FFFFFF".
	 */
	private String lineColor;

	/**
	 * The width of the point marker's outline. Defaults to 0.
	 */
	private Number lineWidth;

	/**
	 * The radius of the point marker. In hover state, it defaults to the normal state's
	 * radius + 2.
	 */
	private Number radius;

	public Boolean getEnabled()
	{
		return enabled;
	}

	public WHighChartMarkerStateOptions setEnabled(Boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}

	public String getFillColor()
	{
		return fillColor;
	}

	public WHighChartMarkerStateOptions setFillColor(String fillColor)
	{
		this.fillColor = fillColor;
		return this;
	}

	public String getLineColor()
	{
		return lineColor;
	}

	public WHighChartMarkerStateOptions setLineColor(String lineColor)
	{
		this.lineColor = lineColor;
		return this;
	}

	public Number getLineWidth()
	{
		return lineWidth;
	}

	public WHighChartMarkerStateOptions setLineWidth(Number lineWidth)
	{
		this.lineWidth = lineWidth;
		return this;
	}

	public Number getRadius()
	{
		return radius;
	}

	public WHighChartMarkerStateOptions setRadius(Number radius)
	{
		this.radius = radius;
		return this;
	}

}
