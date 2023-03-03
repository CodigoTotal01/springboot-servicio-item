package com.formacionbdi.springboot.app.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@RibbonClient(name="servicio-productos")
@EnableFeignClients // conectarce  para las api y consultas
@EnableEurekaClient
@SpringBootApplication
public class SpringbootServicioItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioItemApplication.class, args);
	}

}
