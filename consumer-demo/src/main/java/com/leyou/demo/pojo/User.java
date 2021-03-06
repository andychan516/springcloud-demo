package com.leyou.demo.pojo;

import java.io.Serializable;

public class User implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long id;

  // 用户名
  private String userName;

  // 密码
  private String password;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
