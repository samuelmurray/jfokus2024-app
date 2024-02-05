package io.github.samuelmurray.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    static String greetTemplate = "Hello %s";

    @GetMapping("/hello/{name}")
    public String greet(@PathVariable String name) {
        if (name.length() > 0) {
            return String.format(greetTemplate, name);
        }
        return "Tell me your name!";
    }
}
