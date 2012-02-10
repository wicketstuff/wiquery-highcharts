package nl.topicus.whighcharts.options.labels;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import nl.topicus.whighcharts.options.jackson.StyleSerializer;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * HTML labels that can be positioined anywhere in the chart area.
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartLabelsOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * An array containing configuration for each label.
	 */
	private List<WHighChartLabelsItemOptions> items;

	/**
	 * Shared CSS styles for all labels.
	 * 
	 * Defaults to:
	 * 
	 * <pre>
	 * 	style: {
	 * 		color: '#3E576F'
	 * 	}
	 * </pre>
	 */
	@JsonSerialize(using = StyleSerializer.class, include = Inclusion.NON_NULL)
	private String style;

	public List<WHighChartLabelsItemOptions> getItems()
	{
		if (items == null)
		{
			items = new ArrayList<WHighChartLabelsItemOptions>();
		}
		return items;
	}

	public WHighChartLabelsOptions setItems(List<WHighChartLabelsItemOptions> items)
	{
		this.items = items;
		return this;
	}

	public WHighChartLabelsOptions add(WHighChartLabelsItemOptions addItem)
	{
		getItems().add(addItem);

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
