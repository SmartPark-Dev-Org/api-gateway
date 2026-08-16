package dev.smartpark.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * SmartPark API Gateway
 *
 * <p>Reactive Spring Cloud Gateway acting as the single entry point for all
 * client requests. Integrates with Eureka for client-side load balancing via
 * {@code lb://} URIs. Routes are defined in {@code application.yml}.
 *
 * <p>Startup order: Config Server → Eureka Server → API Gateway → Services
 *
 * @author SmartPark Platform Team
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }
}
