package nl.topicus.whighcharts.options.navigation;

import java.io.Serializable;

import nl.topicus.whighcharts.options.jackson.ToStringNoQuoteSerializer;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartNavigationOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * CSS styles for the popup menu appearing by default when the export icon is clicked.
	 * This menu is rendered in HTML.
	 * 
	 * Defaults to
	 * 
	 * <pre>
	 * menuStyle: {
	 * 	border: '1px solid #A0A0A0',
	 * 	background: '#FFFFFF'
	 * }
	 * </pre>
	 */
	@JsonSerialize(using = ToStringNoQuoteSerializer.class)
	private String menuStyle;

	/**
	 * CSS styles for the individual items within the popup menu appearing by default when
	 * the export icon is clicked. The menu items are rendered in HTML.
	 * 
	 * Defaults to
	 * 
	 * <pre>
	 * menuItemStyle: {
	 * 	padding: '0 5px',
	 * 	background: NONE,
	 * 	color: '#303030'
	 * }
	 * </pre>
	 */
	private String menuItemStyle;

	/**
	 * CSS styles for the hover state of the individual items within the popup menu
	 * appearing by default when the export icon is clicked. The menu items are rendered
	 * in HTML.
	 * 
	 * Defaults to
	 * 
	 * <pre>
	 * menuItemHoverStyle: {
	 * 	background: '#4572A5',
	 * 	color: '#FFFFFF'
	 * }
	 * </pre>
	 */
	private String menuItemHoverStyle;

	/**
	 * General options for buttons like the Print and Export buttons.
	 */
	private WHighChartNavigationButtonOptions buttonOptions;

	public String getMenuStyle()
	{
		return menuStyle;
	}

	public WHighChartNavigationOptions setMenuStyle(String menuStyle)
	{
		this.menuStyle = menuStyle;
		return this;
	}

	public String getMenuItemStyle()
	{
		return menuItemStyle;
	}

	public WHighChartNavigationOptions setMenuItemStyle(String menuItemStyle)
	{
		this.menuItemStyle = menuItemStyle;
		return this;
	}

	public String getMenuItemHoverStyle()
	{
		return menuItemHoverStyle;
	}

	public WHighChartNavigationOptions setMenuItemHoverStyle(String menuItemHoverStyle)
	{
		this.menuItemHoverStyle = menuItemHoverStyle;
		return this;
	}

	public WHighChartNavigationButtonOptions getButtonOptions()
	{
		if (buttonOptions == null)
		{
			buttonOptions = new WHighChartNavigationButtonOptions();
		}
		return buttonOptions;
	}

	public WHighChartNavigationOptions setButtonOptions(
			WHighChartNavigationButtonOptions buttonOptions)
	{
		this.buttonOptions = buttonOptions;
		return this;
	}

}
