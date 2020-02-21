package com.example.day4;

public abstract class CommonCar {
    protected String brandName;
    protected String carName;
    protected Engine engine;
     public CommonCar() {
         this.brandName = "현대자동차(Hyundai)";
         this.engine = new Engine();
     }
    public abstract void displayInfo();
}
