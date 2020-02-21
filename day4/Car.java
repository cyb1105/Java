package com.example.day4;

public class Car extends CommonCar {
    private int doorCount;

    public Car(String carName, int doorCount) {
        this.carName = carName;
        this.doorCount = doorCount;
    }

    @Override
    public void displayInfo() {
        System.out.printf("%s, %s(도어수:%s)\n", brandName, carName, doorCount);
    }
}
