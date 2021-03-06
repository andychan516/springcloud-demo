package com.leyou.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceApplication2 {

  public static void main(String[] args) {
    SpringApplication.run(UserServiceApplication2.class, args);
  }

}
