package com.example.soapclient;

import proxy.ProductWS;
import proxy.ProductWebService;

public class ClientWS {
    public static void main(String[] args) {
        ProductWebService proxy = new ProductWS().getProductWebServicePort();
        try{
            System.out.println("Filling the DataBase :");
            if (!proxy.getProductList().isEmpty()) {
                System.out.println("Already Filled ...");

            }else {
                proxy.fillTheDB();
                System.out.println("Filled ;)");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Product : "+proxy.getProduct(1).getName());
        System.out.println("Selling Price :"+proxy.getSellingPrice(150.0));
        proxy.getProductList().forEach(
                e->System.out.println(e.getName())
        );
    }
}
