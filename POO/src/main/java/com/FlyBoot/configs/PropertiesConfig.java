package com.FlyBoot.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySources({
        @PropertySource("classpath:application.properties"),
        @PropertySource("classpath:application-second.properties")
})
public class PropertiesConfig {
    @Bean
    public PropertySourcesPlaceholderConfigurer loadProperties(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
