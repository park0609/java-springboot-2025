package com.psc.demp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DempApplication {

	public static void main(String[] args) {
		SpringApplication.run(DempApplication.class, args);
	
		System.out.println("Hello, Spring Boot!");
		
		// 변수연습
		int account = 1000000;
		System.out.println("계좌 금액은"+ account);
		float pi = 3.141592f;
		System.out.println("Pi 는 " +pi);
		char ch_first = 'A';
		System.out.println("문자는 "+ch_first);
		
		// 연산자연습
		int a = 17;
		int b = 24;
		System.out.printf("a + b = %d\n", a + b);
		int diversult = b % a;
		System.out.printf("b %% a = %d\n", diversult);
		System.out.println("a++ = " + ++a); //연산자 우선순위

		// 비트연산 and, or, xor, inverse
		System.out.println("40 & 124 = " + (40 % 124));
		// 40 = 0010 1000
		// 124 = 0111 1100 
		// 0000 0010 << 2 0000 1000

		//논리 연산
		boolean case1 = 40 > 20;
		boolean case2 = 40 < 20;
		boolean case3 = 12 <= 13;
		System.out.println("case1 = "+ case1);
		System.out.println("case1 = "+ case2);
		System.out.println("case1 = "+ case3);
	}

}
