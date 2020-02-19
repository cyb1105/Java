package com.example.day2;

public class Demo4 {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0] = "Java1.8";
        strArray[1] = "Java1.12";
        strArray[2] = new String("Java1.1");

        String[] newArray = new String[10];
        System.arraycopy(strArray,0,newArray,0,strArray.length); // 배열 복사

        for (String str : newArray){
            System.out.println(str);
        }
     }
}
