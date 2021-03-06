package com.leyou.demo.service;

import com.leyou.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService2 {

  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private DiscoveryClient discoveryClient;

  @Autowired
  private UserFeignClient userFeignClient;

  public List<User> queryUserByIdsFeign(List<Long> ids) {
    List<User> users = new ArrayList<>();
    ids.forEach(id -> {
      // 我们测试多次查询，
      users.add(this.userFeignClient.queryUserById(id));
    });
    return users;
  }

  public List<User> queryUserByIds(List<Long> ids) {
    List<User> users = new ArrayList<>();
    // 地址直接写服务名称即可
    String baseUrl = "http://user-service/user/";
    ids.forEach(id -> {
      // 我们测试多次查询，
      users.add(this.restTemplate.getForObject(baseUrl + id, User.class));
      // 每次间隔500毫秒
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });
    return users;
  }
}
