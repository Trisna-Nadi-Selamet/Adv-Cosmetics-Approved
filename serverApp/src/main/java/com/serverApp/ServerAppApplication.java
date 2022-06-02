package com.serverApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;
@SpringBootApplication
public class ServerAppApplication {

	@PostConstruct
	  public void init(){
	    TimeZone.setDefault(TimeZone.getTimeZone("Asia/Jakarta")); //use jakarta timezone
	  }
	public static void main(String[] args) {
		SpringApplication.run(ServerAppApplication.class, args);
	}

}
