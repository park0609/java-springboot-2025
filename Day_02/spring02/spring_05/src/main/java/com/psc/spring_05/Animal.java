package com.psc.spring_05;

// 동물 부모클래스
public class Animal {
    String name;
    
    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
    void cry(){
       System.out.println(this.name + "이(가) 웁니다"); 
    }
    
}
