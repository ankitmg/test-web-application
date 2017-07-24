package com.ankitmg.testWebApplication.controllers;

import com.ankitmg.testWebApplication.dtos.HelloWorldCustomRequest;
import com.ankitmg.testWebApplication.dtos.HelloWorldResponse;
import com.ankitmg.testWebApplication.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by iankitgupta on 7/24/2017.
 */

@RestController
public class HelloWorldController extends BaseController
{

    @Autowired
    private HelloWorldService msgService;

    @RequestMapping("/")
    public String hello(){
        return "Hello, World";
    }

    @RequestMapping(value = "/me/hello/{name}", method = RequestMethod.GET)
    public String helloWorld(@PathVariable String name){

        return msgService.welcomeMessage(name);
    }

    @RequestMapping(value = "/me/bye/{name}", method = RequestMethod.GET)
    public String byeWorld(@PathVariable String name){

        return msgService.goodByeMessage(name);
    }

    @RequestMapping(value = "/custom", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<HelloWorldResponse> customMessage(@RequestBody HelloWorldCustomRequest request){

        return  ok(msgService.customMessage(request));
    }
}