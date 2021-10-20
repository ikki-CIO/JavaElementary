package com.cherepakha.homework5.vehicles;

import com.cherepakha.homework5.details.Engine;
import com.cherepakha.homework5.professions.Driver;

public class Car {
    private String carModel;
    private String carClass;
    private int weight;
    private Driver driver;
    private Engine engine;

    public void start(){
        System.out.println("Поехали!");
    }
    public void stop(){
        System.out.println("Останавливаемся!");
    }
    public void turnRight(){
        System.out.println("Поворот направо!");
    }
    public void turnLeft(){
        System.out.println("Поворот налево!");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
