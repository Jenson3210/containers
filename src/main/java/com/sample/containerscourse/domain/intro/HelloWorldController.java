package com.sample.containerscourse.domain.intro;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    private final Environment environment;

    public HelloWorldController(final Environment environment) {
        this.environment = environment;
    }

    @GetMapping
    public String hello() {
        return """
               Hi there!
               I'm running with %s profile(s) on port %s!
               
               The custom argument is: "%s"
               """.formatted(String.join(", ", environment.getActiveProfiles()),
                             environment.getProperty("local.server.port"),
                             environment.getProperty("custom.argument"));
    }
}
