package com.example.day4;

//Abstract clas => interface(추상메소드,약속)
//  정상 메소드 -> public void add(){...}
//   추상 메소드 -> public void add();
public interface IMemberFunc {
    public abstract void setPoint(int point);

    public abstract boolean isAuthorized();

    public abstract void display();
}
