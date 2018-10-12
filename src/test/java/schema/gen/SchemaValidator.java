package schema.gen;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.junit.Test;

public class SchemaValidator {
    @Test
    public void validateWithSchema(){

        SchemaLoader loader = SchemaLoader.builder()
                .schemaJson(getSchemaJson())
                .build();
        Schema schema = loader.load().build();


//        Schema schema = SchemaLoader.load(getSchemaJson());

    }

    public JSONObject getSchemaJson(){
        JSONObject json = null;
        String jsonSchemaAsString = SchemaGenerator.getSchemaAsString();
        System.out.println("jsonSchemaAsString: " + jsonSchemaAsString);
        try {
            json = new JSONObject(jsonSchemaAsString);
        }catch (Exception e){
            e.printStackTrace();
        }
        return json;
    }
}
