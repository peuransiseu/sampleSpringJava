package com.CSA.sampleFullStack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;


@SpringBootApplication
@CrossOrigin("*")
public class SampleFullStackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleFullStackApplication.class, args);
	}

}
