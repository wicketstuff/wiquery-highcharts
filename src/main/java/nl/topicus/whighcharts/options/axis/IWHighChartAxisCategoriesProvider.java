package nl.topicus.whighcharts.options.axis;

import java.util.List;

public interface IWHighChartAxisCategoriesProvider
{
	/**
	 * @return a list of all categories available for the X axis. (should) return null
	 *         when no categories are available.
	 */
	List<String> getxAxisCategories();

	/**
	 * @return a list of all categories available for the Y axis. (should) return null
	 *         when no categories are available.
	 */
	List<String> getyAxisCategories();
}
