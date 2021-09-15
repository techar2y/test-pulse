package com.arty.testpulse;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan("com.arty.testpulse.mappers")
@SpringBootApplication
@EnableSwagger2
public class TestPulseApplication
{

    public static void main (String[] args)
    {
        SpringApplication.run(TestPulseApplication.class, args);
    }

}
