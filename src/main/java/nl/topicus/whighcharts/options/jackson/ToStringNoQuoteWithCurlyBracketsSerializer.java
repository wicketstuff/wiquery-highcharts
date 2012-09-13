package nl.topicus.whighcharts.options.jackson;

import java.io.IOException;
import java.lang.reflect.Type;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.ser.std.SerializerBase;

public class ToStringNoQuoteWithCurlyBracketsSerializer extends SerializerBase<Object>
{
	public ToStringNoQuoteWithCurlyBracketsSerializer()
	{
		super(Object.class);
	}

	@Override
	public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonGenerationException
	{
		String out = value.toString();
		if (out != null && !out.isEmpty())
			jgen.writeRawValue("{" + out + "}");
	}

	@Override
	public JsonNode getSchema(SerializerProvider provider, Type typeHint)
	{
		return createSchemaNode("string", true);
	}
}
