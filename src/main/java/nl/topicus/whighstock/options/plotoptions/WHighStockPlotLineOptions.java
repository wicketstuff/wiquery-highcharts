package nl.topicus.whighstock.options.plotoptions;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockPlotLineOptions extends
		AbstractWHighStockPlotChartOptions<WHighStockPlotLineOptions> implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Whether to apply steps to the line.
	 * 
	 * Defaults to false.
	 */
	private Boolean step;

	public Boolean getStep()
	{
		return step;
	}

	public WHighStockPlotLineOptions setStep(Boolean step)
	{
		this.step = step;
		return this;
	}

}