/**
 * 
 */
package nl.topicus.whighstock.options.rangeselector;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * An array of configuration objects for the buttons. The individual options for each item
 * are:
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockButtonOptions implements Serializable
{

	private static final long serialVersionUID = 1L;

	/**
	 * Defines the timespan, can be one of 'millisecond', 'second', 'minute', 'day',
	 * 'week', 'month', 'ytd' (year to date), 'year' and 'all'.
	 */
	private WHighStockButtonType type;

	/** Defines how many units of the defined type to use. */
	private Number count;

	/** The text for the button itself */
	private String text;

	/**
	 * Default Constructor
	 */
	public WHighStockButtonOptions()
	{
	}

	/**
	 * Constructor using fields
	 * 
	 * @param type
	 *            The ButtonType
	 * @param count
	 *            Defines how many units of the defined type to use
	 * @param text
	 *            The text for the button itself
	 */
	public WHighStockButtonOptions(WHighStockButtonType type, Number count, String text)
	{
		this.type = type;
		this.count = count;
		this.text = text;
	}

	/**
	 * @return the type
	 */
	public WHighStockButtonType getType()
	{
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 * 
	 * @return this {@link WHighStockButtonOptions}
	 */
	public WHighStockButtonOptions setType(WHighStockButtonType type)
	{
		this.type = type;

		return this;
	}

	/**
	 * @return the count
	 */
	public Number getCount()
	{
		return count;
	}

	/**
	 * @param count
	 *            the count to set
	 * 
	 * @return this {@link WHighStockButtonOptions}
	 */
	public WHighStockButtonOptions setCount(Number count)
	{
		this.count = count;

		return this;
	}

	/**
	 * @return the text
	 */
	public String getText()
	{
		return text;
	}

	/**
	 * @param text
	 *            the text to set
	 * 
	 * @return this {@link WHighStockButtonOptions}
	 */
	public WHighStockButtonOptions setText(String text)
	{
		this.text = text;

		return this;
	}

	/**
	 * Defenition of the button types
	 */
	public enum WHighStockButtonType
	{
		millisecond("millisecond"),
		second("second"),
		minute("minute"),
		day("day"),
		week("week"),
		month("month"),
		ytd("ytd"),
		year("year"),
		all("all");

		private final String type;

		/**
		 * Constructor
		 * 
		 * @param type
		 *            The type
		 */
		private WHighStockButtonType(String type)
		{
			this.type = type;
		}

		/**
		 * @see java.lang.Enum#toString()
		 */
		@Override
		public String toString()
		{
			return type;
		}
	}
}
