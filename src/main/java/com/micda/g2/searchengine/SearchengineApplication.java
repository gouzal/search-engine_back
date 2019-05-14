package com.micda.g2.searchengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.micda.g2.searchengine.service.IOrganisationService;
import com.micda.g2.searchengine.service.imp.OrganisationServiceImp;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
public class SearchengineApplication {

	@Bean
	public IOrganisationService iOrganisationService() {
		return new OrganisationServiceImp();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SearchengineApplication.class, args);
	}

}
