package com.cherepakha.homework7;

public class Wall extends Let {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Wall() {
    }

    public Wall(String name) {
        super(name);
    }

    public Wall(String name, double height) {
        super(name);
        this.height = height;
    }

    @Override
    public void overcome() {
        System.out.println("Стену.");
    }
}
