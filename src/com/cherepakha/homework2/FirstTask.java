package com.cherepakha.homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTask {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите значение jewels:");
        String jewels = reader.readLine();
        System.out.println("Введите значение stones:");
        String stones = reader.readLine();

        int numberOfJewels = numJewelsInStones(jewels, stones);
        System.out.println(numberOfJewels);
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        char[] arrayJewels = jewels.toCharArray();
        char[] arrayStones = stones.toCharArray();

        for (int i = 0; i < arrayJewels.length; i++) {
            for (int j = 0; j < arrayStones.length; j++) {
                if (arrayJewels[i] == arrayStones[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
