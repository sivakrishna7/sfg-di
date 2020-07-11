package dev.shambho.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService{
    @Override
    public String sayNamahSivaya() {
        return "Aum English";
    }
}
