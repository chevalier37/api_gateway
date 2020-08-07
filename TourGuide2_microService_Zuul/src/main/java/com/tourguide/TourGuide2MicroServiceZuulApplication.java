package com.tourguide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class TourGuide2MicroServiceZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(TourGuide2MicroServiceZuulApplication.class, args);
	}

	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
		return builder.routes().route(r -> r.path("/user/**").uri("lb://MICROSERVICE-USER").id("microservice-user"))
				.route(r -> r.path("/rewards/**").uri("lb://MICROSERVICE-REWARD").id("microservice-reward"))
				.route(r -> r.path("/gpsutil/**").uri("lb://MICROSERVICE-GPSUTIL").id("microservice-gpsutil")).build();
	}

}
