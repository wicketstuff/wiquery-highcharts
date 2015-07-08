package nl.topicus.whighcharts.options.jackson;

import java.io.IOException;
import java.lang.reflect.Type;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class ToStringNoQuoteSerializer extends StdSerializer<Object>
{
	private static final long serialVersionUID = 1L;

	public ToStringNoQuoteSerializer()
	{
		super(Object.class);
	}

	@Override
	public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonGenerationException
	{
		jgen.writeRawValue(value.toString());
	}

	@Override
	public JsonNode getSchema(SerializerProvider provider, Type typeHint)
	{
		return createSchemaNode("string", true);
	}
}
