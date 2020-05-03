package com.sunhome.product.dao;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import com.sunhome.product.models.Product;

import org.springframework.stereotype.Repository;
import javax.persistence.Query;

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

    public List<Product> getProductBySubType(String subType) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Query query = entityManager.createQuery("SELECT * FROM Products P WHERE P.subType=:type");
        return entityManager.
    }

    public void delete(long id){
        Product product = getProductById(id);
        if(product != null) {
            entityManager.remove(product);
        }
    }
}