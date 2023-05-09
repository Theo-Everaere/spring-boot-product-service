package com.tutoprogrammingtechie.productservice.repository;

import com.tutoprogrammingtechie.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
