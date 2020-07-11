package dev.shambho.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nSpanishService implements GreetingService{

    @Override
    public String sayNamahSivaya() {
        return "Aum Spanish";
    }
}
