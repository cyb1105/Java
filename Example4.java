package com.example;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args){
        int lineNum =1;
        int cnt =0; // 각라인에 출력되는 숫자의 개수
        boolean isNotprime;

        for(int num = 2 ; num <=107; num++){
            isNotprime = false;
            for(int i = 2 ; i < num ; i++){
                if(num % i ==0){
                    isNotprime =true;
                    break;
                }
            }
            if(!isNotprime){
                System.out.print(num + "\t");
                cnt++;
            }
            if(lineNum == cnt){
                System.out.println();
                lineNum++;
                cnt = 0;
            }
        }
    }
}
