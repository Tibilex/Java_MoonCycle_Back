package com.example.MoonCycleApi;

import Controllers.MoonCycleController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoonCycleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoonCycleController.class, args);
	}

}
