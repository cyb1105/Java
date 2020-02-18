package com.example;

public class Example5 {
    public static void main(String[] args){
        int cnt = 0;
        int a=0;
        int b=1;
        int c=a+b;
            for(int i=0; i<1000 ;i++){
             c=a+b;
             a=b;
             b=c;
            System.out.println(c);
            if( c >= 1000){
                break;
            }
            cnt++;

        }
        System.out.println("1000번 이상 숫자는 : " + cnt);

    }
}
