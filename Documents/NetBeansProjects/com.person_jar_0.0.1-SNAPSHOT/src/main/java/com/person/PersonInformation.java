/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person;

/**
 *
 * @author Muzamiru.Mbaziira
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PersonInformation 
{
public static void main(String[] args) 
{
SpringApplication.run(PersonInformation.class, args);
}

 @Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/api/add-new").allowedOrigins("http://localhost:4200");
				registry.addMapping("/api/all").allowedOrigins("http://localhost:4200");
			}
		};
  }
}
