package nl.topicus.whighcharts.options.point;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartFunction;
import nl.topicus.whighcharts.options.WHighChartFunctionString;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartPointEventsOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Fires when a point is clicked. The this keyword refers to the point object itself.
	 * One parameter, event, is passed to the function. This contains common event
	 * information based on jQuery or MooTools depending on which library is used as the
	 * base for Highcharts. If the series.allowPointSelect option is true, the default
	 * action for the point's click event is to toggle the point's select state. Returning
	 * false cansels this action.
	 */
	private WHighChartFunction click;

	/**
	 * Fires when the point is selected either programatically or following a click on the
	 * point. The this keyword refers to the point object itself. One parameter, event, is
	 * passed to the function. Returning false cancels the operation.
	 */
	private WHighChartFunction select;

	public WHighChartFunction getClick()
	{
		return click;
	}

	public WHighChartPointEventsOptions setClick(WHighChartFunction click)
	{
		this.click = click;
		return this;
	}

	public WHighChartPointEventsOptions setClick(String formatter)
	{
		return setClick(new WHighChartFunctionString(formatter));
	}

	public WHighChartFunction getSelect()
	{
		return select;
	}

	public WHighChartPointEventsOptions setSelect(WHighChartFunction select)
	{
		this.select = select;
		return this;
	}

	public WHighChartPointEventsOptions setSelect(String formatter)
	{
		return setSelect(new WHighChartFunctionString(formatter));
	}
}
