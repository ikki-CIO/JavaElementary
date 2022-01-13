package com.cherepakha.homework11.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();
        phonebook.add(new Recording("Ivan", 4565675));
        phonebook.add(new Recording("Anna", 6783566));
        phonebook.add(new Recording("Ivan", 4357345));
        phonebook.add(new Recording("Maks", 7895643));

        System.out.println(phonebook.find("Maks"));
        System.out.println(phonebook.find("Inga"));
        System.out.println(phonebook.findAll("Ivan"));
        System.out.println(phonebook.findAll("Inga"));

    }
}
