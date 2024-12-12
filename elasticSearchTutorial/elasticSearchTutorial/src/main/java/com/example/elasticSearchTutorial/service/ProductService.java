package com.example.elasticSearchTutorial.service;

import com.example.elasticSearchTutorial.entity.Product;
import com.example.elasticSearchTutorial.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public Iterable<Product> getProducts(){
        return productRepo.findAll();
    }

    public Product insertProduct(Product product){
        return productRepo.save(product);
    }

    public Product updateProduct(Product product,int id){
        Product product1=productRepo.findById(id).get();
        product1.setPrice(product.getPrice());
        return product1;
    }

    public void deleteProducts(int id){
       productRepo.deleteById(id);
    }
}
