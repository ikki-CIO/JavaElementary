package com.cherepakha.homework7;

public class RunningTrack extends Let {
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public RunningTrack() {
    }

    public RunningTrack(String name) {
        super(name);
    }

    public RunningTrack(String name, double length) {
        super(name);
        this.length = length;
    }

    @Override
    public void overcome() {
        System.out.println("Беговую дорожку!");
    }
}
