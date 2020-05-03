package com.sunhome.user.service;

import com.sunhome.user.dao.IUserDao;
import com.sunhome.user.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
    private IUserDao userDao;

    

    public IUserDao getUserDao() {
        return this.userDao;
    }

    @Autowired
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User saveUser(User user) { 
        user = userDao.create(user);
        return user;
    }

    @Override
    public User findUserById(long id) {
        return userDao.getUserById(id);
    }

}