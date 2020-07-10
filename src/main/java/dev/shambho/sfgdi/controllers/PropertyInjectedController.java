package dev.shambho.sfgdi.controllers;

import dev.shambho.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayNamahSivaya();
    }
}
