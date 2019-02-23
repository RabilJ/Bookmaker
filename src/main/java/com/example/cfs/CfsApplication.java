package com.example.cfs;

import com.example.cfs.storage.StorageProperties;
import com.example.cfs.storage.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@Primary
@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class CfsApplication {
    public static void main(String[] args) {
        SpringApplication.run(CfsApplication.class, args);
    }
    @Bean
    CommandLineRunner init(StorageService storageService){
        return (args) ->{
            storageService.deleteAll();
            storageService.init();
        };
    }
}
