package com.example.day3;

import com.example.day2.Student;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SungjukAppV2 {
    public static void main(String[] args) {
//        Student stu1= new Student("AAA", 100,98,60);
//        stu1.calculate();
//        stu1.display();

        Student[] students = new Student[]{
                new Student("ZZZ", 100,98,33),
                new Student("BBB", 100,98,60),
                new Student("CCC", 80,60,60),
                new Student("DDD", 80,40,60),
                new Student("AAA", 100,98,33)

        };
        //각 학생의 총점과 평균
        for (Student stu : students){
            stu.calculate();
        }
        //각 학생의 데이터 출력
        System.out.println("-----------before");
        for (Student stu : students){
            System.out.println(stu);
        }

//        Arrays.sort(students, new MyComparator());
        Arrays.sort(students);
        System.out.println("-----------after");
        for (Student stu : students){
            System.out.println(stu);
        }


    }


}
