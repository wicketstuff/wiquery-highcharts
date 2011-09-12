package nl.topicus.whighcharts.options;

import java.io.Serializable;

import org.apache.wicket.request.IRequestParameters;
import org.apache.wicket.util.string.StringValue;

public interface WHighChartFunction extends Serializable
{
	public static class WHighChartFunctionEvent implements Serializable
	{
		public WHighChartFunctionEvent(IRequestParameters map)
		{
			name = getValue(map, "event.currentTarget.name");
			visible = getValue(map, "this.visible");
			category = getValue(map, "event.point.category");
			config = getValue(map, "event.point.config");
			x = getValue(map, "this.x");
			y = getValue(map, "this.y");
			type = getValue(map, "event.type");

			altKey = getValue(map, "event.altKey");
			ctrlKey = getValue(map, "event.ctrlKey");
			shiftKey = getValue(map, "event.shiftKey");
			checked = getValue(map, "event.checked");

			chartX = getValue(map, "event.chartX");
			chartY = getValue(map, "event.chartY");

			xAxis = new WHighChartFunctionEventAxis(map, "event.xAxis[0]");
			yAxis = new WHighChartFunctionEventAxis(map, "event.yAxis[0]");

		}

		private String getValue(IRequestParameters map, String key)
		{
			org.apache.wicket.util.string.StringValue values = map.getParameterValue(key);
			if (values == null)
				return null;

			String value = values.toString("");
			if (value != null && value.trim().length() > 0 && !value.trim().startsWith("undefined"))
				return value;

			return null;
		}

		private static final long serialVersionUID = 1L;

		private String altKey;

		private String name;

		private String visible;

		private String category;

		private String config;

		private String x;

		private String y;

		private String type;

		private String ctrlKey;

		private String shiftKey;

		private String checked;

		private String chartX;

		private String chartY;

		private WHighChartFunctionEventAxis xAxis;

		private WHighChartFunctionEventAxis yAxis;

		public String getAltKey()
		{
			return altKey;
		}

		public String getName()
		{
			return name;
		}

		public String getVisible()
		{
			return visible;
		}

		public String getCategory()
		{
			return category;
		}

		public String getConfig()
		{
			return config;
		}

		public String getX()
		{
			return x;
		}

		public String getY()
		{
			return y;
		}

		public String getType()
		{
			return type;
		}

		public String getCtrlKey()
		{
			return ctrlKey;
		}

		public String getShiftKey()
		{
			return shiftKey;
		}

		public String getChecked()
		{
			return checked;
		}

		public String getChartX()
		{
			return chartX;
		}

		public String getChartY()
		{
			return chartY;
		}

		public WHighChartFunctionEventAxis getxAxis()
		{
			return xAxis;
		}

		public WHighChartFunctionEventAxis getyAxis()
		{
			return yAxis;
		}
	}

	public static class WHighChartFunctionEventAxis implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private String value;

		private String min;

		private String max;

		public WHighChartFunctionEventAxis(String value, String min, String max)
		{
			super();
			this.value = value;
			this.min = min;
			this.max = max;
		}

		public WHighChartFunctionEventAxis(IRequestParameters map, String string)
		{
			value = getValue(map, string + ".value");
			min = getValue(map, string + ".min");
			max = getValue(map, string + ".max");
		}

		@SuppressWarnings("hiding")
		private String getValue(IRequestParameters map, String key)
		{
			StringValue values = map.getParameterValue(key);
			if (values == null)
				return null;

			String value = values.toString("");
			if (value != null && value.trim().length() > 0 && !value.trim().startsWith("undefined"))
				return value;

			return null;
		}

		public String getValue()
		{
			return value;
		}

		public String getMin()
		{
			return min;
		}

		public String getMax()
		{
			return max;
		}
	}

	/**
	 * <p>
	 * Implementors must implement this function and place the following annotation on the
	 * class:
	 * </p>
	 * <p>
	 * <code>@JsonSerialize(using=ToStringNoQuoteSerializer)</code>
	 * </p>
	 */
	@Override
	public String toString();
}
