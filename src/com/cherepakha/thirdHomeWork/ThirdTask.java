package com.cherepakha.thirdHomeWork;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThirdTask {
    public static void main(String[] args) throws Exception {
        /*
        3*) Задана строка. Вывести все перестановки этой строки.
            Например для строки "abc":
            abc, acb, bac, bca, cab, cba
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку значения: ");
        String string = reader.readLine();
        StringBuffer strBuf = new StringBuffer(string);
        iteratingCharOfAString(strBuf, 0);
    }

    private static void iteratingCharOfAString(StringBuffer str, int index) {

        if (index == str.length())
            System.out.print(str + " ");
        else {
            iteratingCharOfAString(str, index + 1);
            for (int i = index + 1; i < str.length(); i++) {
                swapChar(str, index, i);
                iteratingCharOfAString(str, index + 1);
                swapChar(str, i, index);
            }
        }
    }

    private static void swapChar(StringBuffer str, int firstIndex, int secondIndex) {
        char character = str.charAt(firstIndex);
        str.setCharAt(firstIndex, str.charAt(secondIndex));
        str.setCharAt(secondIndex, character);
    }
}
