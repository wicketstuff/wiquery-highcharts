package nl.topicus.whighcharts.options.jackson;

import java.io.IOException;
import java.lang.reflect.Type;

import org.apache.wicket.Component;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.ser.SerializerBase;

public class ComponentMarkupIdSerializer extends SerializerBase<Component>
{
	public ComponentMarkupIdSerializer()
	{
		super(Component.class);
	}

	@Override
	public void serialize(Component value, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonGenerationException
	{
		jgen.writeString(value.getMarkupId());
	}

	@Override
	public JsonNode getSchema(SerializerProvider provider, Type typeHint)
	{
		return createSchemaNode("string", true);
	}
}
