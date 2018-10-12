package com.simpleform.config;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kjetland.jackson.jsonSchema.JsonSchemaGenerator;
import com.simpleform.domain.model.SimpleFormRequest;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;

@Configuration
public class AppConfig {

    @Value("${jsonSchemaAsString}")
    private String jsonSchemaAsString;

    @Bean
    @Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
    Schema getSchema(){
        Schema schema = SchemaLoader.load(getSchemaJson());
        return schema;
    }

    public JSONObject getSchemaJson(){
        JSONObject json = null;
        System.out.println("jsonSchemaAsString: " + jsonSchemaAsString);
        try {
            json = new JSONObject(jsonSchemaAsString);
        }catch (Exception e){
            e.printStackTrace();
        }

        return json;
    }
}
