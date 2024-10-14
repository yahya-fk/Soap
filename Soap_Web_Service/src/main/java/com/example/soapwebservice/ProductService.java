package com.example.soapwebservice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    Product getProduct(int id);
    List<Product> getAllProducts();
    void addProduct(Product product);
    void updateProduct(Integer id,Product product);
    void deleteProduct(int id);
}
