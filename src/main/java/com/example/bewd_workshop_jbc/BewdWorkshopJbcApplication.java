package com.example.bewd_workshop_jbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.bewd_workshop_jbc", "config", "controller"})
public class BewdWorkshopJbcApplication {

	public static void main(String[] args) {

		SpringApplication.run(BewdWorkshopJbcApplication.class, args);
	}

}
