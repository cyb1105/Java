package com.example.day2;

public class SungjukApp {
    public static void main(String[] args) {
        Student stu1 = new Student("AAA", 100,98,60);
        Student stu2 = new Student("BBB", 90,98,60);
        Student stu3 = new Student("CCC", 100,50,60);

        stu1.calculate(); stu1.display();
        stu2.calculate(); stu2.display();
        stu3.calculate(); stu3.display();

    }
}
