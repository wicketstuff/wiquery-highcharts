package nl.topicus.whighcharts.options;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartAxisOptions
{
	private WHighchartAxisLabelsOptions labels;

	private WHighChartTitleOptions title;

	public WHighchartAxisLabelsOptions getLabels()
	{
		if (labels == null)
			labels = new WHighchartAxisLabelsOptions();
		return labels;
	}

	public WHighChartAxisOptions setLabels(WHighchartAxisLabelsOptions labels)
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
}
