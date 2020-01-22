package com.wei.example.demo.mybatis;

import com.wei.example.demo.mybatis.model.User;
import com.wei.example.demo.mybatis.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
@MapperScan("com.wei.example.demo.mybatis.mapper")
public class MybatisDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MybatisDemoApplication.class,args);
        UserService userService = context.getBean(UserService.class);

        List<User> list = userService.queryAll();
        for (User user : list){
            System.out.println(user);
        }

    }

}
