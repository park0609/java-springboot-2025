package com.psc.spring_01;

public class Cat implements Animal {
    private String name;
    private int age;
     
    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public void cry() {
        // TODO Auto-generated method stub
        System.out.println(this.age + "살 " + this.name + "이(가) 웁니다. 야옹");
    }

}
