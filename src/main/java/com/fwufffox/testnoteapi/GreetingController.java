package com.fwufffox.testnoteapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting GetGreeting(
            @RequestParam(name = "name", defaultValue = "World") String name
    ) {
        return new Greeting(counter.incrementAndGet(), "Hello %s!".formatted(name));
    }
}

