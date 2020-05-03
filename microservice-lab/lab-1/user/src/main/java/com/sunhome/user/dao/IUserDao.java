package com.sunhome.user.dao;

import com.sunhome.user.model.User;

public interface IUserDao {
    User create(User user);

    void update(User user);

    User getUserById(long id);

    void getUserByName(String name);

    void delete(long id);
}