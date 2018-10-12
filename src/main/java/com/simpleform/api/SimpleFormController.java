package com.simpleform.api;

import com.simpleform.domain.model.SimpleFormRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SimpleFormController {

    @GetMapping(value="/banking/get/{id}", produces={"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public String getBankingInfo(@PathVariable("id") String idString){

        return "OK";
    }

    @PostMapping(value="/banking/update", produces={"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public String updateBankingInfo(@RequestBody SimpleFormRequest request){

        return "OK";
    }
}
