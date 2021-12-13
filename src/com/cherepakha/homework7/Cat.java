package com.cherepakha.homework7;

public class Cat extends Participant {

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, double runningRestriction, double jumpingLimit) {
        super(name, runningRestriction, jumpingLimit);
    }

    @Override
    public void jump() {
        System.out.println("Кот " + getName() + " перепрыгнул");
    }

    @Override
    public void run() {
        System.out.println("Кот " + getName() + " пробежал");
    }
}
