package nl.topicus.whighcharts.options;

import nl.topicus.whighcharts.options.jackson.ToStringNoQuoteSerializer;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(using = ToStringNoQuoteSerializer.class)
public class WHighChartFunctionLoad implements WHighChartFunction
{
	private static final long serialVersionUID = 1L;

	private String string;

	public WHighChartFunctionLoad(String string)
	{
		this.string = string;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("function(event){\n ");
		builder.append(string);
		builder.append("\n }");
		return builder.toString();
	}
}
