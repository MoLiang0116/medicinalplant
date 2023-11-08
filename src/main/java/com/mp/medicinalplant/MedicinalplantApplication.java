package com.mp.medicinalplant;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mp.medicinalplant.mapper")
public class MedicinalplantApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicinalplantApplication.class, args);
    }

}
