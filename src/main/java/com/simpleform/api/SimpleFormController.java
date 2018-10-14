package com.simpleform.api;

import com.simpleform.domain.model.SimpleFormRequest;
import org.everit.json.schema.Schema;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SimpleFormController {

    @Autowired
    private Schema schema;

    @GetMapping(value="/banking/get/{id}", produces={"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public String getBankingInfo(@PathVariable("id") String idString){
        return "OK";
    }

    @PostMapping(value="/banking/update", produces={"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public SimpleFormRequest updateBankingInfo(@RequestBody SimpleFormRequest request){
        JSONObject requestJson = new JSONObject(request);
        schema.validate(requestJson);
        /*
        Validation fail, it will throw exception
        when pass, it will return the original request
         */
        return request;
    }
}
