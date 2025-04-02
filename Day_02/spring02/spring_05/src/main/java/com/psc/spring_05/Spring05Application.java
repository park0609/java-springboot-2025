package com.psc.spring_05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring05Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring05Application.class, args);

		// 상속
		dog ppopy = new dog();
		ppopy.setName("뽀삐");
		ppopy.cry();

		cat kitty = new cat();
		kitty.setName("키티");
		kitty.cry();
	}

}
