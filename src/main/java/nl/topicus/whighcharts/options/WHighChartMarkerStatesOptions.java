package nl.topicus.whighcharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartMarkerStatesOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private WHighChartMarkerStateOptions hover;

	private WHighChartMarkerStateOptions select;

	public WHighChartMarkerStateOptions getHover()
	{
		if (hover == null)
			hover = new WHighChartMarkerStateOptions();

		return hover;
	}

	public WHighChartMarkerStatesOptions setHover(WHighChartMarkerStateOptions hover)
	{
		this.hover = hover;
		return this;
	}

	public WHighChartMarkerStateOptions getSelect()
	{
		if (select == null)
			select = new WHighChartMarkerStateOptions();

		return select;
	}

	public WHighChartMarkerStatesOptions setSelect(WHighChartMarkerStateOptions select)
	{
		this.select = select;
		return this;
	}
}
