package com.example.day4;

import java.util.Date;

public class VvipMember extends Member implements IMemberFunc {
    public VvipMember(String id) {
        this.id = id;
        this.grade = "V1";
        this.joinDate = new Date();
    }

    @Override
    public void setPoint(int point) {
        this.point = point * 0.7;
    }

    @Override
    public boolean isAuthorized() {
        return true;
    }

    @Override
    public void display() {
        System.out.println("#############################");
        System.out.printf("%s, %s, %s ,%s\n", super.id, super.grade, this.point,super.joinDate);
        System.out.println("#############################");
    }
}
