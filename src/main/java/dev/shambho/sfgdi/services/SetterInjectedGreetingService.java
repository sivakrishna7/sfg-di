package dev.shambho.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayNamahSivaya() {
        return "Aum Namah Sivaya - Setter";
    }
}
