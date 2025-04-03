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
		// ppopy.age = -19;  //
		ppopy.setAge(8495);
		System.out.println("뽀삐의 나이는" + ppopy.getAge() + "살");

		cat kitty = new cat();
		kitty.setName("키티");
		kitty.cry();
		// kitty.age = 3;
		ppopy.setAge(-231431123);
		System.out.println("키티의 나이는" + ppopy.getAge() + "살");

		dog choonsam = new dog();
		choonsam.setName("춘삼이");
		choonsam.getName();
		
		
		
	}

}
