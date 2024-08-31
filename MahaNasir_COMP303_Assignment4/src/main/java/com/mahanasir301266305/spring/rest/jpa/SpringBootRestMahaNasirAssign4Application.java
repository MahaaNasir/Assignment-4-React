/* Maha Nasir - 301266305 | Lab 4 COMP303 | Due Date: 14 April 2024 */

package com.mahanasir301266305.spring.rest.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.week11examplesprintreactcrud.DatabaseLoader;
import com.netflix.discovery.AbstractDiscoveryClientOptionalArgs;
import com.netflix.discovery.Jersey3DiscoveryClientOptionalArgs;
import com.netflix.discovery.shared.transport.jersey.TransportClientFactories;
import com.netflix.discovery.shared.transport.jersey3.Jersey3TransportClientFactories;



@EnableDiscoveryClient
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class SpringBootRestMahaNasirAssign4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestMahaNasirAssign4Application.class, args);
		System.out.println("Lab 4 by Maha Nasir is ready....");
	}
	
	
	@Bean
    @ConditionalOnMissingBean(AbstractDiscoveryClientOptionalArgs.class)
    public Jersey3DiscoveryClientOptionalArgs jersey3DiscoveryClientOptionalArgs() {
        return new Jersey3DiscoveryClientOptionalArgs();
    }

    @Bean
    @ConditionalOnMissingBean(TransportClientFactories.class)
    public Jersey3TransportClientFactories jersey3TransportClientFactories() {
        return Jersey3TransportClientFactories.getInstance();
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
