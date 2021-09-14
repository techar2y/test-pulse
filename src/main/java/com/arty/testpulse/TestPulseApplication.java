package com.arty.testpulse;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.arty.testpulse.mappers")
@SpringBootApplication
public class TestPulseApplication
{

    public static void main (String[] args)
    {
        SpringApplication.run(TestPulseApplication.class, args);
    }

}
