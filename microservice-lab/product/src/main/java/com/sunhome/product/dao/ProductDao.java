package com.sunhome.product.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.sunhome.product.models.Product;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
    @PersistenceContext
    private EntityManager entityManager;

    public Product create(Product product) {
        return entityManager.merge(product);
    }

    public void update(Product product) {
        entityManager.merge(product);
    }

    public Product getProductById(long id) {
        return entityManager.find(Product.class, id);
    }

    public void delete(long id){
        Product product = getProductById(id);
        if(product != null) {
            entityManager.remove(product);
        }
    }
}