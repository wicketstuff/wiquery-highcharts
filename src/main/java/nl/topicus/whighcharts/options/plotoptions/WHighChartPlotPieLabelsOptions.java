package nl.topicus.whighcharts.options.plotoptions;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartPlotPieLabelsOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Enable or disable the data labels. Defaults to true.
	 */
	private Boolean enabled;

	public Boolean getEnabled()
	{
		return enabled;
	}

	public WHighChartPlotPieLabelsOptions setEnabled(Boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}
}
