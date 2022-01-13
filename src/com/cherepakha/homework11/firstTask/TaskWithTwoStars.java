package com.cherepakha.homework11.firstTask;

import java.util.ArrayList;
import java.util.List;

public class TaskWithTwoStars {
    public static void main(String[] args) {

        /*
        4. ** Создать метод calcOccurance, принимающий на вход строковый список в качестве параметра.
        Список заполнен произвольными словами 10-20 штук, которые могут повторяться в неограниченном количестве.
        Вычислить сколько раз встречается каждое слово. Результат вывести в консоль.
         */
        List<String> list = new ArrayList<>();
        list.add("яблоко");
        list.add("груша");
        list.add("персик");
        list.add("слива");
        list.add("яблоко");
        list.add("яблоко");
        list.add("груша");
        list.add("вишня");
        list.add("картошка");
        list.add("лук");
        list.add("клубника");
        list.add("малина");
        calcOccurance(list);

    }


    public static void calcOccurance(List<String> list) {
        //В случаи если нужно продублировать и те слова что повторяються
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            System.out.println(list.get(i) + ":" + count);
            count = 0;
        }

        System.out.println();


        //В случаи, если повторяющее слова не нужно дублировать на экране.
        int secondCount = 1;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                    secondCount++;
                }
            }
            System.out.println(list.get(i) + ":" + secondCount);
            secondCount = 1;
        }
    }
}
