package org.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("org.example.Mapper")
public class ShoppingApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ShoppingApp.class,args);
    }
}
