package nl.topicus.whighstock.options.rangeselector;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * The range selector is a tool for selecting ranges to display within the chart. It
 * provides buttons to select preconfigured ranges in the chart, like 1 day, 1 week, 1
 * month etc. It also provides input boxes where min and max dates can be manually input.
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockRangeSelectorOptions implements Serializable
{

	private static final long serialVersionUID = 1L;

	/**
	 * An array of configuration objects for the buttons.
	 * 
	 * Defaults to <code>
	 * 	buttons: [{<br/>
	 * 	&nbsp;type: 'month',<br/>
	 * 	&nbsp;count: 1,<br/>
	 * 	&nbsp;text: '1m'<br/>
	 * 	}, {<br/>
	 * 	&nbsp;type: 'month',<br/>
	 * 	&nbsp;count: 3,<br/>
	 * 	&nbsp;text: '3m'<br/>
	 * 	}, {<br/>
	 * 	&nbsp;type: 'month',<br/>
	 * 	&nbsp;count: 6,<br/>
	 * 	&nbsp;text: '6m'<br/>
	 * 	}, {<br/>
	 * 		&nbsp;type: 'ytd',<br/>
	 * 		&nbsp;text: 'YTD'<br/>
	 * 	}, {<br/>
	 * 		&nbsp;type: 'year',<br/>
	 * 		&nbsp;count: 1,<br/>
	 * 		&nbsp;text: '1y'<br/>
	 * 	}, {<br/>
	 * 		&nbsp;type: 'all',<br/>
	 * 		&nbsp;text: 'All'<br/>
	 * 	}]<br/>
	 * 	</code>
	 */
	private List<WHighStockButtonOptions> buttons;

	/**
	 * The space in pixels between the buttons in the range selector.
	 * 
	 * Defaults to 0.
	 */
	private Number buttonSpacing;

	/**
	 * A collection of attributes for the buttons. The object takes SVG attributes like
	 * fill, stroke, stroke-width, as well as style, a collection of CSS properties for
	 * the text.
	 */
	private String buttonTheme;

	/**
	 * Enable or disable the range selector.
	 * 
	 * Defaults to true.
	 */
	private Boolean enabled;

	/**
	 * CSS for the container DIV holding the input boxes. Use right and top for
	 * positioning, alternatively set right and top to 'auto' and set left or bottom
	 * instead.
	 */
	private String inputBoxStyle;

	/**
	 * The date format in the input boxes when not selected for editing.
	 * 
	 * Defaults to %b %e, %Y.
	 */
	private String inputDateFormat;

	/**
	 * Enable or disable the date input boxes.
	 */
	private Boolean inputEnabled;

	/**
	 * CSS for the HTML inputs in the range selector.
	 */
	private String inputStyle;

	/**
	 * CSS styles for the labels - the Zoom, From and To texts.
	 */
	private String labelStyle;

	/**
	 * The index of the button to appear pre-selected. Defaults to undefined.
	 */
	private Number selected;

	public WHighStockRangeSelectorOptions()
	{
	}

	/**
	 * @return the buttons
	 */
	public List<WHighStockButtonOptions> getButtons()
	{
		if (buttons == null)
		{
			buttons = new ArrayList<WHighStockButtonOptions>();
		}
		return buttons;
	}

	/**
	 * @param buttons
	 *            the buttons to set
	 * 
	 * @return this RangeSelectorOptions
	 */
	public WHighStockRangeSelectorOptions setButtons(List<WHighStockButtonOptions> buttons)
	{
		this.buttons = buttons;

		return this;
	}

	public WHighStockRangeSelectorOptions add(WHighStockButtonOptions button)
	{
		getButtons().add(button);

		return this;
	}

	public WHighStockRangeSelectorOptions clearButtons()
	{
		setButtons(new ArrayList<WHighStockButtonOptions>());

		return this;
	}

	/**
	 * @return the buttonSpacing
	 */
	public Number getButtonSpacing()
	{
		return buttonSpacing;
	}

	/**
	 * @param buttonSpacing
	 *            the buttonSpacing to set
	 * 
	 * @return this RangeSelectorOptions
	 */
	public WHighStockRangeSelectorOptions setButtonSpacing(Number buttonSpacing)
	{
		this.buttonSpacing = buttonSpacing;

		return this;
	}

	/**
	 * @return the buttonTheme
	 */
	public String getButtonTheme()
	{
		return buttonTheme;
	}

	/**
	 * @param buttonTheme
	 *            the buttonTheme to set
	 * 
	 * @return this RangeSelectorOptions
	 */
	public WHighStockRangeSelectorOptions setButtonTheme(String buttonTheme)
	{
		this.buttonTheme = buttonTheme;

		return this;
	}

	/**
	 * @return the enabled
	 */
	public Boolean getEnabled()
	{
		return enabled;
	}

	/**
	 * @param enabled
	 *            the enabled to set
	 * 
	 * @return this RangeSelectorOptions
	 */
	public WHighStockRangeSelectorOptions setEnabled(Boolean enabled)
	{
		this.enabled = enabled;

		return this;
	}

	/**
	 * @return the inputBoxStyle
	 */
	public String getInputBoxStyle()
	{
		return inputBoxStyle;
	}

	/**
	 * @param inputBoxStyle
	 *            the inputBoxStyle to set
	 * 
	 * @return this RangeSelectorOptions
	 */
	public WHighStockRangeSelectorOptions setInputBoxStyle(String inputBoxStyle)
	{
		this.inputBoxStyle = inputBoxStyle;

		return this;
	}

	/**
	 * @return the inputDateFormat
	 */
	public String getInputDateFormat()
	{
		return inputDateFormat;
	}

	/**
	 * @param inputDateFormat
	 *            the inputDateFormat to set
	 * 
	 * @return this RangeSelectorOptions
	 */
	public WHighStockRangeSelectorOptions setInputDateFormat(String inputDateFormat)
	{
		this.inputDateFormat = inputDateFormat;

		return this;
	}

	/**
	 * @return the inputEnabled
	 */
	public Boolean getInputEnabled()
	{
		return inputEnabled;
	}

	/**
	 * @param inputEnabled
	 *            the inputEnabled to set
	 * 
	 * @return this RangeSelectorOptions
	 */
	public WHighStockRangeSelectorOptions setInputEnabled(Boolean inputEnabled)
	{
		this.inputEnabled = inputEnabled;

		return this;
	}

	/**
	 * @return the inputStyle
	 */
	public String getInputStyle()
	{
		return inputStyle;
	}

	/**
	 * @param inputStyle
	 *            the inputStyle to set
	 * 
	 * @return this RangeSelectorOptions
	 */
	public WHighStockRangeSelectorOptions setInputStyle(String inputStyle)
	{
		this.inputStyle = inputStyle;

		return this;
	}

	/**
	 * @return the labelStyle
	 */
	public String getLabelStyle()
	{
		return labelStyle;
	}

	/**
	 * @param labelStyle
	 *            the labelStyle to set
	 * 
	 * @return this RangeSelectorOptions
	 */
	public WHighStockRangeSelectorOptions setLabelStyle(String labelStyle)
	{
		this.labelStyle = labelStyle;

		return this;
	}

	/**
	 * @return the selected
	 */
	public Number getSelected()
	{
		return selected;
	}

	/**
	 * @param selected
	 *            the selected to set
	 * 
	 * @return this RangeSelectorOptions
	 */
	public WHighStockRangeSelectorOptions setSelected(Number selected)
	{
		this.selected = selected;

		return this;
	}
}
