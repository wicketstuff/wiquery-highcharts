package nl.topicus.whighstock.options.lang;

import nl.topicus.whighcharts.options.lang.WHighChartLangOptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * 
 * @author remcozigterman
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockLangOptions extends WHighChartLangOptions
{
	private static final long serialVersionUID = 1L;

	/**
	 * The text for the label for the "from" input box in the range selector
	 * 
	 * Defaults to "From".
	 */
	private String rangeSelectorFrom;

	/**
	 * The text for the label for the "to" input box in the range selector.
	 * 
	 * Defaults to "To".
	 */
	private String rangeSelectorTo;

	/**
	 * The text for the label for the range selector buttons.
	 * 
	 * Defaults to "Zoom".
	 */
	private String rangeSelectorZoom;

	public String getRangeSelectorFrom()
	{
		return rangeSelectorFrom;
	}

	public WHighStockLangOptions setRangeSelectorFrom(String rangeSelectorFrom)
	{
		this.rangeSelectorFrom = rangeSelectorFrom;
		return this;
	}

	public String getRangeSelectorTo()
	{
		return rangeSelectorTo;
	}

	public WHighStockLangOptions setRangeSelectorTo(String rangeSelectorTo)
	{
		this.rangeSelectorTo = rangeSelectorTo;
		return this;
	}

	public String getRangeSelectorZoom()
	{
		return rangeSelectorZoom;
	}

	public WHighStockLangOptions setRangeSelectorZoom(String rangeSelectorZoom)
	{
		this.rangeSelectorZoom = rangeSelectorZoom;
		return this;
	}

}
