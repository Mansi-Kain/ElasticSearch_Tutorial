package com.example.elasticSearchTutorial.repo;

import com.example.elasticSearchTutorial.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepo extends ElasticsearchRepository<Product,Integer>{
}
