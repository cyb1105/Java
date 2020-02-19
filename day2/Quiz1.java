package com.example.day2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Quiz1 {
    public static void main(String[] args) {
        String[] names = {"aaa","bbb","ccc","ddd","fff"};
        int[] kor = {100,90,80,70,60};
        int[] eng = {100,70,80,90,60};
        int[] mat = {60,90,80,70,100};
        int[] sum = new int[5];
        int[] avg = new int[5];

        for(int i=0; i < names.length; i++){
            sum[i] =  kor[i]+eng[i]+mat[i];
            avg[i] = sum[i]/3;
        }

        Arrays.sort(sum);
        for(int a : sum){
            System.out.println(a);
        }
    }

}
