package com.cherepakha.homework7;

public class Participant {
    private String name;
    private double runningRestriction;
    private double jumpingLimit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRunningRestriction() {
        return runningRestriction;
    }

    public void setRunningRestriction(double runningRestriction) {
        this.runningRestriction = runningRestriction;
    }

    public double getJumpingLimit() {
        return jumpingLimit;
    }

    public void setJumpingLimit(double jumpingLimit) {
        this.jumpingLimit = jumpingLimit;
    }


    public Participant(String name) {
        this.name = name;
    }

    public Participant(String name, double runningRestriction, double jumpingLimit) {
        this.name = name;
        this.runningRestriction = runningRestriction;
        this.jumpingLimit = jumpingLimit;
    }

    public void jump() {
    }

    public void run() {
    }


}
