package com.example.day3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        String[] names = {"A","B","C","Z","E"};
        System.out.println("----b");
        for (String name : names){
            System.out.print(name+"\t");
        }

        Arrays.sort(names);
        System.out.println("----a");
        for (String name : names){
            System.out.print(name+"\t");
        }

    }
}
