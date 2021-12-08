package com.cherepakha.homework7;

public class Robot extends Participant {

    public Robot(String name) {
        super(name);
    }

    public Robot(String name, double runningRestriction, double jumpingLimit) {
        super(name, runningRestriction, jumpingLimit);
    }

    @Override
    public void jump() {
        System.out.println("Робот " + getName() + " перепрыгнул");
    }

    @Override
    public void run() {
        System.out.println("Робот " + getName() + " пробежал");
    }
}
