package com.cherepakha;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FirstHomeWorkLastTask {
    /*6*) Задан 2-мерный массив char и слово.
       Написать метод который определит есть ли по вертикали или горизонтали это слово.
       Например, в данном случае для слова test метод должен вернуть true:
       a z r g z
       a t e s t
       q v u t r
       6.1*) Массив загрузить из текстового файла*/

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("D:\\Hillel\\JavaElementary\\src\\com\\cherepakha\\test.txt"));
        ArrayList<String[]> nums = new ArrayList<>();

        while (scan.hasNext()) {
            nums.add(scan.nextLine().split(" "));
        }

        String[][] arr = arrayTwoDimensional(nums);

        System.out.println("Проверка двумерного массива");
        outputOnDisplay(arr);

        char[][] arrayChar = arrayToChar(arr);

        System.out.println("Ввести проверочное слово:");

        Scanner console = new Scanner(System.in);
        String word = console.nextLine();

        char[] arrayWord = word.toCharArray();

        System.out.println("Горизонталь");
        horizontalCheck(word, arrayWord, arrayChar);

        System.out.println("Вертикаль");
        verticalCheck(word, arrayWord, arrayChar);

        System.out.println("Горизонталь в обратную сторону");
        horizontalInReverse(word, arrayWord, arrayChar);

        System.out.println("Вертикаль в обратную сторону");
        verticalInReverse(word, arrayWord, arrayChar);

        scan.close();
    }

    private static void verticalInReverse(String word, char[] arrayWord, char[][] arrayChar) {
        int countOfTrue = 0;
        for (int i = 0; i < arrayChar[0].length; i++) {
            int startIndex = -1;
            int lastIndex = -1;
            for (int j = arrayChar.length - 1; j >= 0; j--) {
                if (arrayWord[0] == arrayChar[j][i]) {
                    startIndex = j;
                    break;
                }
            }
            if (startIndex < arrayChar[0].length) {
                for (int k = startIndex - 1; k >= 0; k--) {
                    if (arrayWord[arrayWord.length - 1] == arrayChar[k][i]) {
                        lastIndex = k;
                    }
                }
            }
            if (startIndex != -1 && lastIndex != -1) {
                String baseString = "";
                for (int k = lastIndex; k <= startIndex; k++) {
                    baseString += arrayChar[k][i];
                }
                StringBuilder wordGet = new StringBuilder(baseString);
                String ourFinalWord = wordGet.reverse().toString();

                if (word.contains(ourFinalWord)) {
                    System.out.println(true);
                    countOfTrue++;
                }
            }
        }
        if (countOfTrue == 0) {
            System.out.println(false);
        }
    }

    private static void horizontalInReverse(String word, char[] arrayWord, char[][] arrayChar) {
        int countOfTrue = 0;
        for (int i = 0; i < arrayChar.length; i++) {
            int startIndex = -1;
            int lastIndex = -1;
            for (int j = arrayChar[i].length - 1; j >= 0; j--) {
                if (arrayWord[0] == arrayChar[i][j]) {
                    startIndex = j;
                    break;
                }
            }
            if (startIndex < arrayChar[i].length) {
                for (int k = startIndex - 1; k >= 0; k--) {
                    if (arrayWord[arrayWord.length - 1] == arrayChar[i][k]) {
                        lastIndex = k;
                    }
                }
            }
            if (startIndex != -1 && lastIndex != -1) {
                StringBuilder wordGet = new StringBuilder(String.valueOf(arrayChar[i]).substring(lastIndex, startIndex + 1));
                String ourFinalWord = wordGet.reverse().toString();
                if (word.contains(ourFinalWord)) {
                    System.out.println(true);
                    countOfTrue++;
                }
            }
        }
        if (countOfTrue == 0) {
            System.out.println(false);
        }
    }

    private static char[][] arrayToChar(String[][] arr) {
        char[][] arrayChar = new char[arr.length][arr[0].length];
        for (int i = 0; i < arrayChar.length; i++) {
            for (int j = 0; j < arrayChar[i].length; j++) {
                arrayChar[i][j] = arr[i][j].charAt(0);
            }
        }
        return arrayChar;
    }

    private static void outputOnDisplay(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static String[][] arrayTwoDimensional(ArrayList<String[]> nums) {
        int columns = nums.get(0).length;
        String[][] arr = new String[nums.size()][columns];
        Iterator<String[]> iter = nums.iterator();
        for (int i = 0; i < arr.length; i++) {
            String[] s = iter.next();
            for (int j = 0; j < columns; j++) {
                arr[i][j] = s[j];
            }
        }
        return arr;
    }

    private static void horizontalCheck(String word, char[] arrayWord, char[][] arrayChar) {
        int countOfTrue = 0;
        for (int i = 0; i < arrayChar.length; i++) {
            int startIndex = -1;
            int lastIndex = -1;
            for (int j = 0; j < arrayChar[i].length; j++) {
                if (arrayWord[0] == arrayChar[i][j]) {
                    startIndex = j;
                    break;
                }
            }
            if (startIndex < arrayChar[i].length) {
                for (int k = startIndex + 1; k < arrayChar[i].length; k++) {
                    if (arrayWord[arrayWord.length - 1] == arrayChar[i][k]) {
                        lastIndex = k;
                    }
                }
            }
            if (startIndex != -1 && lastIndex != -1) {
                if (word.contains(String.valueOf(arrayChar[i]).substring(startIndex, lastIndex + 1))) {
                    System.out.println(true);
                    countOfTrue++;
                }
            }
        }
        if (countOfTrue == 0) {
            System.out.println(false);
        }
    }

    private static void verticalCheck(String word, char[] arrayWord, char[][] arrayChar) {
        int countOfTrue = 0;
        for (int i = 0; i < arrayChar[0].length; i++) {
            int startIndex = -1;
            int lastIndex = -1;
            for (int j = 0; j < arrayChar.length; j++) {
                if (arrayWord[0] == arrayChar[j][i]) {
                    startIndex = j;
                    break;
                }
            }
            if (startIndex < arrayChar.length - 1) {
                for (int k = startIndex + 1; k < arrayChar.length; k++) {
                    if (arrayWord[arrayWord.length - 1] == arrayChar[k][i]) {
                        lastIndex = k;
                    }
                }
            }
            if (startIndex != -1 && lastIndex != -1) {
                String baseString = "";
                for (int k = startIndex; k <= lastIndex; k++) {
                    baseString += arrayChar[k][i];
                }
                if (word.contains(baseString)) {
                    System.out.println(true);
                    countOfTrue++;
                }
            }
        }
        if (countOfTrue == 0) {
            System.out.println(false);
        }
    }


}
