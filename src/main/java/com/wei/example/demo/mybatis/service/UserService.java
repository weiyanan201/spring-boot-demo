package com.wei.example.demo.mybatis.service;

import com.wei.example.demo.mybatis.mapper.UserMapper;
import com.wei.example.demo.mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserService {
    @Autowired()
    private UserMapper userMapper;

    public List<User> queryAll(){
        List<User> list = userMapper.getAll();
        for (User user : list){
            System.out.println(user.toString());
        }
        return list;
    }
}
