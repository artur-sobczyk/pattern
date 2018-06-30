package pl.art.tutorial.pattern.di.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GuiceExampleMain {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new Module());
        log.info(injector.getInstance(Service1.class).toString());
    }
}
