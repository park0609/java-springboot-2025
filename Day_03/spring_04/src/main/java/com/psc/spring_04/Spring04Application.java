package com.psc.spring_04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring04Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring04Application.class, args);

		// 문자열, 시간타입 핸들링
		String greeting = "Hello";
		System.out.println(greeting);
		String hi = new String("Hello");
		System.out.println(hi);

		System.out.println(greeting == hi); // 둘이 같은 주소를 쓰는 변수인지 질문
		System.out.println(greeting.equals(hi)); // 둘이 가지고 있는 데이터가 같은지

		// 문자열 매서드 사용
		String carstr = "avante, ionic, x3";
		String cars[] = carstr.split(",");
		for (String car : cars) {
			System.out.println(car.trim());
		}
		for (String car : cars) {
			System.out.println(car.toUpperCase());
		}

		String caresult1 = carstr.replace(", ","/");
		System.out.println(caresult1);
		String caresult2 = carstr.replace(',','/');
		System.out.println(caresult2);

		char[] charLst = greeting.toCharArray();
		for (char oneChar : charLst) {
			System.out.println(oneChar);
		}

		System.out.println(caresult1.indexOf("io"));
		System.out.println(caresult1.lastIndexOf("io"));
		System.out.println(caresult1.length());
	}

}
