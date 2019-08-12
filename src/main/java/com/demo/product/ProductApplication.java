/* 
 * Created by 2019年1月31日
 */
package com.demo.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * The application for the product service.
 * @author fangang
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
@Configuration
@ComponentScan(basePackages="com.demo")
@ImportResource(locations={"classpath:applicationContext.xml"})
public class ProductApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}
}
