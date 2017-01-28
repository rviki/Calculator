package com.epam.rv.calc.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class CalcController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping(value="/hello", method=RequestMethod.POST)
    public String helloPost() {
        return "Poston hívtál";
    }
    
    @RequestMapping(value="/hello", method=RequestMethod.PUT)
    public String helloPut() {
        return "Puton hívtál";
    }

}