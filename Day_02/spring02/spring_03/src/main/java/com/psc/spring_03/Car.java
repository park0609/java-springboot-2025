package com.psc.spring_03;

public class Car {
    public String name;
	public int year;
	String company; // 클래스 외부에서 사용불가

	public void printCarNmae() {
		System.out.println("차이름은" + name);
	}

	// 매서드 오버로딩
	public void printCarName(String point) {
		System.out.println("차이름은"+name);
	}

	//가변인가
	public void printCarName(String...name) {
		for (String n : name) {
			System.out.println(n);
		}
	}

	int calcYear(int currYear) {
		return currYear - year;
	}
    
}
