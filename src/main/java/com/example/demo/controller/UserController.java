package com.example.demo.controller;

import com.example.demo.annotation.DataSource;
import com.example.demo.domain.User;
import com.example.demo.enums.DataSourceType;
import com.example.demo.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@Slf4j
@RestController
public class UserController {

    @Resource
    private UserRepository userRepository;

    @GetMapping("/user/ds0")
    @DataSource(DataSourceType.PRIMARY)
    public User userds0(String name){
        User user = new User();
        user.setName(name);
        return userRepository.save(user);
    }

    @GetMapping("/user/ds1")
    @DataSource(DataSourceType.SECONDARY)
    public User userds1(String name){
        User user = new User();
        user.setName(name);
        return userRepository.save(user);
    }
}
