package com.example.productcatalogservice.service;

import com.example.productcatalogservice.dtos.FakeStoreProductDto;
import com.example.productcatalogservice.models.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;

import java.util.List;

public class ProductService implements InterfaceProductService{

    private RestTemplateBuilder restTemplateBuilder ;

    @Override
    public Product getProductById() {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createProducts(Product product) {
        return null;
    }




    //converter
    private Product fakeStoreProductDtoToProduct(FakeStoreProductDto fakeStoreProductDto){
        Product product = new Product();
        product.setId(fakeStoreProductDto.getId());
        //product.setCategory(fakeStoreProductDto.getCategory());
        product.setName(fakeStoreProductDto.getTitle());
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setPrice(fakeStoreProductDto.getPrice());
        product.setImgUrl(fakeStoreProductDto.getImage());
        return product;
    }
}
