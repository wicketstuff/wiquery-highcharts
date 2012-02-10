package nl.topicus.whighstock.options.scrollbar;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * The scrollbar is a means of panning over the X axis of a chart.
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockScrollbarOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Enable or disable the scrollbar
	 * 
	 * Defaults to true.
	 */
	private Boolean enabled;

	/**
	 * The height of the scrollbar. The height also applies to the width of the scroll
	 * arrows so that they are always squares.
	 * 
	 * Defaults to 20 for touch devices and 14 for mouse devices.
	 */
	private Number height;

	/**
	 * The background color of the scrollbar itself.
	 * 
	 * Defaults to a gray gradient.
	 */
	private String barBackgroundColor;

	/**
	 * The border rounding radius of the bar.
	 * 
	 * Defaults to 2.
	 */
	private Number barBorderRadius;

	/**
	 * The width of the bar's border.
	 * 
	 * Defaults to 1.
	 */
	private Number barBorderWidth;

	/**
	 * The color of the bar's border.
	 * 
	 * Defaults to #666.
	 */
	private String barBorderColor;

	/**
	 * The color of the small arrow inside the scrollbar buttons
	 * 
	 * Defaults to #666.
	 */
	private String buttonArrowColor;

	/**
	 * The color of scrollbar buttons.
	 * 
	 * Defaults to a gray gradient.
	 */
	private String buttonBackgroundColor;

	/**
	 * The color of the border of the scrollbar buttons.
	 * 
	 * Defaults to #666.
	 */
	private String buttonBorderColor;

	/**
	 * The corner radius of the scrollbar buttons.
	 * 
	 * Defaults to 2.
	 */
	private Number buttonBorderRadius;

	/**
	 * The border width of the scrollbar buttons.
	 * 
	 * Defaults to 1.
	 */
	private Number buttonBorderWidth;

	/**
	 * The color of the small rifles in the middle of the scrollbar.
	 * 
	 * Defaults to #666.
	 */
	private String rifleColor;

	/**
	 * TThe color of the track background.
	 * 
	 * The default is a gray gradient.
	 */
	private String trackBackgroundColor;

	/**
	 * The color of the border of the scrollbar track.
	 */
	private String trackBorderColor;

	/**
	 * The width of the border of the scrollbar track.
	 * 
	 * Defaults to 1.
	 */
	private Number trackBorderWidth;

	/**
	 * The corner radius of the border of the scrollbar track.
	 * 
	 * Defaults to 0.
	 */
	private Number trackBorderRadius;

	public Boolean getEnabled()
	{
		return enabled;
	}

	public WHighStockScrollbarOptions setEnabled(Boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}

	public Number getHeight()
	{
		return height;
	}

	public WHighStockScrollbarOptions setHeight(Number height)
	{
		this.height = height;
		return this;
	}

	public String getBarBackgroundColor()
	{
		return barBackgroundColor;
	}

	public WHighStockScrollbarOptions setBarBackgroundColor(String barBackgroundColor)
	{
		this.barBackgroundColor = barBackgroundColor;
		return this;
	}

	public Number getBarBorderRadius()
	{
		return barBorderRadius;
	}

	public WHighStockScrollbarOptions setBarBorderRadius(Number barBorderRadius)
	{
		this.barBorderRadius = barBorderRadius;
		return this;
	}

	public Number getBarBorderWidth()
	{
		return barBorderWidth;
	}

	public WHighStockScrollbarOptions setBarBorderWidth(Number barBorderWidth)
	{
		this.barBorderWidth = barBorderWidth;
		return this;
	}

	public String getBarBorderColor()
	{
		return barBorderColor;
	}

	public WHighStockScrollbarOptions setBarBorderColor(String barBorderColor)
	{
		this.barBorderColor = barBorderColor;
		return this;
	}

	public String getButtonArrowColor()
	{
		return buttonArrowColor;
	}

	public WHighStockScrollbarOptions setButtonArrowColor(String buttonArrowColor)
	{
		this.buttonArrowColor = buttonArrowColor;
		return this;
	}

	public String getButtonBackgroundColor()
	{
		return buttonBackgroundColor;
	}

	public WHighStockScrollbarOptions setButtonBackgroundColor(String buttonBackgroundColor)
	{
		this.buttonBackgroundColor = buttonBackgroundColor;
		return this;
	}

	public String getButtonBorderColor()
	{
		return buttonBorderColor;
	}

	public WHighStockScrollbarOptions setButtonBorderColor(String buttonBorderColor)
	{
		this.buttonBorderColor = buttonBorderColor;
		return this;
	}

	public Number getButtonBorderRadius()
	{
		return buttonBorderRadius;
	}

	public WHighStockScrollbarOptions setButtonBorderRadius(Number buttonBorderRadius)
	{
		this.buttonBorderRadius = buttonBorderRadius;
		return this;
	}

	public Number getButtonBorderWidth()
	{
		return buttonBorderWidth;
	}

	public WHighStockScrollbarOptions setButtonBorderWidth(Number buttonBorderWidth)
	{
		this.buttonBorderWidth = buttonBorderWidth;
		return this;
	}

	public String getRifleColor()
	{
		return rifleColor;
	}

	public WHighStockScrollbarOptions setRifleColor(String rifleColor)
	{
		this.rifleColor = rifleColor;
		return this;
	}

	public String getTrackBackgroundColor()
	{
		return trackBackgroundColor;
	}

	public WHighStockScrollbarOptions setTrackBackgroundColor(String trackBackgroundColor)
	{
		this.trackBackgroundColor = trackBackgroundColor;
		return this;
	}

	public String getTrackBorderColor()
	{
		return trackBorderColor;
	}

	public WHighStockScrollbarOptions setTrackBorderColor(String trackBorderColor)
	{
		this.trackBorderColor = trackBorderColor;
		return this;
	}

	public Number getTrackBorderWidth()
	{
		return trackBorderWidth;
	}

	public WHighStockScrollbarOptions setTrackBorderWidth(Number trackBorderWidth)
	{
		this.trackBorderWidth = trackBorderWidth;
		return this;
	}

	public Number getTrackBorderRadius()
	{
		return trackBorderRadius;
	}

	public WHighStockScrollbarOptions setTrackBorderRadius(Number trackBorderRadius)
	{
		this.trackBorderRadius = trackBorderRadius;
		return this;
	}

}
