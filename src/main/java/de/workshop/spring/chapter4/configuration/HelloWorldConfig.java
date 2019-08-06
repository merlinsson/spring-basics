package de.workshop.spring.chapter4.configuration;

import de.workshop.spring.chapter4.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class HelloWorldConfig {

    @Bean(name = "helloWorld", initMethod = "init", destroyMethod = "destroy")
    @Scope("singleton")
    public HelloWorld helloWorld() {
        HelloWorld world = new HelloWorld();
        HelloWorld world2 = new HelloWorld("mystring");
        world.setMessage("Hello world!!");
        return world;
    }

}
