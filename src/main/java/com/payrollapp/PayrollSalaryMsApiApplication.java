package com.payrollapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class PayrollSalaryMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayrollSalaryMsApiApplication.class, args);
	}

}
