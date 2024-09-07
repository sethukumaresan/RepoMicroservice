package com.product.productservice.controller;

import com.product.productservice.dto.ProductDTO;
import com.product.productservice.entity.Product;
import com.product.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/api/product/")
public class ProductviewController {


    @Autowired
    ProductService productService;


    @PostMapping("createApi")
    ResponseEntity<?> createProduct(@RequestBody ProductDTO productDetails){
        Product product =  new Product();
        product.setName(productDetails.getName());
        product.setPrice(productDetails.getPrice());
        product.setQuantity(productDetails.getQuantity());
        productService.createProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }


    @GetMapping("getProductList")
    List<Product> getProductList() {
        return productService.getAllProducts();
    }

}
