package nl.topicus.whighcharts.options;

import java.io.Serializable;

import nl.topicus.whighcharts.options.global.WHighChartGlobalOptions;
import nl.topicus.whighcharts.options.lang.WHighChartLangOptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * Contains settings that must be set globally using Highcharts.setOptions, rather than
 * during the chart initiation. Currently consists of global options and language options.
 * 
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartGlobalSettings implements Serializable
{
	private static final long serialVersionUID = 1L;

	private WHighChartGlobalOptions global;

	private WHighChartLangOptions lang;

	public WHighChartGlobalOptions getGlobal()
	{
		if (global == null)
			global = new WHighChartGlobalOptions();

		return global;
	}

	public WHighChartLangOptions getLang()
	{
		if (lang == null)
			lang = new WHighChartLangOptions();

		return lang;
	}

	public WHighChartGlobalSettings setGlobal(WHighChartGlobalOptions global)
	{
		this.global = global;
		return this;
	}

	public WHighChartGlobalSettings setLang(WHighChartLangOptions lang)
	{
		this.lang = lang;
		return this;
	}

}
