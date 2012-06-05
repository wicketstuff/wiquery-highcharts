package nl.topicus.whighcharts.options.credits;

import java.io.Serializable;

import nl.topicus.whighcharts.options.jackson.StyleSerializer;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * Highchart by default puts a credits label in the lower right corner of the chart. This
 * can be changed using these options.
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartCreditsOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Whether to show the credits text.
	 * 
	 * Defaults to true.
	 */
	private Boolean enabled;

	/**
	 * Position configuration for the credtis label. Supported properties are align,
	 * verticalAlign, x and y.
	 * 
	 * Defaults to
	 * 
	 * <pre>
	 * 	position: {
	 * 		align: 'right',
	 * 		x: -10,
	 * 		verticalAlign: 'bottom',
	 * 		y: -5
	 * 	}
	 * </pre>
	 */
	private WHighChartCreditsPositionOptions position;

	/**
	 * The URL for the credits label.
	 * 
	 * Defaults to "http://www.highcharts.com".
	 */
	private String href;

	/**
	 * CSS styles for the credits label.
	 * 
	 * Defaults to:
	 * 
	 * <pre>
	 * 	itemStyle: {
	 * 		cursor: 'pointer',
	 * 		color: '#909090',
	 * 		fontSize: '10px'
	 * }
	 * </pre>
	 */
	@JsonSerialize(using = StyleSerializer.class, include = Inclusion.NON_NULL)
	private String style;

	/**
	 * The text for the credits label.
	 * 
	 * Defaults to "Highcharts.com".
	 */
	private String text;

	public Boolean getEnabled()
	{
		return enabled;
	}

	public WHighChartCreditsOptions setEnabled(Boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}

	public WHighChartCreditsPositionOptions getPosition()
	{
		if (position == null)
			position = new WHighChartCreditsPositionOptions();

		return position;
	}

	public WHighChartCreditsOptions setPosition(WHighChartCreditsPositionOptions position)
	{
		this.position = position;
		return this;
	}

	public String getHref()
	{
		return href;
	}

	public WHighChartCreditsOptions setHref(String href)
	{
		this.href = href;
		return this;
	}

	public String getStyle()
	{
		return style;
	}

	public WHighChartCreditsOptions setStyle(String style)
	{
		this.style = style;
		return this;
	}

	public String getText()
	{
		return text;
	}

	public WHighChartCreditsOptions setText(String text)
	{
		this.text = text;
		return this;
	}

}
