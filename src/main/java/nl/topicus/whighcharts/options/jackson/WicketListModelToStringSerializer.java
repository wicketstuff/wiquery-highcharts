package nl.topicus.whighcharts.options.jackson;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import org.apache.wicket.model.IModel;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.ser.SerializerBase;

@SuppressWarnings("rawtypes")
public class WicketListModelToStringSerializer extends SerializerBase<IModel>
{
	public WicketListModelToStringSerializer()
	{
		super(IModel.class);
	}

	@Override
	public void serialize(IModel value, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonGenerationException
	{
		jgen.writeStartArray();

		List values = (List) value.getObject();
		if (values != null)
		{
			for (int i = 0; i < values.size(); i++)
			{
				Object item = values.get(i);
				if (item != null)
				{
					jgen.writeString(values.get(i).toString());

					if (i + 1 < values.size())
						jgen.writeString(", ");
				}
			}
		}

		jgen.writeEndArray();
	}

	@Override
	public JsonNode getSchema(SerializerProvider provider, Type typeHint)
	{
		return createSchemaNode("string", true);
	}
}
