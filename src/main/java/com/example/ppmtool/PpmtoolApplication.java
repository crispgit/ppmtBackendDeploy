package com.example.ppmtool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@RestController
public class PpmtoolApplication extends SpringBootServletInitializer {

  @RequestMapping("/")
  public String test() {
    return "this is a test for deploy";
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