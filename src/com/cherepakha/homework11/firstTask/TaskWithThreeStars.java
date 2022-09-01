package com.cherepakha.homework11.firstTask;

import java.util.ArrayList;
import java.util.List;

public class TaskWithThreeStars {
    private String name;
    private int occurrence;

    public TaskWithThreeStars() {
    }

    public TaskWithThreeStars(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOccurrence() {
        return occurrence;
    }

    public void setOccurrence(int occurrence) {
        this.occurrence = occurrence;
    }

    //Честно говоря долго думал над правильной реализацией этого метода, надеюсь всё верно сделал.
    public ArrayList<TaskWithThreeStars> findOccurance(List<String> list) {
        ArrayList<TaskWithThreeStars> empRecords = new ArrayList<TaskWithThreeStars>();
        int count = 1;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                    count++;
                }
            }
            empRecords.add(new TaskWithThreeStars(list.get(i), count));
            count = 1;
        }
        return empRecords;
    }

    @Override
    public String toString() {
        return "{" +
                "name: " + "\"" + name + "\"" +
                ", occurrence: " + occurrence +
                '}' + ",";
    }
}
