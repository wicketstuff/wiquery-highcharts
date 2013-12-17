package nl.topicus.whighcharts.options;

import java.io.Serializable;

import nl.topicus.whighcharts.options.global.WHighChartGlobalOptions;
import nl.topicus.whighcharts.options.lang.WHighChartLangOptions;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Contains settings that must be set globally using Highcharts.setOptions, rather than
 * during the chart initiation. Currently consists of global options and language options.
 * 
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonInclude(Include.NON_NULL)
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
