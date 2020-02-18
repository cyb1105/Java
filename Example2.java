package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Example2 {
    public static void main(String[] args){
            long startTime = System.currentTimeMillis();
            String str = "A";
            for(int i=0; i<100_000; i++){
                str += "A";
            }
            long endTime = System.currentTimeMillis();
        System.out.print("Elapsed time:"+(endTime-startTime));


        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("A");
        for(int i=0; i<100_000; i++){
            str += "A";
        }
        endTime = System.currentTimeMillis();
        System.out.println("\n(StringBuilder)Elapsed time:"+(endTime-startTime));

        }
    }

