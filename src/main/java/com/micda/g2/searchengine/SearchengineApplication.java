package com.micda.g2.searchengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@EntityScan("com.micda.g2.searchengine.model")
@EnableJpaRepositories("com.micda.g2.searchengine.repository")
/*@ComponentScan("com.micda.g2.searchengine.service.impl")
@ComponentScan("com.micda.g2.searchengine.rest.impl")*/
@ComponentScan(basePackages = { "com.micda.g2.searchengine.*"})
@SpringBootApplication(scanBasePackages = {"com.micda.g2.searchengine.*"})
public class SearchengineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchengineApplication.class, args);
	}

}
