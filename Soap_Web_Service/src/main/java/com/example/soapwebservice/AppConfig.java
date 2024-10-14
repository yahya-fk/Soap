package com.example.soapwebservice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "com.example.soapwebservice")
@EnableJpaRepositories(basePackages = "com.example.soapwebservice")
@EnableTransactionManagement
public class AppConfig {
}
