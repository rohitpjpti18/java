package com.sunhome.product.service;

import javax.transaction.Transactional;

import com.sunhome.product.dao.ProductDao;
import com.sunhome.product.models.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Transactional
@Configuration
public class ProductService {
    
    @Autowired
    private ProductDao productdao;

    public void create(Product product) {
        productdao.create(product);
    }

    public Product getProduct(long id) {
        return productdao.getProductById(id);
    }
}