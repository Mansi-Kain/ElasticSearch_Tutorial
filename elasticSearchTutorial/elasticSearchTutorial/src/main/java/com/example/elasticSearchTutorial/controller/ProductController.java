package com.example.elasticSearchTutorial.controller;

import com.example.elasticSearchTutorial.entity.Product;
import com.example.elasticSearchTutorial.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apis")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/findAll")
    Iterable<Product> findAll(){

        return productService.getProducts();
    }

    @PostMapping("/insert")
    public Product insertProduct(@RequestBody Product product){
        return productService.insertProduct(product);
    }
}
