package com.example.day3;

public class Calculator {

    int add(int x, int y){
        x=x*2;
        return x+y;
    }
    double add(double x, double y){
        return x+y;
    }

    int subtract(int x, int y){
        return x-y;
    }

    int multiply(int x, int y){
        return x*y;
    }

    int divide(int x, int y){
        return x/y;
    }

    int add(int...values){
        int result=0;
        for (int value : values)
            result += value;
        return result;
    }
}

