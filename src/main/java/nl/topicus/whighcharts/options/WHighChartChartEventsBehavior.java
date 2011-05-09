package nl.topicus.whighcharts.options;

import nl.topicus.whighcharts.components.WHighChart;
import nl.topicus.whighcharts.data.ValueSeriesEntry;

import org.apache.wicket.ajax.AbstractDefaultAjaxBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.ser.ToStringSerializer;

/**
 * Listener behavior for ChartEvents events. This behavior will be added to the component
 * for you.
 */
@JsonSerialize(using = ToStringSerializer.class)
public class WHighChartChartEventsBehavior extends AbstractDefaultAjaxBehavior
{
	private static final long serialVersionUID = 1L;

	public WHighChartChartEventsBehavior(WHighChart<Integer, ValueSeriesEntry<Integer>> chart)
	{
		chart.add(this);
	}

	@Override
	protected void respond(AjaxRequestTarget target)
	{
		getComponent().getRequest().getParameter("");
	}

	@Override
	public String toString()
	{
		String returnValue = "function(e) { ";
		returnValue += getCallbackScript(true).toString();
		returnValue += " }";

		return returnValue;
	}
}