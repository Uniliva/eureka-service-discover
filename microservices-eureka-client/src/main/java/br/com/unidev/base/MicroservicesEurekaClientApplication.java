package br.com.unidev.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroservicesEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesEurekaClientApplication.class, args);
	}

}

