package pl.art.tutorial.pattern.di.guice;

import com.google.inject.AbstractModule;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(Service1.class).asEagerSingleton();
        bind(Service2.class).asEagerSingleton();
        bind(Service3.class).asEagerSingleton();
    }
}
