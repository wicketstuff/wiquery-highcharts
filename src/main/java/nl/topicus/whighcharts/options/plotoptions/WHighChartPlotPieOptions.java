package nl.topicus.whighcharts.options.plotoptions;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartPlotPieOptions extends
		AbstractWHighChartPlotChartOptions<WHighChartPlotPieOptions>
{
	private static final long serialVersionUID = 1L;

	/**
	 * Enable or disable the initial animation when a series is displayed. Since version
	 * 2.1, the animation can be set as a configuration object. Please note that this
	 * option only applies to the initial animation of the series itself. For other
	 * animations, see #chart => animation and the animation parameter under the API
	 * methods. The following properties are supported: duration The duration of the
	 * animation in milliseconds. easing When using jQuery as the general framework, the
	 * easing can be set to linear or swing. More easing functions are available with the
	 * use of jQuery plug-ins, most notably the jQuery UI suite. See the jQuery docs. When
	 * using MooToos as the general framework, use the property name transition instead of
	 * easing. Defaults to true.
	 */
	private Boolean animation;

	/**
	 * The main color or the series. In line type series it applies to the line and the
	 * point markers unless otherwise specified. In bar type series it applies to the bars
	 * unless a color is specified per point. The default value is pulled from the
	 * options.colors array.
	 */
	private String color;

	/**
	 * Defines the appearance of the data labels, static labels for each point.
	 */
	private WHighChartPlotPieLabelsOptions dataLabels;

	/**
	 * Whether to display this particular series or series type in the legend. Since 2.1,
	 * pies are not shown in the legend by default. Defaults to false.
	 */
	private Boolean showInLegend;

	private String size;

	public Boolean getAnimation()
	{
		return animation;
	}

	public WHighChartPlotPieOptions setAnimation(Boolean animation)
	{
		this.animation = animation;
		return this;
	}

	public String getColor()
	{
		return color;
	}

	public WHighChartPlotPieOptions setColor(String color)
	{
		this.color = color;
		return this;
	}

	public WHighChartPlotPieLabelsOptions getDataLabels()
	{
		if (dataLabels == null)
			dataLabels = new WHighChartPlotPieLabelsOptions();

		return dataLabels;
	}

	public WHighChartPlotPieOptions setDataLabels(WHighChartPlotPieLabelsOptions dataLabels)
	{
		this.dataLabels = dataLabels;
		return this;
	}

	public Boolean getShowInLegend()
	{
		return showInLegend;
	}

	public WHighChartPlotPieOptions setShowInLegend(Boolean showInLegend)
	{
		this.showInLegend = showInLegend;
		return this;
	}

	public String getSize()
	{
		return size;
	}

	public WHighChartPlotPieOptions setSize(String size)
	{
		this.size = size;
		return this;
	}

}
