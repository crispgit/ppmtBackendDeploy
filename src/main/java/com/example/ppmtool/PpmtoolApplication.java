package com.example.ppmtool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PpmtoolApplication extends SpringBootServletInitializer {

  @RequestMapping("/")
  public String index() {
    return "index";
  }

  @RequestMapping("/hello")
  public String test2() {
    return "hello world";
  }

  @Bean
  BCryptPasswordEncoder bCryptPasswordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(PpmtoolApplication.class);
  }

  public static void main(String[] args) {
    SpringApplication.run(PpmtoolApplication.class, args);
  }
}