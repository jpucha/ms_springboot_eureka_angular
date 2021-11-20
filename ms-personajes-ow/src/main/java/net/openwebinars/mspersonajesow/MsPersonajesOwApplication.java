package net.openwebinars.mspersonajesow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 
 * @author 4PF28LA_2004
 *
 */
@EnableFeignClients
@EntityScan({"net.openwebinars.mscommonsentity.entity"})
@EnableEurekaClient
@SpringBootApplication
public class MsPersonajesOwApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsPersonajesOwApplication.class, args);
	}

}
