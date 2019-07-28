package com.cory.starter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class StarterController {

    @GetMapping("/home")
    public Message starterMethod() {
        Message message = new Message("Cory needs a girlfriend...!!!");
        return message;
    }

    @PostMapping("/home")
    public Message starterPutMethod(@PathVariable String content) {
        Message message = new Message(content);
        return message;
    }

    @DeleteMapping("/home")
    public void deleteMessage() {
        Message message = new Message("Some Message");
        message.deleteContent();
    }

    //Post

    //Delete

}
