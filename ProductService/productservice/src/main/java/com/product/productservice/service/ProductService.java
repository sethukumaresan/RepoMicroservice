package com.product.productservice.service;

import com.product.productservice.entity.Product;
import com.product.productservice.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService  {


    @Autowired
    ProductRepo productRepo;


    public Product createProduct(Product product){
        return productRepo.save(product);
    }

    public Optional<Product> fetchByid(Long productID){
        return productRepo.findById(productID);
    }

    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }



}
