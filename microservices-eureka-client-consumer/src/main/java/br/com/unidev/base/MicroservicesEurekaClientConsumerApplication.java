package br.com.unidev.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroservicesEurekaClientConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesEurekaClientConsumerApplication.class, args);
	}

}

