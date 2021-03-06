package com.leyou.demo.controller;

import com.leyou.demo.pojo.User;
import com.leyou.demo.service.UserService;
import com.leyou.demo.service.UserService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("consumer")
public class ConsumerController {

  @Autowired
  private UserService userService;

  @Autowired
  private UserService2 userService2;

  @GetMapping("/queryById")
  public  List<User>  queryById(@RequestParam(value = "ids")  List<Long> ids) {
    return this.userService.queryUserByIds(ids);
  }

  @GetMapping("/balanceQuery")
  public  List<User>  balanceQuery(@RequestParam(value = "ids")  List<Long> ids) {
    return this.userService2.queryUserByIds(ids);
  }
}
