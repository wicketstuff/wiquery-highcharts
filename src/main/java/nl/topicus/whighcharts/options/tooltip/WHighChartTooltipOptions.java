package nl.topicus.whighcharts.options.tooltip;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartFunction;
import nl.topicus.whighcharts.options.WHighChartFunctionString;
import nl.topicus.whighcharts.options.jackson.StyleSerializer;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * Options for the tooltip that appears when the user hovers over a series or point.
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartTooltipOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * The background color or gradient for the tooltip.
	 * 
	 * Defaults to "rgba(255, 255, 255, .85)".
	 */
	private String backgroundColor;

	/**
	 * The color of the tooltip border. When null, the border takes the color of the
	 * corresponding series or point.
	 * 
	 * Defaults to "auto".
	 */
	private String borderColor;

	/**
	 * The radius of the rounded border corners.
	 * 
	 * Defaults to 5.
	 */
	private Number borderRadius;

	/**
	 * The pixel width of the tooltip border.
	 * 
	 * Defaults to 2.
	 */
	private Number borderWidth;

	/**
	 * <p>
	 * Display crosshairs to connect the points with their corresponding axis values. The
	 * crosshairs can be defined as a boolean, an array of booleans or an array of
	 * objects.
	 * </p>
	 * 
	 * <p>
	 * <i>Boolean</i><br/>
	 * If the crosshairs option is true, a single crosshair relating to the x axis will be
	 * shown.
	 * </p>
	 * <p>
	 * <i>Array of booleans</i><br/>
	 * In an array of booleans, the first value turns on the x axis crosshair and the
	 * second value to the y axis crosshair. Use [true, true] to show complete crosshairs.
	 * </p>
	 * <p>
	 * <i>Array of objects</i><br/>
	 * In an array of objects, the first value applies to the x axis crosshair and the
	 * second value to the y axis crosshair. For each dimension, a width, color dashStyle
	 * and zIndex can be given. can be given.
	 * </p>
	 * 
	 * Defaults to true.
	 */
	// crosshairs: null,

	/**
	 * Enable or disable the tooltip.
	 * 
	 * Defaults to true.
	 */
	private Boolean enabled;

	/**
	 * Callback function to format the text of the tooltip. Return false to disable
	 * tooltip for a specific point on series.
	 * 
	 * A subset of HTML is supported. The HTML of the tooltip is parsed and converted to
	 * SVG, therefore this isn't a complete HTML renderer. The following tabs are
	 * supported: <b>, <strong>, <i>,
	 * <em>, <br/>, <span>. Spans can be styled with a style attribute, but only text-related CSS that is shared with SVG is handled.
	 * 
	 * Since version 2.1 the tooltip can be shared between multiple series through the shared option. The available data in the formatter differ a bit depending on whether the tooltip is shared or not. In a shared tooltip, all properties except x, which is common for all points, are kept in an array, this.points.
	 * 
	 * Available data are:
	 * 
	 * this.percentage (not shared) / this.points[i].percentage (shared)
	 *   Stacked series and pies only. The point's percentage of the total.
	 * this.point (not shared) / this.points[i].point (shared)
	 *   The point object. The point name, if defined, is available through this.point.name.
	 * this.points
	 *    In a shared tooltip, this is an array containing all other properties for each point.
	 * this.series (not shared) / this.points[i].series (shared)
	 *    The series object. The series name is available through this.series.name.
	 * this.total (not shared) / this.points[i].total (shared)
	 *    Stacked series only. The total value at this point's x value.
	 * this.x
	 *    The x value. This property is the same regardless of the tooltip being shared or not.
	 * this.y (not shared) / this.points[i].y (shared)
	 *    The y value.
	 */
	private WHighChartFunction formatter;

	/**
	 * Whether to apply a drop shadow to the tooltip.
	 * 
	 * Defaults to true.
	 */
	private Boolean shadow;

	/**
	 * When the tooltip is shared, the entire plot area will capture mouse movement, and
	 * tooltip texts for all series will be shown in a single bubble. This is recommended
	 * for single series charts and for iPad optimized sites.
	 * 
	 * Defaults to true.
	 */
	private Boolean shared;

	/**
	 * Proximity snap for graphs or single points. Does not apply to bars, columns and pie
	 * slices. It defaults to 10 for mouse-powered devices and 25 for touch devices.
	 * 
	 * Defaults to 10/25.
	 */
	private Number snap;

	/**
	 * CSS styles for the tooltip. The tooltip can also be styled through the CSS class
	 * .highcharts-tooltip.
	 * 
	 * Default value: <code>
	 * style: {<br/>
	 * &nbsp;color: '#333333',<br/>
	 * &nbsp;fontSize: '9pt',<br/>
	 * &nbsp;padding: '5px'<br/>
	 * }<br/>
	 */
	@JsonSerialize(using = StyleSerializer.class, include = Inclusion.NON_NULL)
	private String style;

	public String getBackgroundColor()
	{
		return backgroundColor;
	}

	public WHighChartTooltipOptions setBackgroundColor(String backgroundColor)
	{
		this.backgroundColor = backgroundColor;
		return this;
	}

	public String getBorderColor()
	{
		return borderColor;
	}

	public WHighChartTooltipOptions setBorderColor(String borderColor)
	{
		this.borderColor = borderColor;
		return this;
	}

	public Number getBorderRadius()
	{
		return borderRadius;
	}

	public WHighChartTooltipOptions setBorderRadius(Number borderRadius)
	{
		this.borderRadius = borderRadius;
		return this;
	}

	public Number getBorderWidth()
	{
		return borderWidth;
	}

	public WHighChartTooltipOptions setBorderWidth(Number borderWidth)
	{
		this.borderWidth = borderWidth;
		return this;
	}

	public Boolean getEnabled()
	{
		return enabled;
	}

	public WHighChartTooltipOptions setEnabled(Boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}

	public WHighChartFunction getFormatter()
	{
		return formatter;
	}

	public WHighChartTooltipOptions setFormatter(WHighChartFunction formatter)
	{
		this.formatter = formatter;
		return this;
	}

	/**
	 * Sets the string as content of a function() {}.
	 * 
	 * @see WHighChartFunctionString
	 */
	public WHighChartTooltipOptions setFormatter(String formatter)
	{
		return setFormatter(new WHighChartFunctionString(formatter));
	}

	public Boolean getShadow()
	{
		return shadow;
	}

	public WHighChartTooltipOptions setShadow(Boolean shadow)
	{
		this.shadow = shadow;
		return this;
	}

	public Boolean getShared()
	{
		return shared;
	}

	public WHighChartTooltipOptions setShared(Boolean shared)
	{
		this.shared = shared;
		return this;
	}

	public Number getSnap()
	{
		return snap;
	}

	public WHighChartTooltipOptions setSnap(Number snap)
	{
		this.snap = snap;
		return this;
	}

	public String getStyle()
	{
		return style;
	}

	public WHighChartTooltipOptions setStyle(String style)
	{
		this.style = style;
		return this;
	}
}
