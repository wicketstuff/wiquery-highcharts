package nl.topicus.whighcharts.options.plotoptions;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonInclude(Include.NON_NULL)
public class WHighChartPlotChartPointOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Event listeners for chart events.
	 */
	private WHighChartPlotChartPointEventsOptions events;

	public WHighChartPlotChartPointEventsOptions getEvents()
	{
		if (events == null)
			events = new WHighChartPlotChartPointEventsOptions();
		return events;
	}

	public WHighChartPlotChartPointOptions setEvents(WHighChartPlotChartPointEventsOptions events)
	{
		this.events = events;
		return this;
	}
}
