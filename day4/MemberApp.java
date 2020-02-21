package com.example.day4;

public class MemberApp {
    public static void main(String[] args) {
        // Abstract class는  instance 생성 못함
        GeneralMember mem1 = new GeneralMember("user1", "A");
        mem1.setPoint(100);mem1.display();

        VipMember mem2 = new VipMember("vip1", "S1");
        mem2.setPoint(100);mem2.display();

        VvipMember mem3 = new VvipMember("vvip1");
        mem3.setPoint(100);mem3.display();
    }
}
