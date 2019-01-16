package com.es.bootES;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
 
@SpringBootApplication
@EnableSwagger2 //开启Swagger
public class SpringBootSolrElasticsearchApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(SpringBootSolrElasticsearchApplication.class, args);
    }
}
