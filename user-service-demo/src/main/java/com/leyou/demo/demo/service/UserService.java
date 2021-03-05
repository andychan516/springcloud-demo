package com.leyou.demo.demo.service;

import com.leyou.demo.demo.mapper.UserMapper;
import com.leyou.demo.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserMapper userMapper;

  public User queryById(Long id) {
    return this.userMapper.selectByPrimaryKey(id);
  }
}
