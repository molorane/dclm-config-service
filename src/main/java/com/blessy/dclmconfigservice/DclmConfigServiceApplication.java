package com.blessy.dclmconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DclmConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DclmConfigServiceApplication.class, args);
	}

}
