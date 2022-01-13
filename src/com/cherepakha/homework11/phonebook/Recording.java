package com.cherepakha.homework11.phonebook;

public class Recording {
    private String name;
    private long telephoneNumber;

    public Recording() {
    }

    public Recording(String name, long telephoneNumber) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Recording{" +
                "name='" + name + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                '}';
    }
}
