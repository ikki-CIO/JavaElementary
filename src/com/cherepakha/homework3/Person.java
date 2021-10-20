package com.cherepakha.homework3;

public class Person {
    /*
    1) Создать класс Person у котороего есть 3 поля - фамилия, имя, отчество.
    Создать 2 конструктора - одни на все поля, во второй задается строка типа "Иванов Иван Иванович",
    он ее должен распарсить и задать значения полям.
     */

    private String surname;
    private String name;
    private String patronymic;

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public Person(String surnameNamePatronymic) {
        String[] arrayString = surnameNamePatronymic.split(" ", 3);
        this.surname = arrayString[0];
        this.name = arrayString[1];
        this.patronymic = arrayString[2];
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
