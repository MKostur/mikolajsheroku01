package pl.zajecia.mikolajsheroku01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Mikolajsheroku01Application {

    public static void main(String[] args) {
        SpringApplication.run(Mikolajsheroku01Application.class, args);
    }
    @GetMapping
    public String get(){
        return "Hello Jenkins";
    }
}

