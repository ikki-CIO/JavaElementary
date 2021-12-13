package com.cherepakha.homework7;

public class Human extends Participant {
    public Human(String name) {
        super(name);
    }

    public Human(String name, double runningRestriction, double jumpingLimit) {
        super(name, runningRestriction, jumpingLimit);
    }

    @Override
    public void jump() {
        System.out.println("Человек " + getName() + " перепрыгнул");
    }

    @Override
    public void run() {
        System.out.println("Человек " + getName() + " пробежал");
    }
}
