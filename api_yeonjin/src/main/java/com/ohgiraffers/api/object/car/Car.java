package com.ohgiraffers.api.object.car;

import java.util.Objects;

public class Car {

    private String carName;
    private String carColor;
    private int engineCC;


    public Car(String carName, String carColor, int engineCC) {
        super();
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
    public String toString() {
        return carName + carColor + engineCC;
    }

    //차이름과 차색깔이 같다면 같은 객체로 처리
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null) return false;

        if (getClass() != obj.getClass())
            return false;

        //car객체이므로 각 필드별 비교시작
        Car other = (Car) obj;

        //mycar = carName
        if (this.carName == null) {
            if (other.carName != null)
                return false;
        } else if (!carName.equals(other.carName))
            return false;

        //carcolor필드
        if (carColor == null) {
            if (other.carColor != null)
                return false;
        } else if (!carColor.equals(other.carColor))
    }
            return false;


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((carColor == null) ? 0 : carColor.hashCode());
        result = prime * result + ((carName == null) ? 0 : carName.hashCode());
        return result;
    }
}
