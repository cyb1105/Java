package com.example;


import java.sql.SQLOutput;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner s = new Scanner(System.in);

        System.out.print("국어점수=");
        int kor = s.nextInt();
        System.out.print("영어점수=");
        int eng =s.nextInt();
        System.out.print("수학점수=");
        int mat = s.nextInt();

        int total = kor+eng+mat;
        float avg = total/3.0f;
        String result1 = String.format("총점=%s, 평균=%s", total,avg);
        String result2 = String.format("총점=%s, 평균=%.2f", total,avg);

        System.out.println(result1);
        System.out.println(result2);


    }
}
