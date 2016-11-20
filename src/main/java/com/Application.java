package com;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableAutoConfiguration
//@RestController
@EnableConfigServer
@EnableEurekaServer
public class Application {

//    @GetMapping("/")
//    @ResponseBody
//    public String home(){
//        return "home";
//    }
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
