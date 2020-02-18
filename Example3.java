package com.example;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("숫자를 입력하세요:");
        int a = s.nextInt();


        for(int i=1; i <= a; i ++){
            if(a % i == 0){
                System.out.println(i);
            }
        }
    }
}
