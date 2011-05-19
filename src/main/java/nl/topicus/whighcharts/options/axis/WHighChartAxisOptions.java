package nl.topicus.whighcharts.options.axis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import nl.topicus.whighcharts.options.title.WHighChartTitleOptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartAxisOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private WHighChartAxisLabelsOptions labels;

	private WHighChartTitleOptions title;

	private List<String> categories;

	private Number min;

	/**
	 * An array of configuration objects for plot bands colouring parts of the plot area
	 * background. Defaults to null.
	 */
	List<WHighChartAxisPlotBandsOptions> plotBands;

	private Number gridLineWidth;

	List<WHighChartAxisPlotLinesOptions> plotLines;

	private Number offset;

	private Number max;

	public WHighChartAxisLabelsOptions getLabels()
	{
		if (labels == null)
			labels = new WHighChartAxisLabelsOptions();

		return labels;
	}

	public WHighChartAxisOptions setLabels(WHighChartAxisLabelsOptions labels)
	{
		this.labels = labels;
		return this;
	}

	public WHighChartTitleOptions getTitle()
	{
		if (title == null)
			title = new WHighChartTitleOptions();

		return title;
	}

	public WHighChartAxisOptions setTitle(WHighChartTitleOptions title)
	{
		this.title = title;
		return this;
	}

	public List<String> getCategories()
	{
		return categories;
	}

	public WHighChartAxisOptions setCategories(List<String> categories)
	{
		this.categories = categories;
		return this;
	}

	public WHighChartAxisOptions setCategories(String... values)
	{
		categories = new ArrayList<String>();
		categories.addAll(Arrays.asList(values));

		return this;
	}

	public Number getMin()
	{
		return min;
	}

	public WHighChartAxisOptions setMin(Number min)
	{
		this.min = min;
		return this;
	}

	public List<WHighChartAxisPlotBandsOptions> getPlotBands()
	{
		if (plotBands == null)
			plotBands = new ArrayList<WHighChartAxisPlotBandsOptions>();

		return plotBands;
	}

	public WHighChartAxisOptions setPlotBands(List<WHighChartAxisPlotBandsOptions> plotBands)
	{
		this.plotBands = plotBands;
		return this;
	}

	public WHighChartAxisOptions addPlotBand(WHighChartAxisPlotBandsOptions plotBand)
	{
		getPlotBands().add(plotBand);
		return this;
	}

	public WHighChartAxisOptions setGridLineWidth(Number gridLineWidth)
	{
		this.gridLineWidth = gridLineWidth;
		return this;

	}

	public Number getGridLineWidth()
	{
		return gridLineWidth;
	}

	public List<WHighChartAxisPlotLinesOptions> getPlotLines()
	{
		if (plotLines == null)
			plotLines = new ArrayList<WHighChartAxisPlotLinesOptions>();

		return plotLines;
	}

	public WHighChartAxisOptions setPlotLines(List<WHighChartAxisPlotLinesOptions> plotLines)
	{
		this.plotLines = plotLines;
		return this;
	}

	public WHighChartAxisOptions addPlotLine(WHighChartAxisPlotLinesOptions plotLine)
	{
		getPlotLines().add(plotLine);
		return this;
	}

	public WHighChartAxisOptions setOffset(Number offset)
	{
		this.offset = offset;
		return this;
	}

	public Number getOffset()
	{
		return offset;
	}

	public WHighChartAxisOptions setMax(Number max)
	{
		this.max = max;
		return this;
	}

	public Number getMax()
	{
		return max;
	}
}
