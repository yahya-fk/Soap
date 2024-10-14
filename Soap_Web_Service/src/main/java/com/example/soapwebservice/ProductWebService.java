package com.example.soapwebservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@WebService(serviceName = "ProductWS")
@Service
@Component
public class ProductWebService {
    @Autowired
    ProductService productService;
    @WebMethod(operationName = "getSellingPrice")
    @WebResult(name = "sellingPrice")
    public Double getSellingPrice(@WebParam(name = "price") Double price) {
        return price * 1.5;
    }

    @WebMethod(operationName = "getProduct")
    @WebResult(name = "product")
    public Product getProduct(@WebParam(name = "id") Integer id) {
        return productService.getProduct(id);
    }

    @WebMethod(operationName = "getProductList")
    @WebResult(name = "products")
    public List<Product> getProductList() {
        return productService.getAllProducts();
    }
    @WebMethod(operationName = "fillTheDB")
    @WebResult(name = "fillDB")
    public void fillDB() {
        List.of(new Product("Produit 1",150),
        new Product("Produit 2",200),
         new Product("Produit 3",250),
        new Product("Produit 4",300)).forEach(
                product -> productService.addProduct(product)
        );
    }
}