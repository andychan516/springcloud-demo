package com.leyou.demo.service;

import com.leyou.demo.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("user-service")
public interface UserFeignClient {

  @GetMapping("/user/{id}")
  User queryUserById(@PathVariable("id") Long id);
}
