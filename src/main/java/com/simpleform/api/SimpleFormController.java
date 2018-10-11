package com.simpleform.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SimpleFormController {

    @GetMapping(value="/banking/get/{id}", produces={"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public String getModBankingInfo(@PathVariable("id") String idString){

        return "OK";
    }
}
