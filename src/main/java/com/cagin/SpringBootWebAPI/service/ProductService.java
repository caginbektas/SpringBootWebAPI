package com.cagin.SpringBootWebAPI.service;

import com.cagin.SpringBootWebAPI.model.Product;
import com.cagin.SpringBootWebAPI.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Product save(Product product){
        return productRepository.save(product);
    }
    public List<Product> findAll(){
        return productRepository.findAll();
    }
    public Product findOne(long productId){
        return productRepository.getOne(productId);
    }
    public void delete(Product product){
        productRepository.delete(product);
    }
}
