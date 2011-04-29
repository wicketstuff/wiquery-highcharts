package nl.topicus.whighcharts.data;

import java.util.ArrayList;
import java.util.List;

import nl.topicus.whighcharts.options.WHighChartChartOptionsType;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class AbstractSeries<V, E extends ISeriesEntry<V>> implements ISeries<V, E>
{
	/**
	 * An array of data points for the series. The points can be given in three ways: A
	 * list of numerical values. In this case, the numberical values will be interpreted
	 * and y values, and x values will be automatically calculated, either starting at 0
	 * and incrementing by 1, or from pointStart and pointInterval given in the
	 * plotOptions. If the axis is has categories, these will be used. Example: data: [0,
	 * 5, 3, 5] A list of arrays with two values. In this case, the first value is the x
	 * value and the second is the y value. If the first value is a string, it is applied
	 * as the name of the point, and the x value is incremented following the above rules.
	 * Example: data: [[5, 2], [6, 3], [8, 2]] A list of object with named values. In this
	 * case the objects are point configuration objects as seen under options.point.
	 * Example: data: [{ name: 'Point 1', color: '#00FF00', y: 0 }, { name: 'Point 2',
	 * color: '#FF00FF', y: 5 }] Defaults to "".
	 */
	private List<E> data = new ArrayList<E>();

	/**
	 * The name of the series as shown in the legend, tooltip etc. Defaults to "".
	 */
	private String name;

	/**
	 * This option allows grouping series in a stacked chart. The stack option can be a
	 * string or a number or anything else, as long as the grouped series' stack options
	 * match each other. Defaults to null.
	 */
	private Object stack;

	/**
	 * The type of series. Can be one of area, areaspline, bar, column, line, pie, scatter
	 * or spline. Defaults to "line".
	 */
	private WHighChartChartOptionsType type;

	/**
	 * When using dual or multiple x axes, this number defines which xAxis the particular
	 * series is connected to. It refers to the index of the axis in the xAxis array, with
	 * 0 being the first. Defaults to 0.
	 */
	private Number xAxis;

	/**
	 * When using dual or multiple y axes, this number defines which yAxis the particular
	 * series is connected to. It refers to the index of the axis in the yAxis array, with
	 * 0 being the first. Defaults to 0.
	 */
	private Number yAxis;

	@Override
	public List<E> getData()
	{
		return data;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setData(List<E> data)
	{
		this.data = data;
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T addEntry(E entry)
	{
		data.add(entry);
		return (T) this;
	}

	public String getName()
	{
		return name;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setName(String name)
	{
		this.name = name;
		return (T) this;
	}

	public Object getStack()
	{
		return stack;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setStack(Object stack)
	{
		this.stack = stack;
		return (T) this;
	}

	public WHighChartChartOptionsType getType()
	{
		return type;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setType(WHighChartChartOptionsType type)
	{
		this.type = type;
		return (T) this;
	}

	public Number getxAxis()
	{
		return xAxis;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setxAxis(Number xAxis)
	{
		this.xAxis = xAxis;
		return (T) this;
	}

	public Number getyAxis()
	{
		return yAxis;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setyAxis(Number yAxis)
	{
		this.yAxis = yAxis;
		return (T) this;
	}
}
