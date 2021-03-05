package com.leyou.demo.controller;

import com.leyou.demo.pojo.User;
import com.leyou.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("consumer")
public class ConsumerController {

  @Autowired
  private UserService userService;

  @GetMapping("/queryById")
  public  List<User>  queryById(@RequestParam(value = "ids")  List<Long> ids) {
    return this.userService.queryUserByIds(ids);
  }
}
