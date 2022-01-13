package com.cherepakha.homework11.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook extends Recording {
    private final List<Recording> book = new ArrayList<Recording>();
    public List<Recording> getBook() {
        return book;
    }

    public Phonebook() {
    }


    public void add(Recording user) {
        book.add(user);
    }

    public Recording find(String name) {
        Recording user = new Recording();
        for (int i = 0; i < book.size(); i++) {
            if (name.equals(book.get(i).getName())) {
                user = book.get(i);
                break;
            } else {
                user = null;
            }
        }
        return user;
    }

    public List<Recording> findAll(String name) {
        List<Recording> users = new ArrayList<>();
        for (int i = 0; i < book.size(); i++) {
            if (name.equals(book.get(i).getName())) {
                users.add(book.get(i));
            }
        }
        if (users.size() != 0) {
            return users;
        } else {
            return null;
        }

    }
}
