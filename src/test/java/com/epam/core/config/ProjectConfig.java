package com.epam.core.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

@Config.Sources("classpath:test.properties")
public interface ProjectConfig extends Config {

    String env();

    @Key("${env}.base.url")
    String baseUrl();

    @DefaultValue("true")
    boolean logging();

    @Key("${env}.token")
    String token();

    ProjectConfig config = ConfigFactory
            .create(ProjectConfig.class,
                    System.getProperties(),
                    System.getenv());
}
