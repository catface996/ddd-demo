package com.catface.ddd.ddddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
    "com.catface.ddd"
})
public class DddDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DddDemoApplication.class, args);
  }

}
