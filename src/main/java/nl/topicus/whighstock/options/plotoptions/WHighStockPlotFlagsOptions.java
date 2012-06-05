package nl.topicus.whighstock.options.plotoptions;

import java.io.Serializable;

import nl.topicus.whighcharts.options.jackson.StyleSerializer;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockPlotFlagsOptions extends
		AbstractWHighStockPlotChartOptions<WHighStockPlotFlagsOptions> implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Padding between each value groups, in x axis units.
	 * 
	 * Defaults to 0.2.
	 */
	private Number groupPadding;

	/**
	 * The color of the line/border of the flag.
	 * 
	 * Defaults to "black".
	 */
	private String lineColor;

	/**
	 * The id of the series that the flags should be drawn on. If no id is given, the
	 * flags are drawn on the x axis.
	 * 
	 * Defaults to undefined.
	 */
	private String onSeries;

	/**
	 * The shape of the marker. Can be one of "flag", "circlepin", "squarepin".
	 * 
	 * Defaults to "flag".
	 */
	private String shape;

	/**
	 * When multiple flags fall on the same value, this number determines the vertical
	 * offset between them Defaults to 7.
	 */
	private Number stackDistance;

	/**
	 * The text styles of the flag. Defaults to:
	 * 
	 * <pre>
	 * style: {
	 * 	fontSize: '11px',
	 * 	fontWeight: 'bold',
	 * 	textAlign: 'center'
	 * }
	 * </pre>
	 */
	@JsonSerialize(using = StyleSerializer.class, include = Inclusion.NON_NULL)
	private String style;

	/**
	 * The text to display on each flag. This can be defined on series level, or
	 * individually for each point.
	 * 
	 * Defaults to "A".
	 */
	private String title;

	/**
	 * The y position of the top left corner of the flag relative to either the series (if
	 * onSeries is defined), or the x axis.
	 * 
	 * Defaults to -30.
	 */
	private Number y;

	public Number getGroupPadding()
	{
		return groupPadding;
	}

	public WHighStockPlotFlagsOptions setGroupPadding(Number groupPadding)
	{
		this.groupPadding = groupPadding;
		return this;
	}

	public String getLineColor()
	{
		return lineColor;
	}

	public WHighStockPlotFlagsOptions setLineColor(String lineColor)
	{
		this.lineColor = lineColor;
		return this;
	}

	public String getOnSeries()
	{
		return onSeries;
	}

	public WHighStockPlotFlagsOptions setOnSeries(String onSeries)
	{
		this.onSeries = onSeries;
		return this;
	}

	public String getShape()
	{
		return shape;
	}

	public WHighStockPlotFlagsOptions setShape(String shape)
	{
		this.shape = shape;
		return this;
	}

	public Number getStackDistance()
	{
		return stackDistance;
	}

	public WHighStockPlotFlagsOptions setStackDistance(Number stackDistance)
	{
		this.stackDistance = stackDistance;
		return this;
	}

	public String getStyle()
	{
		return style;
	}

	public WHighStockPlotFlagsOptions setStyle(String style)
	{
		this.style = style;
		return this;
	}

	public String getTitle()
	{
		return title;
	}

	public WHighStockPlotFlagsOptions setTitle(String title)
	{
		this.title = title;
		return this;
	}

	public Number getY()
	{
		return y;
	}

	public WHighStockPlotFlagsOptions setY(Number y)
	{
		this.y = y;
		return this;
	}

}