package com.example.soapwebservice;

import jakarta.xml.ws.Endpoint;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootApplication(scanBasePackages = {"com.example.soapwebservice"})
@Getter
public class ServerWS {
    @Autowired
    private ProductWebService productWebService;
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ServerWS.class, args);
        ServerWS server = context.getBean(ServerWS.class);
        String url = "http://localhost:8087/";
        Endpoint.publish(url, server.getProductWebService());

    }
    private void RunTheServerAndFillTheDB() {
        String url = "http://localhost:8087/";
        try {
            Endpoint.publish(url, productWebService);
            System.out.println("Web service deployed at: " + url);
        } catch (Exception e) {
            System.err.println("Failed to publish web service: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
