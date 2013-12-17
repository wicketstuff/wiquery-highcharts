package nl.topicus.whighcharts.options.global;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Global options that don't apply to each chart. These options, like the lang options,
 * must be set using the Highcharts.setOptions method.
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonInclude(Include.NON_NULL)
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
