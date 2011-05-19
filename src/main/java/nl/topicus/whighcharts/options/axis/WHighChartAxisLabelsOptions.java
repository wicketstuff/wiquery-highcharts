package nl.topicus.whighcharts.options.axis;

import java.io.Serializable;

import nl.topicus.whighcharts.options.jackson.ToStringNoQuoteSerializer;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartAxisLabelsOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	@JsonSerialize(using = ToStringNoQuoteSerializer.class)
	private String formatter;

	private boolean enabled;

	public String getFormatter()
	{
		return formatter;
	}

	public WHighChartAxisLabelsOptions setFormatter(String formatter)
	{
		this.formatter = formatter;
		return this;
	}

	public WHighChartAxisLabelsOptions setEnabled(boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}

	public boolean getEnabled()
	{
		return enabled;
	}
}
