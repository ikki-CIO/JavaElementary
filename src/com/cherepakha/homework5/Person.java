package com.cherepakha.homework5;

public class Person {
    protected String fullName;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
