package com.simplilearn.Medicineproducts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MedicineProductsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicineProductsServiceApplication.class, args);
	}

}
