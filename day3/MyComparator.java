package com.example.day3;

import com.example.day2.Student;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getSum() > s2.getSum()){
            return -1;
        }else  if(s1.getSum() < s2.getSum()){
            return  1;
        }else {
            return s1.getName().compareTo(s2.getName());
        }

    }
}
