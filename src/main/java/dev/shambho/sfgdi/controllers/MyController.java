package dev.shambho.sfgdi.controllers;

import dev.shambho.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayNamahSivaya(){
        return greetingService.sayNamahSivaya();
    }
}
