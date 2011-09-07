package nl.topicus.whighcharts.web;

import nl.topicus.whighcharts.web.pages.HomePage;

import org.apache.wicket.Application;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.util.time.Duration;
import org.odlabs.wiquery.core.commons.compressed.YUIJavaScriptCompressor;

/**
 * Application object for your web application. If you want to run this application
 * without deploying, run the Start class.
 * 
 */
public class WicketApplication extends WebApplication
{
	@Override
	public Class<HomePage> getHomePage()
	{
		return HomePage.class;
	}

	@Override
	protected void init()
	{
		super.init();

		getMarkupSettings().setStripWicketTags(true);
		getResourceSettings().setResourcePollFrequency(Duration.ONE_MINUTE);

		getRequestLoggerSettings().setRequestLoggerEnabled(true);
		getRequestLoggerSettings().setRequestsWindowSize(200);
		getRequestLoggerSettings().setRecordSessionSize(true);

		if (Application.DEPLOYMENT.equals(getConfigurationType()))
		{
			getResourceSettings().setJavascriptCompressor(new YUIJavaScriptCompressor());
		}
	}

	public static WicketApplication get()
	{
		return (WicketApplication) WebApplication.get();
	}
}
