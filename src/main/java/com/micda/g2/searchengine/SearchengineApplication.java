package com.micda.g2.searchengine;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.stream.Stream;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.micda.g2.searchengine.model.Person;
import com.micda.g2.searchengine.model.Role;
import com.micda.g2.searchengine.service.security.AccountService;

@EnableAutoConfiguration
@EntityScan("com.micda.g2.searchengine.model")
@EnableJpaRepositories("com.micda.g2.searchengine.repository")
/*@ComponentScan("com.micda.g2.searchengine.service.impl")
@ComponentScan("com.micda.g2.searchengine.rest.impl")*/
@ComponentScan(basePackages = { "com.micda.g2.searchengine.*"})
@SpringBootApplication(scanBasePackages = {"com.micda.g2.searchengine.*"})
  
public class SearchengineApplication implements CommandLineRunner {

	    @Autowired
	    private AccountService accountService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SearchengineApplication.class, args);
	}

	
	  @Bean
	    public BCryptPasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }


	  

	    @Override
	    public void run(String... args) throws Exception {
	    
	    
	    	
	    	accountService.saveUser( new Person(1,"Hamza","Fergaoui",'M',"Hamza@gmail.com","123"));
	    	
	    	accountService.saveUser( new Person(2,"Laarbi","Laarbi",'M',"Laarbi@gmail.com","123"));
	        accountService.saveRole(new Role(null,"ADMIN"));
	        accountService.saveRole(new Role(null,"USER"));

	        accountService.AddRoleToUser("Hamza@gmail.com","ADMIN");
	        accountService.AddRoleToUser("Hamza@gmail.com","USER");

	       
	    }

	
	
	
}
