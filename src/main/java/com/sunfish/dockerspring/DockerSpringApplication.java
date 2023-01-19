package com.sunfish.dockerspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerSpringApplication {

    @RequestMapping("/")
    public String home(){
        return "Hello Docker your world!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerSpringApplication.class, args);
    }

}
