package nl.topicus.whighcharts.options.exporting;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonInclude(Include.NON_NULL)
public class WHighChartExportingOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Whether to enable the exporting module. Defaults to true.
	 */
	private Boolean enabled;

	/**
	 * The filename, without extension, to use for the exported chart. Defaults to
	 * "chart".
	 */
	private String filename;

	/**
	 * Default MIME type for exporting if chart.exportChart() is called without specifying
	 * a type option. Possible values are image/png, image/jpeg, application/pdf and
	 * image/svg+xml. Defaults to "image/png".
	 */
	private String type;

	/**
	 * The URL for the server module converting the SVG string to an image format. By
	 * default this points to Highslide Software's free web service. Defaults to
	 * http://export.highcharts.com.
	 */
	private String url;

	/**
	 * The pixel width of charts exported to PNG or JPG. Defaults to 800.
	 */
	private Number width;

	public Boolean getEnabled()
	{
		return enabled;
	}

	public WHighChartExportingOptions setEnabled(Boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}

	public String getFilename()
	{
		return filename;
	}

	public WHighChartExportingOptions setFilename(String filename)
	{
		this.filename = filename;
		return this;
	}

	public String getType()
	{
		return type;
	}

	public WHighChartExportingOptions setType(String type)
	{
		this.type = type;
		return this;
	}

	public String getUrl()
	{
		return url;
	}

	public WHighChartExportingOptions setUrl(String url)
	{
		this.url = url;
		return this;
	}

	public Number getWidth()
	{
		return width;
	}

	public WHighChartExportingOptions setWidth(Number width)
	{
		this.width = width;
		return this;
	}

}
