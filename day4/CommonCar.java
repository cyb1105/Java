package com.example.day4;

public abstract class CommonCar {
    protected String brandName;
    protected String carName;
    protected Engine engine;
     public CommonCar() {
         this.brandName = "기아자동차";
         this.engine = new Engine();
     }
    public abstract void displayInfo();
}
