/**
 * 
 */
package net.openwebinars.msanimesow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @author OpenWebinars
 * @version 1.0 04/03/2021
 */
@EnableFeignClients
@EntityScan({"net.openwebinars.mscommonsentity.entity"})
@EnableEurekaClient
@SpringBootApplication
public class MsAnimesOw {
	
	public static void main(String[] args) {
		SpringApplication.run(MsAnimesOw.class, args);
	}
}
