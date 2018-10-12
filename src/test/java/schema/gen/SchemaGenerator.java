package schema.gen;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kjetland.jackson.jsonSchema.JsonSchemaGenerator;
import com.simpleform.domain.model.SimpleFormRequest;
import org.junit.Test;

public class SchemaGenerator {
    @Test
    public void generateSchema(){
    }

    public static String getSchemaAsString(){
        String schemaString = "";
        ObjectMapper objectMapper = new ObjectMapper();
        JsonSchemaGenerator jsonSchemaGenerator = new JsonSchemaGenerator(objectMapper);

        // If using JsonSchema to generate HTML5 GUI:
        // JsonSchemaGenerator html5 = new JsonSchemaGenerator(objectMapper, JsonSchemaConfig.html5EnabledSchema() );

        // If you want to configure it manually:
        // JsonSchemaConfig config = JsonSchemaConfig.create(...);
        // JsonSchemaGenerator generator = new JsonSchemaGenerator(objectMapper, config);


        JsonNode jsonSchema = jsonSchemaGenerator.generateJsonSchema(SimpleFormRequest.class);
        try {
            schemaString = objectMapper.writeValueAsString(jsonSchema);
        }catch(Exception e){
            e.printStackTrace();
        }
        return schemaString;
    }
}
