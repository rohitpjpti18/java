package com.sunhome.product.service;

import com.sunhome.product.dao.ProductDao;
import com.sunhome.product.service.IProductService;
import com.sunhome.product.models.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ProductServiceImpl implements IProductService {
    private ProductDao productDao;


    public ProductDao getProductDao() {
        return this.productDao;
    }

    @Autowired    
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }


    @Override
    public Product saveProduct(Product product) {
        product = productDao.create(product);
        return product;
    }

    @Override
    public Product findProductById(long id){
        return productDao.getProductById(id);
    }
    
}