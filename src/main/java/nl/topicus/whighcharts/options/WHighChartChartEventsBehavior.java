package nl.topicus.whighcharts.options;

import org.apache.wicket.behavior.AbstractAjaxBehavior;

/**
 * Listener method for ChartEvents events.
 */
public class WHighChartChartEventsBehavior extends AbstractAjaxBehavior
{
	private static final long serialVersionUID = 1L;

	@Override
	public void onRequest()
	{
		getComponent().getRequest().getParameter("");
	}
}