package nl.topicus.whighcharts.options;

import nl.topicus.whighcharts.options.jackson.ToStringNoQuoteSerializer;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AbstractDefaultAjaxBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.attributes.AjaxRequestAttributes;
import org.apache.wicket.request.IRequestParameters;
import org.apache.wicket.request.cycle.RequestCycle;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = ToStringNoQuoteSerializer.class)
public class WHighChartFunctionCallback extends AbstractDefaultAjaxBehavior implements
		WHighChartFunction
{
	private static final long serialVersionUID = 1L;

	public WHighChartFunctionCallback(Component component)
	{
		component.add(this);
	}

	@Override
	public String toString()
	{
		AjaxRequestAttributes attributes = getAttributes();
		StringBuilder builder = new StringBuilder();
		builder.append("function(event){ var attrs = ");
		builder.append(renderAjaxAttributes(getComponent(), attributes));
		builder.append("; wHighChartsSerializeEvent(attrs, event); Wicket.Ajax.ajax(attrs); }");

		return builder.toString();
	}

	@Override
	protected void respond(AjaxRequestTarget target)
	{
		IRequestParameters map = RequestCycle.get().getRequest().getRequestParameters();
		WHighChartFunctionEvent event = new WHighChartFunctionEvent(map);
		onEvent(event, target);
	}

	@SuppressWarnings("unused")
	public void onEvent(WHighChartFunctionEvent event, AjaxRequestTarget target)
	{

	}
}
