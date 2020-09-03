package com.yd.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan({ "com.yd.test.dao", "com.yd.test.components.mp.dao" })
public class SpringBootScheduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootScheduleApplication.class, args);
	}

}
