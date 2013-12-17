package nl.topicus.whighcharts.options.axis;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartStyleOptions;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonInclude(Include.NON_NULL)
public class WHighChartAxisPlotLinesLabelOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String text;

	private String align;

	private String verticalAlign;

	private String textAlign;

	private Number rotation;

	private Number x;

	private Number y;

	private WHighChartStyleOptions style;

	public String getAlign()
	{
		return align;
	}

	public WHighChartAxisPlotLinesLabelOptions setAlign(String align)
	{
		this.align = align;
		return this;
	}

	public WHighChartAxisPlotLinesLabelOptions setVerticalAlign(String verticalAlign)
	{
		this.verticalAlign = verticalAlign;
		return this;
	}

	public String getVerticalAlign()
	{
		return verticalAlign;
	}

	public WHighChartAxisPlotLinesLabelOptions setRotation(Number rotation)
	{
		this.rotation = rotation;
		return this;
	}

	public Number getRotation()
	{
		return rotation;
	}

	public WHighChartAxisPlotLinesLabelOptions setTextAlign(String textAlign)
	{
		this.textAlign = textAlign;
		return this;
	}

	public String getTextAlign()
	{
		return textAlign;
	}

	public WHighChartAxisPlotLinesLabelOptions setX(Number x)
	{
		this.x = x;
		return this;
	}

	public Number getX()
	{
		return x;
	}

	public WHighChartAxisPlotLinesLabelOptions setY(Number y)
	{
		this.y = y;
		return this;
	}

	public Number getY()
	{
		return y;
	}

	public WHighChartAxisPlotLinesLabelOptions setText(String text)
	{
		this.text = text;
		return this;
	}

	public String getText()
	{
		return text;
	}

	public WHighChartAxisPlotLinesLabelOptions setStyle(WHighChartStyleOptions style)
	{
		this.style = style;
		return this;
	}

	public WHighChartStyleOptions getStyle()
	{
		return style;
	}
}
