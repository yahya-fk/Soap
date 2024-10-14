package com.example.soapwebservice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository;


    @Override
    public Product getProduct(int id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void updateProduct(Integer id,Product product) {
        if(productRepository.existsById(id)) {
            productRepository.save(product);
        }else {
            System.out.println("Product not found");
        }
    }

    @Override
    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
