package com.example.productcatalogservice.controller;

import com.example.productcatalogservice.dtos.ProductDto;
import com.example.productcatalogservice.models.Product;
import com.example.productcatalogservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RequestMapping("/products")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductDto> getAllProducts(){
        ProductDto productDto = new ProductDto();
        productDto.setId(2l);
        productDto.setName("pants");
        List<ProductDto> productDtos = new ArrayList<>();
        productDtos.add(productDto);
        return productDtos;
    }

    @GetMapping("{id}")
    public ProductDto getProductById(@PathVariable("id") Long productId){
//        ProductDto productDto = new ProductDto();
//        productDto.setId(productId);
//        productDto.setName("pants");
       Product product = productService.getProductById();
        return productToProductDto(product);
    }

    @PostMapping
    public ProductDto createProduct(@RequestBody ProductDto productDto){
        return productDto;
    }
    @DeleteMapping("{id}")
    public ProductDto deleteProductDtoById(@PathVariable("id") Long productId){
        return null;
    }

    @PutMapping("{id}")
    public ProductDto updateProductById(@PathVariable("id") Long productId){
        ProductDto productDto = new ProductDto();
        productDto.setId(productId);
        productDto.setName("Shirt");
        productDto.setDescription("good quality clothes");
        return productDto;
    }



    //converter
    public ProductDto productToProductDto(Product product){
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setPrice(product.getPrice());
        //productDto.setCategory(product.getCategory());
        productDto.setImageUrl(product.getImgUrl());
        productDto.setName(product.getName());
        productDto.setDescription(product.getDescription());

        return productDto;
    }
}
