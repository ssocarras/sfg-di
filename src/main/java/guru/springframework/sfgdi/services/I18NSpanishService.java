package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 */
//@Profile({"ES", "default"})  // commenting out to configure with a java configuration class
//@Service("i18nService")      // commenting out to configure with a java configuration class
public class I18NSpanishService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
