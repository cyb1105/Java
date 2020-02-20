package com.example.day3;

public class Demo3 {
    public static void main(String[] args) {
        Couter c1 =new Couter();

//        c1.count = c1.count + 1;
//        c1.count = c1.count + 1;
//        c1.count = c1.count + 1;
//        System.out.println("C1:" + c1.count);
//        Couter.count = Couter.count +1;
//
//        Couter c2 =new Couter();
//        c2.count = c2.count + 1;
//        c2.count = c2.count + 1;
//        System.out.println("C2:" + c2.count);
//        System.out.println("C1:" + c1.count);

        Couter.addCount();
        Couter.addCount();
        Couter.addCount();

        System.out.println(Couter.getCount());

    }
}
