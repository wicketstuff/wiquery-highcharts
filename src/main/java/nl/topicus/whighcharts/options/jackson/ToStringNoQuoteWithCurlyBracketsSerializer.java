package nl.topicus.whighcharts.options.jackson;

import java.io.IOException;
import java.lang.reflect.Type;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class ToStringNoQuoteWithCurlyBracketsSerializer extends StdSerializer<Object>
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
