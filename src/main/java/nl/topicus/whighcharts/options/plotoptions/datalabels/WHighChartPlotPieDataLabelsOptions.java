package nl.topicus.whighcharts.options.plotoptions.datalabels;

import nl.topicus.whighcharts.options.WHighChartHorizontalAlignmentType;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartPlotPieDataLabelsOptions extends WHighChartsDataLabelsOptions
{
	private static final long serialVersionUID = 1L;

	/**
	 * The width of the line connecting the data label to the pie slice
	 * 
	 * Defaults to 1.
	 */
	private Number connectorWidth;

	/**
	 * The color of the line connecting the data label to the pie slice. The default color
	 * is the same as the point's color.
	 * 
	 * Defaults to {point.color}.
	 */
	private String connectorColor;

	/**
	 * The distance from the data label to the connector.
	 * 
	 * Defaults to 5.
	 */
	private Number connectorPadding;

	/**
	 * The distance of the data label from the pie's edge. Negative numbers put the data
	 * label on top of the pie slices. Connectors are only shown for data labels outside
	 * the pie.
	 * 
	 * Defaults to 30.
	 */
	private Number distance;

	/**
	 * Whether to render the connector as a soft arc or a line with sharp break.
	 * 
	 * Defaults to true.
	 */
	private Boolean softConnector;

	/**
	 * N/A for pies. Defaults to null.
	 */
	@Override
	public WHighChartHorizontalAlignmentType getAlign()
	{
		return null;
	}

	/**
	 * N/A for pies. Defaults to null.
	 */
	@Override
	public WHighChartsDataLabelsOptions setAlign(WHighChartHorizontalAlignmentType align)
	{
		return this;
	}

	public Number getConnectorWidth()
	{
		return connectorWidth;
	}

	public WHighChartPlotPieDataLabelsOptions setConnectorWidth(Number connectorWidth)
	{
		this.connectorWidth = connectorWidth;
		return this;
	}

	public String getConnectorColor()
	{
		return connectorColor;
	}

	public WHighChartPlotPieDataLabelsOptions setConnectorColor(String connectorColor)
	{
		this.connectorColor = connectorColor;
		return this;
	}

	public Number getConnectorPadding()
	{
		return connectorPadding;
	}

	public WHighChartPlotPieDataLabelsOptions setConnectorPadding(Number connectorPadding)
	{
		this.connectorPadding = connectorPadding;
		return this;
	}

	public Number getDistance()
	{
		return distance;
	}

	public WHighChartPlotPieDataLabelsOptions setDistance(Number distance)
	{
		this.distance = distance;
		return this;
	}

	public Boolean getSoftConnector()
	{
		return softConnector;
	}

	public WHighChartPlotPieDataLabelsOptions setSoftConnector(Boolean softConnector)
	{
		this.softConnector = softConnector;
		return this;
	}

}
