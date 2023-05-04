package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;

@SpringBootApplication(scanBasePackages={"com.example.demo.dao.Coupons"},exclude = {DataSourceAutoConfiguration.class,R2dbcAutoConfiguration.class })
public class MysqldemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqldemoApplication.class, args);
	}

}
