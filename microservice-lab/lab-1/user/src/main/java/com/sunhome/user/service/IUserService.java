package com.sunhome.user.service;

import com.sunhome.user.model.User;

public interface IUserService {
    
    User saveUser(User user);

    User findUserById(long id);
}