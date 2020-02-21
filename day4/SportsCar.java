package com.example.day4;

public class SportsCar extends CommonCar  {
    private int doorCount;
    private int maxSpeed;

    public SportsCar(String carName, int doorCount) {
        this.carName = carName;
        this.doorCount = doorCount;
        this.maxSpeed = 300;
    }

    public void displayInfo() {
        System.out.printf("%s, %s(도어수:%s, 최고속도:%s km/h)\n",
                brandName, carName, doorCount, maxSpeed);
    }
}
