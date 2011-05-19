package nl.topicus.whighcharts.options;

import java.io.Serializable;
import java.util.Map;

public interface WHighChartFunction extends Serializable
{
	public static class WHighChartFunctionEvent implements Serializable
	{
		public WHighChartFunctionEvent(Map<String, String[]> map)
		{
			xAxis = new WHighChartFunctionEventAxis(map, "event.xAxis");
			yAxis = new WHighChartFunctionEventAxis(map, "event.yAxis");

			chartX = getValue(map, "event.chartX");
			chartY = getValue(map, "event.chartY");

			clientX = getValue(map, "event.clientX");
			clientY = getValue(map, "event.clientY");
		}

		private String getValue(Map<String, String[]> map, String key)
		{
			String[] values = map.get(key);
			if (values != null && values.length > 0 && values[0] != null
				&& values[0].trim().length() > 0 && !"undefined".equals(values[0].trim()))
				return values[0];

			return null;
		}

		private static final long serialVersionUID = 1L;

		private WHighChartFunctionEventAxis xAxis;

		private WHighChartFunctionEventAxis yAxis;

		private String chartX;

		private String chartY;

		private String clientX;

		private String clientY;

		public WHighChartFunctionEventAxis getxAxis()
		{
			return xAxis;
		}

		public WHighChartFunctionEventAxis getyAxis()
		{
			return yAxis;
		}

		public String getChartX()
		{
			return chartX;
		}

		public String getChartY()
		{
			return chartY;
		}

		public String getClientX()
		{
			return clientX;
		}

		public String getClientY()
		{
			return clientY;
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

		public WHighChartFunctionEventAxis(Map<String, String[]> map, String string)
		{
			value = getValue(map, string + ".value");
			min = getValue(map, string + ".min");
			max = getValue(map, string + ".max");
		}

		private String getValue(Map<String, String[]> map, String key)
		{
			String[] values = map.get(key);
			if (values != null && values.length > 0 && values[0] != null
				&& values[0].trim().length() > 0 && !"undefined".equals(values[0].trim()))
				return values[0];

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
