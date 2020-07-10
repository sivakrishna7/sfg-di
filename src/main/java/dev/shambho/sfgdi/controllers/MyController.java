package dev.shambho.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    
    public String sayNamahSivaya(){
        System.out.println("Aum Namah Sivaya");
        
        return "Hara Hara Mahadeva";
    }
}
