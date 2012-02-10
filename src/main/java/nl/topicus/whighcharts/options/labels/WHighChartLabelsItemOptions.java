/**
 * 
 */
package nl.topicus.whighcharts.options.labels;

import java.io.Serializable;

import nl.topicus.whighcharts.options.jackson.StyleSerializer;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * A HTML label that can be positioined anywhere in the chart area.
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartLabelsItemOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Inner HTML or text for the label.
	 * 
	 * Defaults to "".
	 */
	private String html = "";

	/**
	 * CSS styles for each label. To position the label, use left and top like this:
	 * 
	 * <pre>
	 * 	style: {
	 * 		left: '100px',
	 * 		top: '100px'
	 * }
	 * </pre>
	 */
	@JsonSerialize(using = StyleSerializer.class, include = Inclusion.NON_NULL)
	private String style;

	public WHighChartLabelsItemOptions()
	{

	}

	public WHighChartLabelsItemOptions(String html, String style)
	{
		this.html = html;
		this.style = style;
	}

	public String getHtml()
	{
		return html;
	}

	public WHighChartLabelsItemOptions setHtml(String html)
	{
		this.html = html;

		return this;
	}

	public String getStyle()
	{
		return style;
	}

	public WHighChartLabelsItemOptions setStyle(String style)
	{
		this.style = style;

		return this;
	}

}
