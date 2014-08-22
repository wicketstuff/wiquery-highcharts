package nl.topicus.whighcharts.options.chart;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartFunction;
import nl.topicus.whighcharts.options.WHighChartFunctionString;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonInclude(Include.NON_NULL)
public class WHighChartChartEventsOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Fires when a series is added to the chart after load time, using the addSeries
	 * method. The this keyword refers to the chart object itself. One parameter, event,
	 * is passed to the function. This contains common event information based on jQuery
	 * or MooTools depending on which library is used as the base for Highcharts. Through
	 * event.options you can access the series options that was passed to the addSeries
	 * method. Returning false prevents the series from being added.
	 */
	private WHighChartFunction addSeries;

	/**
	 * Fires when clicking on the plot background. The this keyword refers to the chart
	 * object itself. One parameter, event, is passed to the function. This contains
	 * common event information based on jQuery or MooTools depending on which library is
	 * used as the base for Highcharts. <br/>
	 * <br/>
	 * Information on the clicked spot can be found through event.xAxis and event.yAxis,
	 * which are arrays containing the axes of each dimension and each axis' value at the
	 * clicked spot. The primary axes are event.xAxis[0] and event.yAxis[0]. Remember the
	 * unit of a datetime axis is milliseconds since 1970-01-01 00:00:00.
	 *
	 * <pre>
	 * click: function(e) {
	 * 	console.log(
	 * 		Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', e.xAxis[0].value),
	 * 		e.yAxis[0].value
	 * 	)
	 * }
	 * </pre>
	 */
	private WHighChartFunction click;

	/**
	 * Fires when the chart is finished loading. The this keyword refers to the chart
	 * object itself. One parameter, event, is passed to the function. This contains
	 * common event information based on jQuery or MooTools depending on which library is
	 * used as the base for Highcharts. <br/>
	 * <br/>
	 * From version 2.0.4, there is also a second parameter to Highcharts.Chart where a
	 * callback function can be passed to be executed on chart.load.
	 */
	private WHighChartFunction load;

	/**
	 * Fires when the chart is redrawn, either after a call to chart.redraw() or after an
	 * axis, series or point is modified with the redraw option set to true. The this
	 * keyword refers to the chart object itself. One parameter, event, is passed to the
	 * function. This contains common event information based on jQuery or MooTools
	 * depending on which library is used as the base for Highcharts.
	 */
	private WHighChartFunction redraw;

	/**
	 * Fires when an area of the chart has been selected. Selection is enabled by setting
	 * the chart's zoomType. The this keyword refers to the chart object itself. One
	 * parameter, event, is passed to the function. This contains common event information
	 * based on jQuery or MooTools depending on which library is used as the base for
	 * Highcharts. The default action for the selection event is to zoom the chart to the
	 * selected area. It can be prevented by calling event.preventDefault(). <br/>
	 * <br/>
	 * Information on the selected area can be found through event.xAxis and event.yAxis,
	 * which are arrays containing the axes of each dimension and each axis' min and max
	 * values. The primary axes are event.xAxis[0] and event.yAxis[0]. Remember the unit
	 * of a datetime axis is milliseconds since 1970-01-01 00:00:00.
	 *
	 * <pre>
	 * selection: function(event) {
	 * 	// log the min and max of the primary, datetime x-axis
	 * 	console.log(
	 * 		Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', event.xAxis[0].min),
	 * 		Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', event.xAxis[0].max)
	 * 	);
	 * 	// log the min and max of the y axis
	 * 	console.log(event.yAxis[0].min, event.yAxis[0].max);
	 * }
	 * </pre>
	 */
	private WHighChartFunction selection;

	/**
	 * Fires when the legend item belonging to the series is clicked. The this keyword
	 * refers to the series object itself. One parameter, event, is passed to the
	 * function. This contains common event information based on jQuery or MooTools
	 * depending on which library is used as the base for Highcharts. The default action
	 * is to toggle the visibility of the series. This can be prevented by returning false
	 * or calling event.preventDefault().
	 */
	private WHighChartFunction legendItemClick;

	public WHighChartFunction getAddSeries()
	{
		return addSeries;
	}

	public WHighChartChartEventsOptions setAddSeries(WHighChartFunction addSeries)
	{
		this.addSeries = addSeries;
		return this;
	}

	public WHighChartChartEventsOptions setAddSeries(String formatter)
	{
		return setAddSeries(new WHighChartFunctionString(formatter));
	}

	public WHighChartFunction getClick()
	{
		return click;
	}

	public WHighChartChartEventsOptions setClick(WHighChartFunction click)
	{
		this.click = click;
		return this;
	}

	public WHighChartChartEventsOptions setClick(String formatter)
	{
		return setClick(new WHighChartFunctionString(formatter));
	}

	public WHighChartFunction getLoad()
	{
		return load;
	}

	public WHighChartChartEventsOptions setLoad(WHighChartFunction load)
	{
		this.load = load;
		return this;
	}

	public WHighChartChartEventsOptions setLoad(String formatter)
	{
		return setLoad(new WHighChartFunctionString(formatter));
	}

	public WHighChartFunction getRedraw()
	{
		return redraw;
	}

	public WHighChartChartEventsOptions setRedraw(WHighChartFunction redraw)
	{
		this.redraw = redraw;
		return this;
	}

	public WHighChartChartEventsOptions setRedraw(String formatter)
	{
		return setRedraw(new WHighChartFunctionString(formatter));
	}

	public Object getSelection()
	{
		return selection;
	}

	public WHighChartChartEventsOptions setSelection(WHighChartFunction selection)
	{
		this.selection = selection;
		return this;
	}

	public WHighChartChartEventsOptions setSelection(String formatter)
	{
		return setSelection(new WHighChartFunctionString(formatter));
	}

	public WHighChartFunction getLegendItemClick()
	{
		return legendItemClick;
	}

	public WHighChartChartEventsOptions setLegendItemClick(WHighChartFunction legendItemClick)
	{
		this.legendItemClick = legendItemClick;
		return this;
	}
}
