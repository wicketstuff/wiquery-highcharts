package nl.topicus.whighcharts.options.plotoptions;

import java.io.Serializable;

import nl.topicus.whighcharts.options.point.WHighChartPointOptions;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonInclude(Include.NON_NULL)
public class WHighChartPlotSeriesOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Boolean allowPointSelect;

	private Boolean animation;

	private String borderColor;

	private Number borderWidth;

	private String color;

	private Boolean connectNulls;

	private String cursor;

	private String dashStyle;

	private Boolean enableMouseTracking;

	private String id;

	private Number lineWidth;

	private WHighChartPointOptions point;

	private Number pointStart;

	private Number pointInterval;

	private Boolean selected;

	private Boolean step;

	private Boolean shadow;

	private Boolean showCheckbox;

	private Boolean showInLegend;

	private String stacking;

	private Boolean stickyTracking;

	private Boolean visible;

	private String zIndex;

	public Boolean getAllowPointSelect()
	{
		return allowPointSelect;
	}

	public WHighChartPlotSeriesOptions setAllowPointSelect(Boolean allowPointSelect)
	{
		this.allowPointSelect = allowPointSelect;
		return this;
	}

	public Boolean getAnimation()
	{
		return animation;
	}

	public WHighChartPlotSeriesOptions setAnimation(Boolean animation)
	{
		this.animation = animation;
		return this;
	}

	public String getBorderColor()
	{
		return borderColor;
	}

	public WHighChartPlotSeriesOptions setBorderColor(String borderColor)
	{
		this.borderColor = borderColor;
		return this;
	}

	public Number getBorderWidth()
	{
		return borderWidth;
	}

	public WHighChartPlotSeriesOptions setBorderWidth(Number borderWidth)
	{
		this.borderWidth = borderWidth;
		return this;
	}

	public String getColor()
	{
		return color;
	}

	public WHighChartPlotSeriesOptions setColor(String color)
	{
		this.color = color;
		return this;
	}

	public Boolean getConnectNulls()
	{
		return connectNulls;
	}

	public WHighChartPlotSeriesOptions setConnectNulls(Boolean connectNulls)
	{
		this.connectNulls = connectNulls;
		return this;
	}

	public String getCursor()
	{
		return cursor;
	}

	public WHighChartPlotSeriesOptions setCursor(String cursor)
	{
		this.cursor = cursor;
		return this;
	}

	public String getDashStyle()
	{
		return dashStyle;
	}

	public WHighChartPlotSeriesOptions setDashStyle(String dashStyle)
	{
		this.dashStyle = dashStyle;
		return this;
	}

	public Boolean getEnableMouseTracking()
	{
		return enableMouseTracking;
	}

	public WHighChartPlotSeriesOptions setEnableMouseTracking(Boolean enableMouseTracking)
	{
		this.enableMouseTracking = enableMouseTracking;
		return this;
	}

	public String getId()
	{
		return id;
	}

	public WHighChartPlotSeriesOptions setId(String id)
	{
		this.id = id;
		return this;
	}

	public Boolean getStep()
	{
		return step;
	}

	public WHighChartPlotSeriesOptions setStep(Boolean step)
	{
		this.step = step;
		return this;
	}

	public boolean isStep()
	{
		if (step == null)
			return Boolean.FALSE;

		return step;
	}

	public Number getLineWidth()
	{
		return lineWidth;
	}

	public WHighChartPlotSeriesOptions setLineWidth(Number lineWidth)
	{
		this.lineWidth = lineWidth;
		return this;
	}

	public WHighChartPointOptions getPoint()
	{
		if (point == null)
			point = new WHighChartPointOptions();
		return point;
	}

	public WHighChartPlotSeriesOptions setPoint(WHighChartPointOptions point)
	{
		this.point = point;
		return this;
	}

	public Number getPointStart()
	{
		return pointStart;
	}

	public WHighChartPlotSeriesOptions setPointStart(Number pointStart)
	{
		this.pointStart = pointStart;
		return this;
	}

	public Number getPointInterval()
	{
		return pointInterval;
	}

	public WHighChartPlotSeriesOptions setPointInterval(Number pointInterval)
	{
		this.pointInterval = pointInterval;
		return this;
	}

	public Boolean getSelected()
	{
		return selected;
	}

	public WHighChartPlotSeriesOptions setSelected(Boolean selected)
	{
		this.selected = selected;
		return this;
	}

	public Boolean getShadow()
	{
		return shadow;
	}

	public WHighChartPlotSeriesOptions setShadow(Boolean shadow)
	{
		this.shadow = shadow;
		return this;
	}

	public Boolean getShowCheckbox()
	{
		return showCheckbox;
	}

	public WHighChartPlotSeriesOptions setShowCheckbox(Boolean showCheckbox)
	{
		this.showCheckbox = showCheckbox;
		return this;
	}

	public Boolean getShowInLegend()
	{
		return showInLegend;
	}

	public WHighChartPlotSeriesOptions setShowInLegend(Boolean showInLegend)
	{
		this.showInLegend = showInLegend;
		return this;
	}

	public String getStacking()
	{
		return stacking;
	}

	public WHighChartPlotSeriesOptions setStacking(String stacking)
	{
		this.stacking = stacking;
		return this;
	}

	public Boolean getStickyTracking()
	{
		return stickyTracking;
	}

	public WHighChartPlotSeriesOptions setStickyTracking(Boolean stickyTracking)
	{
		this.stickyTracking = stickyTracking;
		return this;
	}

	public Boolean getVisible()
	{
		return visible;
	}

	public WHighChartPlotSeriesOptions setVisible(Boolean visible)
	{
		this.visible = visible;
		return this;
	}

	public String getzIndex()
	{
		return zIndex;
	}

	public WHighChartPlotSeriesOptions setzIndex(String zIndex)
	{
		this.zIndex = zIndex;
		return this;
	}
}