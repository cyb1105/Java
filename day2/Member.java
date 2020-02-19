package com.example.day2;

public class Member {
    String name;
    int age;

    //오버로딩 : 같은클래서에서 메소드이름은 같고, 파라미터의 타입이나 개수가 다름
    Member(String name) {
        this.name = name;
    }

    Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayTnfo() {
        System.out.println((name + ":" + age));
    }

}

//    //nested class
//    class VipMember{
//
//    }
//    //fields
//    int age =10;
//    String name = "홍길동";
//    //methods
//    void 메소드이름1(){
//
//    }
//    int 메소드이름2(){
//        return 1;
//    }
//    //constructor method


