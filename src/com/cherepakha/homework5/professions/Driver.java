package com.cherepakha.homework5.professions;

import com.cherepakha.homework3.Person;

public class Driver extends Person {
    private String surname;
    private String name;
    private String patronymic;
    private int drivingExperience;

    public Driver(String surname, String name, String patronymic) {
        super(surname, name, patronymic);
    }

    public Driver(String surnameNamePatronymic) {
        super(surnameNamePatronymic);
    }

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
