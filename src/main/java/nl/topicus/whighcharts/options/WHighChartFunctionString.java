package nl.topicus.whighcharts.options;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import nl.topicus.whighcharts.options.jackson.ToStringNoQuoteSerializer;

@JsonSerialize(using = ToStringNoQuoteSerializer.class)
public class WHighChartFunctionString implements WHighChartFunction
{
	private static final long serialVersionUID = 1L;

	private String function;

	public WHighChartFunctionString(String function)
	{
		this.function = function;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("function(event){\n ");
		builder.append(function);
		builder.append("\n }");
		return builder.toString();
	}

}
