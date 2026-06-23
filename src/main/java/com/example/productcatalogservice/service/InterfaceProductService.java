package com.example.productcatalogservice.service;

import com.example.productcatalogservice.models.Product;

import java.util.List;

public interface InterfaceProductService {
    Product getProductById();
    List<Product> getAllProducts();
    Product createProducts(Product product);
}
