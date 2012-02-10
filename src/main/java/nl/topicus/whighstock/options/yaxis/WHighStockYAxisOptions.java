/**
 * 
 */
package nl.topicus.whighstock.options.yaxis;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * The X axis or category axis. Normally this is the horizontal axis, though if the chart is inverted this is the
 * vertical axis. In case of multiple axes, the xAxis node is an array of configuration objects.
 * 
 * @author remcozigterman
 * 
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockYAxisOptions extends WHighStockAxisOptions
{
	/** Serial Version UID */
	private static final long serialVersionUID = 1L;

	private Number height;

	private Number top;

	/**
	 * @return the height
	 */
	public Number getHeight()
	{
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(Number height)
	{
		this.height = height;
	}

	/**
	 * @return the top
	 */
	public Number getTop()
	{
		return top;
	}

	/**
	 * @param top
	 *            the top to set
	 */
	public void setTop(Number top)
	{
		this.top = top;
	}

}
