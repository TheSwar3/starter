package com.cory.starter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarterController {

    @GetMapping("/test")
    public Message starterMethod() {

        Message message = new Message("Cory needs a girlfriend...!!!");
        return message;
    }

}
