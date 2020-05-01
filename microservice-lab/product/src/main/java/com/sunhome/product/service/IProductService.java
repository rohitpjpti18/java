package com.sunhome.product.service;

import com.sunhome.product.models.Product;

public interface IProductService {
    Product saveProduct(Product product);

    Product findProductById(long id);
}