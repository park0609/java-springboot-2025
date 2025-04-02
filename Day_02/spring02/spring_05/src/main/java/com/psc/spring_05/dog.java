package com.psc.spring_05;

// Animal 부모클래스를 상속한 Dog클래스
public class dog extends Animal {
        // 부모 매서드 오버라이딩

        void cry() {
            System.out.println(super.name + "이(가) 웁니다. 멍멍");
        }
}
