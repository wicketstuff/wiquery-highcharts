package nl.topicus.whighcharts.options.labels;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
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
