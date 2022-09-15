package com.catface.ddd.ddddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 */
@SpringBootApplication(scanBasePackages = {
    "com.catface.ddd"
})
public class DddDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DddDemoApplication.class, args);
    System.out.println("http://localhost:8080/doc.html");
  }

}
