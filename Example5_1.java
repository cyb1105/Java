package com.example;

public class Example5_1 {
    public static void main(String[] args){
        int previousnum = 1;
        int nextnum = 1;
        int currentnum =1;

        System.out.println(previousnum);
        System.out.println(nextnum);

        int cnt =0;
        while (currentnum<1000){
            currentnum = previousnum + nextnum;
            System.out.println(currentnum);
            previousnum = nextnum;
            nextnum = currentnum;
            cnt++;
        }
        System.out.println("1000번 이상 숫자는 :"+cnt);

    }
}
