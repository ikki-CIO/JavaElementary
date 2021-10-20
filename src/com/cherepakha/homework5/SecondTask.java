package com.cherepakha.homework5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondTask {
    public static void main(String[] args) throws IOException {
        /*
        2*) Задана строка английских слов через пробел.
        Написать метод который который вернет эту же строку но в которой слова в обратном порядке.
        Например:
        "man has dog" => "dog has man".
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String words = reader.readLine();

        words = getWords(words);

        System.out.println(words);

        reader.close();
    }

    public static String getWords(String words){
        String[] stringArray;
        String delimiter = " ";
        stringArray = words.split(delimiter);
        words = "";
        for (int i = (stringArray.length-1); i>=0; i--){
            words += stringArray[i] + " ";
        }
        return words;
    }
}
