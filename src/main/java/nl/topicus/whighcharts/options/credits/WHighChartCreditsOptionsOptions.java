package nl.topicus.whighcharts.options.credits;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartHorizontalAlignmentType;
import nl.topicus.whighcharts.options.WHighChartVerticalAlignmentType;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartCreditsOptionsOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private WHighChartHorizontalAlignmentType align;

	private WHighChartVerticalAlignmentType verticalAlign;

	private Number x;

	private Number y;

	public WHighChartHorizontalAlignmentType getAlign()
	{
		return align;
	}

	public WHighChartCreditsOptionsOptions setAlign(WHighChartHorizontalAlignmentType align)
	{
		this.align = align;
		return this;
	}

	public WHighChartVerticalAlignmentType getVerticalAlign()
	{
		return verticalAlign;
	}

	public WHighChartCreditsOptionsOptions setVerticalAlign(
			WHighChartVerticalAlignmentType verticalAlign)
	{
		this.verticalAlign = verticalAlign;
		return this;
	}

	public Number getX()
	{
		return x;
	}

	public WHighChartCreditsOptionsOptions setX(Number x)
	{
		this.x = x;
		return this;
	}

	public Number getY()
	{
		return y;
	}

	public WHighChartCreditsOptionsOptions setY(Number y)
	{
		this.y = y;
		return this;
	}
}
