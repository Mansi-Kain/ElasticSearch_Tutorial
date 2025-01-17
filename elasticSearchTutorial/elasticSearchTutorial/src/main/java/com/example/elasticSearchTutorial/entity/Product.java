package com.example.elasticSearchTutorial.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "products")

@JsonIgnoreProperties(ignoreUnknown=true)
public class Product {
    private int id;
    private String name;
    private String description;
    private int quantity;
    private double price;
}
