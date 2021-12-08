package com.cherepakha.thirdHomeWork;

import java.util.Random;

public class SecondTask {
    public static void main(String[] args) {
        /*
        2) Задан массив случаных чисел типа int в котором есть положительные и отрицательные числа.
        Написать метод который вернет массив квадратов этих чисел, отсортированных по возрастанию.
         */

        int[] array = new int[41];
        System.out.println("Заполним массив рандомными числами, и выведим на экрен для проверки: ");
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) - 20;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int[] anArrayOfSquares = getArray(array);
        System.out.println("Массив квадратов чисел после сортировки по возрастанию: ");
        for (int i = 0; i < anArrayOfSquares.length; i++) {
            System.out.print(anArrayOfSquares[i] + " ");
        }

    }

    public static int[] getArray(int[] array) {
        System.out.println("Массив квадратов чисел: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = (array.length - 1); i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
}
