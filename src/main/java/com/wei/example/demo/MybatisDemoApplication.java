package com.wei.example.demo;

import com.wei.example.demo.mybatis.enums.UserSexEnum;
import com.wei.example.demo.mybatis.mapper.UserMapper;
import com.wei.example.demo.mybatis.model.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("com.wei.example.demo.mybatis.mapper")
public class MybatisDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MybatisDemoApplication.class,args);
        UserMapper userMapper = context.getBean(UserMapper.class);

        User user = new User("weiyanan","1234567", UserSexEnum.MAN);
        userMapper.insert(user);
        System.out.printf("done");
    }

}
