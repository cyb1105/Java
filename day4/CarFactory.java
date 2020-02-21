package com.example.day4;

public class CarFactory {
    public static void main(String[] args) {
        Car car1 = new Car("쏘나타 YF", 4);
        car1.displayInfo();
        SportsCar sports1 = new SportsCar("SP One", 2);
        sports1.displayInfo();
        Bus bus = new Bus("마을버스", 15);
        bus.displayInfo();
    }
}
