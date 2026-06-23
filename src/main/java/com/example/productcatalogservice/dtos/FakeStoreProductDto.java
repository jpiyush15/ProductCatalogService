package com.example.productcatalogservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    private String title;
    private Long id;
    private String description;
    private String category;
    private Double price;
    private String image;
}
