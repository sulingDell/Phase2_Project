package com.simplilearn.userAccounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UserAccountsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserAccountsServiceApplication.class, args);
	}

}
