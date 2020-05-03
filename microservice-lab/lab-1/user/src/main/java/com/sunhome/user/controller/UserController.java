package com.sunhome.user.controller;

import javax.validation.Valid;

import com.sunhome.user.dto.UserDto;
import com.sunhome.user.model.User;
import com.sunhome.user.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
@RequestMapping(value="/v1/users")
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping(value="/register")
    public void addUser(@Valid @RequestBody UserDto userDto) {
        User user = convert(userDto);
        userService.saveUser(user);
    }

    @GetMapping(value="/{userId}")
    public User getUser(@PathVariable("userId") long id) {
        return userService.findUserById(id);
    }

    User convert(UserDto userDto){
        User user = new User();
        user.setName(userDto.getName());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());

        return user;
    }
}