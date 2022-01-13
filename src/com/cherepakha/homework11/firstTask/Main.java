package com.cherepakha.homework11.firstTask;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        1. Создать метод countOccurance, принимающий на вход строковый список в качестве параметра и произвольную строку.
        Список заполнен произвольными словами 10-20 штук, которые могут повторяться в неограниченном количестве.
         Посчитать сколько раз встречается переданная строка в качестве второго аргумента.
         */
        System.out.println("Введите проверочное слово:");
        String input = scanner.nextLine();

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

        countOccurance(list, input);


        /*
        4. *** Создать метод findOccurance, принимающий на вход строковый список в качестве параметра.
        Список заполнен произвольными словами 10-20 штук, которые могут повторяться в неограниченном количестве.
        Вычислить сколько раз встречается каждое слово.
        Результат вернуть в виде списка структур описывающих повторение каждого отдельного взятого слова.
         */
        TaskWithThreeStars test = new TaskWithThreeStars();
        ArrayList<TaskWithThreeStars> arrayList = test.findOccurance(list);
        for (TaskWithThreeStars emp: arrayList) {
            System.out.println(emp);
        }


        /*
        2.Создать метод toList, принимающий на вход целочисленный массив произвольной длины.
        Конвертировать массив в список соответствующего типа данных и вернуть из метода.
         */
        int[] arrayForTwoTask = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arrayForTwoTask));
        List<Integer> list1 = toList(arrayForTwoTask);
        System.out.println(list1);

        /*
        3. Создать метод findUnique, принимающий на вход числовой список состоящий из произвольных значений,
         которые могут повторяться в неограниченном количестве.
         Необходимо вернуть новый числовой список содержащий только уникальные числа.
         */

        ArrayList<Integer> list2 = new ArrayList<Integer>(10);

        for (int i = 0; i < 10; i++) {
            int a = (int) (Math.random() * 10 + 1);
            list2.add(a);
        }
        System.out.println(list2);
        System.out.println(findUnique(list2));


    }

    public static List<Integer> findUnique(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
        return list;
    }

    /*
    Изначально идея была сделать через цикл for, перебрать каждый эллемент списка, сравнить через equals()
    или через equalsIgnoreCase(), и если будут встречаться похожие элементы, то какую то локальную переменную увеличивать
    на один (к примеру count++), и вывести её на экран.
    Но потом подумал, что в задании возможно есть какой-то скрытый подвох, начал искать информацию на эту тему,
    и нашёл метод  frequency(). Надеюсь так тоже верно. Единственное что,
    сравнение идёт в случаи написания слова через LowCamelCase.
     */
    public static void countOccurance(List<String> list, String word) {
        System.out.println(Collections.frequency(list, word));
//        int count =0;
//        for (int i=0;i< list.size();i++){
//            if(word.equals(list.get(i))){
//                count++;
//            }
//        }
//        System.out.println(count);
    }

    /*
    Сначала написал свой код через цикл. А потом немного погуглил и нашел ещё вариант через Collectors.
    Тот и тот вроде работает. Надеюсь верно.
     */
    public static List<Integer> toList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        return list;
//        return Arrays.stream(array)
//                .boxed().collect(Collectors.<Integer>toList());
    }
}
