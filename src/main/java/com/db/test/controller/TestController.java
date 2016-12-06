package com.db.test.controller;

import com.db.test.inmemory.InMemoryDataBase;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kristof on 21/11/2016.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/putValue/{key}/{value}",method = RequestMethod.GET)
    public String putValue(@PathVariable("key") String key, @PathVariable("value") String value) {

        System.out.println("PutValue called");
        System.out.println("Key:" + key+ " Valye: "+value);

        InMemoryDataBase.addValue(key, value);

        return "OK";
    }

    @RequestMapping(value = "/getValue/{key}",method = RequestMethod.GET)
    public String getValue(@PathVariable("key") String key) {

        return InMemoryDataBase.getValue(key);

    }



}
