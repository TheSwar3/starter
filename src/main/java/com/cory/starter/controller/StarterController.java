package com.cory.starter.controller;

import com.cory.starter.model.Message;
import org.springframework.web.bind.annotation.*;

@RestController
public class StarterController {

    //https://www.baeldung.com/spring-request-param
    @GetMapping("/api/girlfriend")
    //Why do we not use @ResponseBody
    public Message starterMethod(@RequestParam String id) {
        Message message = new Message(id);
        return message; //What makes this JSON?  message is a Message object,
        // how does it return it's content like it does?
    }

    @PutMapping("/api/put")
    public Message starterPutMethod(@RequestParam(name = "id") String id, @RequestParam String name) {
        //or @RequestParam(name = "id") or @RequestParam(value = “id”)

        //public String addFoo(@RequestParam(name = "id") String fooId, @RequestParam String name) {
        //    return "ID: " + fooId + " Name: " + name;
        Message message = new Message(id);
        message.setContent(name);
        return message;
    }

    @PostMapping("/api/post")
    public Message starterPostMethod(@RequestParam(name = "id") String id, @RequestParam String name) {
        //or @RequestParam(name = "id") or @RequestParam(value = “id”)

        //public String addFoo(@RequestParam(name = "id") String fooId, @RequestParam String name) {
        //    return "ID: " + fooId + " Name: " + name;
        Message message = new Message(id);
        message.setContent(name);
        return message;
    }

    @DeleteMapping("/api/delete")
    public Message deleteMessage(@RequestParam("id") String id) {
        Message message = new Message(id);
        message.deleteContent();
        return message;
    }

    //Post

    //Delete

}
