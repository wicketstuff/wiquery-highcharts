package nl.topicus.whighcharts.options.plotoptions;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartFunction;
import nl.topicus.whighcharts.options.WHighChartFunctionString;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartPlotChartPointEventsOptions implements Serializable
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
	 * Fires when the mouse enters the area close to the point. The this keyword refers to
	 * the point object itself. One parameter, event, is passed to the function. This
	 * contains common event information based on jQuery or MooTools depending on which
	 * library is used as the base for Highcharts.
	 */
	private WHighChartFunction mouseOver;

	/**
	 * Fires when the mouse leaves the area close to the point. The this keyword refers to
	 * the point object itself. One parameter, event, is passed to the function. This
	 * contains common event information based on jQuery or MooTools depending on which
	 * library is used as the base for Highcharts.
	 */
	private WHighChartFunction mouseOut;

	/**
	 * Fires when the point is removed using the .remove() method. The this keyword refers
	 * to the point object itself. One parameter, event, is passed to the function.
	 * Returning false cancels the operation.
	 */
	private WHighChartFunction remove;

	/**
	 * Fires when the point is selected either programatically or following a click on the
	 * point. The this keyword refers to the point object itself. One parameter, event, is
	 * passed to the function. Returning false cancels the operation.
	 */
	private WHighChartFunction select;

	/**
	 * Fires when the point is unselected either programatically or following a click on
	 * the point. The this keyword refers to the point object itself. One parameter,
	 * event, is passed to the function. Returning false cancels the operation.
	 */
	private WHighChartFunction unselect;

	/**
	 * Fires when the point is updated programmatically through the .update() method. The
	 * this keyword refers to the point object itself. One parameter, event, is passed to
	 * the function. The new point options can be accessed through event.options.
	 * Returning false cancels the operation.
	 */
	private WHighChartFunction update;

	public WHighChartFunction getClick()
	{
		return click;
	}

	public WHighChartPlotChartPointEventsOptions setClick(WHighChartFunction click)
	{
		this.click = click;
		return this;
	}

	public WHighChartPlotChartPointEventsOptions setClick(String formatter)
	{
		return setClick(new WHighChartFunctionString(formatter));
	}

	public WHighChartFunction getMouseOver()
	{
		return mouseOver;
	}

	public WHighChartPlotChartPointEventsOptions setMouseOver(WHighChartFunction mouseOver)
	{
		this.mouseOver = mouseOver;
		return this;
	}

	public WHighChartPlotChartPointEventsOptions setMouseOver(String formatter)
	{
		return setMouseOver(new WHighChartFunctionString(formatter));
	}

	public WHighChartFunction getMouseOut()
	{
		return mouseOut;
	}

	public WHighChartPlotChartPointEventsOptions setMouseOut(WHighChartFunction mouseOut)
	{
		this.mouseOut = mouseOut;
		return this;
	}

	public WHighChartPlotChartPointEventsOptions setMouseOut(String formatter)
	{
		return setMouseOut(new WHighChartFunctionString(formatter));
	}

	public WHighChartFunction getRemove()
	{
		return remove;
	}

	public WHighChartPlotChartPointEventsOptions setRemove(WHighChartFunction remove)
	{
		this.remove = remove;
		return this;
	}

	public WHighChartPlotChartPointEventsOptions setRemove(String formatter)
	{
		return setRemove(new WHighChartFunctionString(formatter));
	}

	public WHighChartFunction getSelect()
	{
		return select;
	}

	public WHighChartPlotChartPointEventsOptions setSelect(WHighChartFunction select)
	{
		this.select = select;
		return this;
	}

	public WHighChartPlotChartPointEventsOptions setSelect(String formatter)
	{
		return setSelect(new WHighChartFunctionString(formatter));
	}

	public WHighChartFunction getUnselect()
	{
		return unselect;
	}

	public WHighChartPlotChartPointEventsOptions setUnselect(WHighChartFunction unselect)
	{
		this.unselect = unselect;
		return this;
	}

	public WHighChartPlotChartPointEventsOptions setUnselect(String formatter)
	{
		return setUnselect(new WHighChartFunctionString(formatter));
	}

	public WHighChartFunction getUpdate()
	{
		return update;
	}

	public WHighChartPlotChartPointEventsOptions setUpdate(WHighChartFunction update)
	{
		this.update = update;
		return this;
	}

	public WHighChartPlotChartPointEventsOptions setUpdate(String formatter)
	{
		return setUpdate(new WHighChartFunctionString(formatter));
	}
}
