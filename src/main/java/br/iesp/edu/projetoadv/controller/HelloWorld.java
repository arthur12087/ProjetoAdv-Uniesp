package br.iesp.edu.projetoadv.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class HelloWorld {

    @RequestMapping("/helloworld")
    public String Helloworld() {
        return "Hello World";
    }
}
