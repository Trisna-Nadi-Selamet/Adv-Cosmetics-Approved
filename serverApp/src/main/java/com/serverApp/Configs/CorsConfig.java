package com.serverApp.Configs;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
@Configuration
public class CorsConfig {

	 @Bean
	    public WebMvcConfigurer getCorsConfiguration() {
	        return new WebMvcConfigurer() {
	            @Override
	            public void addCorsMappings (CorsRegistry registry) {
	                registry.addMapping("/api/**")
	                    .allowedOrigins("*")
	                    .allowedMethods("GET", "POST", "PUT", "DELETE")
	                    .allowedHeaders("*");
	            }
	        };
	    }
}
