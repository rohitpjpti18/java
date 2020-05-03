package com.sunhome.user.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.sunhome.user.model.User;

import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao{
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User create(User user) {
        return entityManager.merge(user);
    }

    @Override
    public void update(User user) {
        entityManager.merge(user);
    }

    @Override
    public User getUserById(long id){
        return entityManager.find(User.class, id);
    }

    @Override
    public void getUserByName(String name) {
        
    }

    @Override
    public void delete(long id) {
        User user = getUserById(id);
        if(user != null) {
            entityManager.remove(user);
        }
    }
}