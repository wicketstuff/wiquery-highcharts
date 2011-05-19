package nl.topicus.whighcharts.options;

import java.util.Map;

import nl.topicus.whighcharts.options.jackson.ToStringNoQuoteSerializer;

import org.apache.wicket.Component;
import org.apache.wicket.RequestCycle;
import org.apache.wicket.ajax.AbstractDefaultAjaxBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.codehaus.jackson.map.annotate.JsonSerialize;

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
		StringBuilder builder = new StringBuilder();
		builder.append("function(event){\n ");
		builder.append(getCallbackScript(false));
		builder.append("\n }");
		return builder.toString();
	}

	@Override
	protected CharSequence getCallbackScript(boolean onlyTargetActivePage)
	{
		return generateCallbackScript("wicketAjaxGet('" + getCallbackUrl(onlyTargetActivePage)
			+ "&' + wHighChartsSerializeEvent(event)");
	}

	@Override
	protected void respond(AjaxRequestTarget target)
	{
		Map<String, String[]> map = RequestCycle.get().getRequest().getParameterMap();
		WHighChartFunctionEvent event = new WHighChartFunctionEvent(map);
		onEvent(event);
	}

	@SuppressWarnings("unused")
	public void onEvent(WHighChartFunctionEvent event)
	{

	}
}
