package schema.gen;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.junit.Test;

public class SchemaValidator {
    @Test
    public void validateWithSchema(){
/*
        SchemaLoader loader = SchemaLoader.builder()
                .schemaJson(getSchemaJson())
                .build();
        Schema schema = loader.load().build();
*/

        Schema schema = SchemaLoader.load(getSchemaJson());
        String jsonString="{bankInfo:{\"accountHolderName\":\"Way L\", \"institution\":\"TD\", \"transitNumber\":101, \"accountNumber\":123456789},\"email\":\"way@hotmail.com\", \"phone\":\"416-336-6689\"}";

        JSONObject json=null;
        try {
            json = new JSONObject(jsonString);
        }catch (Exception e){
            e.printStackTrace();
        }
        schema.validate(json);

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
