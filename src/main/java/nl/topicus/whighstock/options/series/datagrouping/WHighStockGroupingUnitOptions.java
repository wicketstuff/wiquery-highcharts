/**
 * 
 */
package nl.topicus.whighstock.options.series.datagrouping;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighStockGroupingUnitOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/** unit name */
	private String name;

	/** allowed multiples */
	private List<Object> values;

	public WHighStockGroupingUnitOptions()
	{

	}

	public WHighStockGroupingUnitOptions(String name, Object... values)
	{
		this.name = name;
		this.values = Arrays.asList(values);
	}

	public String getName()
	{
		return name;
	}

	public WHighStockGroupingUnitOptions setName(String name)
	{
		this.name = name;

		return this;
	}

	public List<Object> getValues()
	{
		return values;
	}

	public WHighStockGroupingUnitOptions setValues(List<Object> values)
	{
		this.values = values;

		return this;
	}

}
