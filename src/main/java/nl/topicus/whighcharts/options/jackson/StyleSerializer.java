package nl.topicus.whighcharts.options.jackson;

import java.io.IOException;
import java.lang.reflect.Type;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.ser.SerializerBase;

public class StyleSerializer extends SerializerBase<String>
{
	public StyleSerializer()
	{
		super(String.class);
	}

	@Override
	public void serialize(String value, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonGenerationException
	{
		if (value.startsWith("{"))
			jgen.writeRawValue(value);
		else
			jgen.writeRawValue("{" + value + "}");
	}

	@Override
	public JsonNode getSchema(SerializerProvider provider, Type typeHint)
	{
		return createSchemaNode("string", true);
	}

}
