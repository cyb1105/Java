package com.example.day2;

public class Student {
    String name;
    int kor;
    int eng;
    int mat;
    int sum;
    float avg;

    Student(String name,int kor,int eng,int mat){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;

    }
    void calculate(){
        this.sum = this.kor +this.eng + this.mat;
        this.avg = this.sum/3.0f;
        //sum = kor+eng+mat
    }
    void  display(){
        System.out.println(String.format("%s의 총점:%S,평균:%.2f",this.name,this.sum,this.avg));
    }
}
