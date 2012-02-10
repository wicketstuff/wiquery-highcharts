package nl.topicus.whighcharts.options.axis;

/**
 * The type of axis. Can be one of "linear" or "datetime". In a datetime axis, the numbers
 * are given in milliseconds, and tick marks are placed on appropriate values like full
 * hours or days. As of 2.1.6, "logarithmic" is added as an experimental feature, but it
 * is not yet fully implemented.
 */
public enum WHighChartAxisType
{
	linear,
	datetime,
	logarithmic;
}
