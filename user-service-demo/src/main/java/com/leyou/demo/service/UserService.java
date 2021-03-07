package com.leyou.demo.service;

import com.leyou.demo.mapper.UserMapper;
import com.leyou.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserService {

  @Autowired
  private UserMapper userMapper;

  public User queryById(Long id) {
    try {
      //Thread.sleep(new Random().nextInt(20000));
    } catch (Exception e) {
      e.printStackTrace();
    }
    return this.userMapper.selectByPrimaryKey(id);
  }
}
