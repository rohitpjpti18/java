package com.sunhome.product.controller;

import javax.validation.Valid;

import com.sunhome.product.dto.ProductDto;
import com.sunhome.product.models.Product;
import com.sunhome.product.service.IProductService;

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
@RequestMapping(value="/v1/products")
public class ProductController {
    @Autowired
    private IProductService productService;

    @PostMapping(value="/add")
    public void addProduct(@Valid @RequestBody ProductDto productdto){
        Product product = convert(productdto);
        productService.saveProduct(product);
    } 

    @GetMapping(value="/{productId}")
    public Product getProduct(@PathVariable("productId") long id){
        return productService.findProductById(id);
    }

    Product convert(ProductDto dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());

        return product;
    }
}