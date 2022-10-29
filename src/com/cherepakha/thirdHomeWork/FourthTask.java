package com.cherepakha.thirdHomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FourthTask {
    public static void main(String[] args) throws IOException {
        /*
        FourthTask:
        Написать метод у которого 2 входящих параметра типа String.
        Метод должен вернуть true если путем перестановки символов можно из первой строки получить вторую.
         "asdf", "fdsa" => true
         "asdf", "asdfg => false
         "aab", "bba" => false
         */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ввод первой строки: ");
        String firstString = reader.readLine();
        System.out.println("Ввод второй строки: ");
        String secondString = reader.readLine();


        boolean check = checkStrings(firstString, secondString);
        System.out.println(check);


    }

    public static boolean checkStrings(String firstString, String secondString) {
        char[] firstStrToArray = firstString.toCharArray();
        char[] secondStrToArray = secondString.toCharArray();

        if (firstStrToArray.length != secondStrToArray.length) {
            return false;
        } else {
            int count = 0;
            for (int i = 0; i < firstStrToArray.length; i++) {
                for (int j = 0; j < secondStrToArray.length; j++) {
                    if (firstStrToArray[i] == secondStrToArray[j]) {
                        secondStrToArray[j] = '0';
                        count++;
                        break;
                    }
                }
            }
            if (count == firstStrToArray.length) {
                return true;
            } else {
                return false;
            }
        }
    }
}
