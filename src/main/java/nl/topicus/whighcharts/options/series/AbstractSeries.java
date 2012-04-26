package nl.topicus.whighcharts.options.series;

import java.util.ArrayList;
import java.util.List;

import nl.topicus.whighcharts.options.WHighChartMarkerStateOptions;
import nl.topicus.whighcharts.options.WhighChartAnimationOptions;
import nl.topicus.whighcharts.options.chart.WHighChartChartOptionsType;
import nl.topicus.whighcharts.options.labels.WHighChartDataLabels;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class AbstractSeries<V, E extends ISeriesEntry<V>> implements ISeries<V, E>
{
	private static final long serialVersionUID = 1L;

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

	/**
	 * De size in procenten, setten als x + "%" dus bv. 45%
	 */
	private String size;

	/**
	 * De size in procenten, setten als x + "%" dus bv. 45%
	 */
	private String innerSize;

	/**
	 * undocumenten area of highcharts.
	 */
	private String color;

	private WHighChartDataLabels dataLabels;

	private WHighChartMarkerStateOptions marker;

	private Number lineWidth;

	private Boolean shadow;

	private String fillColor;

	private String stacking;

	private Boolean showInLegend;

	private Boolean enableMouseTracking;

	private Number zIndex;

	private WhighChartAnimationOptions animation;

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

	public WHighChartDataLabels getDataLabels()
	{
		return dataLabels;
	}

	public String getSize()
	{
		return size;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setSize(String size)
	{
		this.size = size;
		return (T) this;
	}

	public String getInnerSize()
	{
		return innerSize;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setInnerSize(String innerSize)
	{
		this.innerSize = innerSize;
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setDataLabels(WHighChartDataLabels dataLabels)
	{
		this.dataLabels = dataLabels;
		return (T) this;
	}

	public String getColor()
	{
		return color;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setColor(String color)
	{
		this.color = color;
		return (T) this;
	}

	public WHighChartMarkerStateOptions getMarker()
	{
		return marker;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setMarker(WHighChartMarkerStateOptions marker)
	{
		this.marker = marker;
		return (T) this;
	}

	public Number getLineWidth()
	{
		return lineWidth;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setLineWidth(Number lineWidth)
	{
		this.lineWidth = lineWidth;
		return (T) this;
	}

	public Boolean getShadow()
	{
		return shadow;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setShadow(Boolean shadow)
	{
		this.shadow = shadow;
		return (T) this;
	}

	public String getFillColor()
	{
		return fillColor;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setFillColor(String fillColor)
	{
		this.fillColor = fillColor;
		return (T) this;
	}

	public String getStacking()
	{
		return stacking;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setStacking(String stacking)
	{
		this.stacking = stacking;
		return (T) this;
	}

	public Boolean getShowInLegend()
	{
		return showInLegend;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setShowInLegend(Boolean showInLegend)
	{
		this.showInLegend = showInLegend;
		return (T) this;
	}

	public Boolean getEnableMouseTracking()
	{
		return enableMouseTracking;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setEnableMouseTracking(Boolean enableMouseTracking)
	{
		this.enableMouseTracking = enableMouseTracking;
		return (T) this;
	}

	public WhighChartAnimationOptions getAnimation()
	{
		return animation;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setAnimation(WhighChartAnimationOptions animation)
	{
		this.animation = animation;
		return (T) this;
	}

	public Number getZIndex()
	{
		return zIndex;
	}

	@SuppressWarnings("unchecked")
	public <T extends AbstractSeries<V, E>> T setZIndex(Number zIndex)
	{
		this.zIndex = zIndex;
		return (T) this;
	}

}
