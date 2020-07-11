package dev.shambho.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayNamahSivaya() {
        return "Aum Namah Sivaya - Primary";
    }
}
