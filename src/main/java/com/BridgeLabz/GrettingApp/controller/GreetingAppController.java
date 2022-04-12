package com.BridgeLabz.GrettingApp.controller;


import com.BridgeLabz.GrettingApp.Entity.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingAppController {
    private static final String template="Hello,%s";
    private final AtomicLong counter=new AtomicLong();

    @GetMapping("Greeting")
    public Greeting greeting(@RequestParam(value="name",defaultValue = "World")String name){
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }
}
