package com.example.deval.backend;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@RestController
public class BackendApplication {

  @Value("${test}")
  private String test;

  public static void main(String[] args) {
    SpringApplication.run(BackendApplication.class, args);
  }

  @RequestMapping(value = "/")
  public String test() {
    return "Test env variable value: " + test;
  }
}
