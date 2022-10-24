package com.cherepakha;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class FirstHomeWork {

    public static void main(String[] args) throws IOException {

        /*
           Задание №2: Вывести ряд чисел от 1 до 100 через пробел, с изменениями:
             - если число кратно 3 то вместо него вывести Hello
             - если число кратно 5 то вместо него вывести World
             - если число кратно и 3 и 5 то вместо него вывести HelloWorld
        */

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.print("Hello ");
            } else if (i % 3 != 0 && i % 5 == 0) {
                System.out.print("World ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("HelloWorld ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        /*
          Задание №3: Заполнить массив из 10 элементов случайными целыми числами от 10(включительно) до 20(включительно).
          Вывести среднее арифметическое.
         */

        int[] arrayOfIntegers = new int[10];
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            arrayOfIntegers[i] = (int) (10 + (Math.random() * (21 - 10)));
        }


        int sum = 0;
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            sum += arrayOfIntegers[i];
        }

        double arithmeticMean = sum / 10;
        System.out.println(arithmeticMean);

        System.out.println();


        /*
          Задание №4: Написать метод который вернет String в которой будут в одну строку числа от 1 до 30.
          Каждое число при этом взять в круглые скобки ()
         */

        String stringOfNumbers = getString();
        System.out.println(stringOfNumbers);
        System.out.println();

        /*
           Задание №5: Написать метод который убирает лишние пробелы в строке и возвращает строку.
           Убрать начальные, конечные и между словами должно быть не больше 1 пробела.
         */

        String stringWithSpaces = " Убрать начальные,   конечные  и   между словами должно   быть не больше 1 пробела. ";
        System.out.println(getStringWithoutSpaces(stringWithSpaces));
        System.out.println();


    }


    //    Метод к 4-тому заданию. Метод, который вернет String в которой будут в одну строку числа от 1 до 30.
    public static String getString() {
        String stringOfNumbers = null;
        String test = null;
        for (int i = 1; i < 31; i++) {
            stringOfNumbers = stringOfNumbers + "(" + (test = Integer.toString(i)) + ")";
        }
        stringOfNumbers = deleteCharacters(stringOfNumbers, 0, 4);

        return stringOfNumbers;
    }

    //    Метод к 4-тому заданию. Медот, которые удаляет не нужные элементы строки.
    public static String deleteCharacters(String str, int from, int to) {
        return str.substring(0, from) + str.substring(to);
    }

    //    Метод к 5-тому заданию. Метод, который убирает лишние пробелы в строке и возвращает строку.
    public static String getStringWithoutSpaces(String stringWithSpaces) {
        return stringWithSpaces.trim().replaceAll("\\s{2,}", " ");
    }

}
