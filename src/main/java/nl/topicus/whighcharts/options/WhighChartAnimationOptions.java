package nl.topicus.whighcharts.options;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * @author verhage
 * @author Dec 19, 2011
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WhighChartAnimationOptions implements Serializable
{
	private Number duration;

	public Number getDuration()
	{
		return duration;
	}

	public WhighChartAnimationOptions setDuration(Number duration)
	{
		this.duration = duration;
		return this;
	}
}
