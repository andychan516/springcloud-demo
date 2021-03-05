package com.leyou.demo.demo.mapper;

import com.leyou.demo.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User>{
}

