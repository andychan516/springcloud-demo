package com.leyou.demo.service;

import com.leyou.demo.mapper.UserMapper;
import com.leyou.demo.pojo.User;
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
