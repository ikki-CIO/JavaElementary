package com.cherepakha.homework5.professions;


import com.cherepakha.homework5.Person;

public class Driver extends Person {
    private String surname;
    private String name;
    private String patronymic;
    private int drivingExperience;


    @Override
    public String toString() {
        return "Driver{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", drivingExperience=" + drivingExperience +
                '}';
    }
}
