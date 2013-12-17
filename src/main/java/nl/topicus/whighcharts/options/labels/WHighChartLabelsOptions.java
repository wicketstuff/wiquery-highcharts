package nl.topicus.whighcharts.options.labels;

import java.io.Serializable;
import java.util.List;

import nl.topicus.whighcharts.options.jackson.ToStringNoQuoteWithCurlyBracketsSerializer;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonInclude(Include.NON_NULL)
public class WHighChartLabelsOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * An array containing configuration for each label.
	 */
	private List<String> items;

	/**
	 * Shared CSS styles for all labels. Defaults to: style: { color: '#3E576F' }
	 */
	@JsonSerialize(include = Inclusion.NON_NULL, using = ToStringNoQuoteWithCurlyBracketsSerializer.class)
	private String style;

	public List<String> getItems()
	{
		return items;
	}

	public WHighChartLabelsOptions setItems(List<String> items)
	{
		this.items = items;
		return this;
	}

	public String getStyle()
	{
		return style;
	}

	public WHighChartLabelsOptions setStyle(String style)
	{
		this.style = style;
		return this;
	}
}
