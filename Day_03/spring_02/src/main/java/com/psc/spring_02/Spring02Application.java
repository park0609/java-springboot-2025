package com.psc.spring_02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring02Application {

	public void sayNickname(String nickname) throws Exception {
		if (nickname.equals("애슐리")) {
			throw new Exception("이 별명은 안돼요!"); //자신이 예외처리 하지 않고 호출한 main메서드에 예외를 던짐
		}
		System.out.println("당신의 별명은" + nickname);
	}

	public static void main(String[] args) {
		SpringApplication.run(Spring02Application.class, args);

		//예외처리. 숫자를 0으로 나눌 수 없음
		int result = 0;
		try {
			result = 17/0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println(result);

		System.out.println(result);

		// 예외처리. 배열의 인덱스가 길이를 넘어가면안됨
		String[] names = {"Hugo", "Ashley","Jini"};
		try{
			System.out.println(names[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} finally {
			System.out.println("예외 발생 유무와 상관없이 실행");
		}
		
		//예외클래스. 널값은 여러가지 처리를 할 수 없음
		String name = null;
		try {
		String[] names2 = name.split("");
		System.out.println(names2[0]);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage()); // e 보다는 e.getMessagee.getMessage가 좋다 
		}

		// 예외처리. 호출한 매서드에서 던진 예외를 받아서 처리
		Spring02Application app = new Spring02Application();
		try{
			app.sayNickname("애슐리");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("프로그램 종료!"); // 정상적으로 프로그램 종료
		
		
		
	}

}
