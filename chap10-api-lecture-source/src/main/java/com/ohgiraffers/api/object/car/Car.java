package com.ohgiraffers.api.object.car;

public class Car {

   private String carName;
   private String carColor;
   private int engineCC;

    public Car(String carName, String carColor, int engineCC) {
        this.carName = carName;
        this.carColor = carColor;
        this.engineCC = engineCC;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }


    @Override
    public int hashCode() {


        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {



        return super.equals(obj);
    }
}
