package com.yannis.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yannis.mybatisplus.mapper")
public class SpringMybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisplusApplication.class, args);
    }

}
