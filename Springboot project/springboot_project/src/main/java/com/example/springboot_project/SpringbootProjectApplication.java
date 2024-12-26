package com.example.springboot_project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 这是一个springboot项目
@SpringBootApplication
@MapperScan("com.example.springboot_project.mapper")
public class SpringbootProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootProjectApplication.class, args);
    }
}
