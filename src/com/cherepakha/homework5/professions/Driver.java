package com.cherepakha.homework5.professions;

import com.cherepakha.homework5.Person;

public class Driver extends Person {
    private int drivingExperience;


    @Override
    public String toString() {
        return "Driver{" +
                "drivingExperience=" + drivingExperience +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
