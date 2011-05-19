package nl.topicus.whighcharts.options.global;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * Global options that don't apply to each chart. These options, like the lang options,
 * must be set using the Highcharts.setOptions method.
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartGlobalOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Boolean useUTC;

	public Boolean getUseUTC()
	{
		return useUTC;
	}

	public WHighChartGlobalOptions setUseUTC(Boolean useUTC)
	{
		this.useUTC = useUTC;
		return this;
	}
}
