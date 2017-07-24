package com.ankitmg.testWebApplication.services;

import com.ankitmg.testWebApplication.configs.UtilityConfig;
import com.ankitmg.testWebApplication.dtos.HelloWorldCustomRequest;
import com.ankitmg.testWebApplication.dtos.HelloWorldResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by iankitgupta on 7/24/2017.
 */

@Component
public class HelloWorldService {

    @Autowired
    private UtilityConfig utilityConfig;

    public String welcomeMessage(String name){

        return "Welcome .. " + name;
    }

    public String goodByeMessage(String name){

        return "Good Bye, " + name +".";
    }

    public HelloWorldResponse customMessage(HelloWorldCustomRequest request){

        HelloWorldResponse response = new HelloWorldResponse();
        response.setMessage("Hello, " + request.getName() + ". You asked for a message of type "
                + request.getType());
        response.setEpochTimeStamp(utilityConfig.dateTimeSupplier().get().getMillis());
        return response;
    }
}
