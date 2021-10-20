package com.cherepakha.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTask {
    public static void main(String[] args) throws IOException {

        /*
        FirstTask:
        Given an integer array nums,
        move all the even integers at the beginning of the array followed by all the odd integers.
        Return any array that satisfies this condition.
         */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите размер целочисленного массива:");
        String stringReader = reader.readLine();
        int arrayLength = Integer.parseInt(stringReader);

        int[] array = new int[arrayLength];
        System.out.println("Введите " + arrayLength + " целочисленных значений!");
        int count = 1;
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Значение номер: " + count);
            String stringValue = reader.readLine();
            int integerValue = Integer.parseInt(stringValue);
            array[i] = integerValue;
            count++;
        }

        System.out.println();
        System.out.println("Массив до сортировки:");
        for (int j = 0; j < arrayLength; j++) {
            System.out.println(array[j]);
        }

        sortArrayByParity(array);

        System.out.println();
        System.out.println("Массив после сортировки:");
        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }

        reader.close();

    }

    public static int[] sortArrayByParity(int[] nums) {
        int numberOfEven = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int tmp = nums[i];
                nums[i] = nums[numberOfEven];
                nums[numberOfEven] = tmp;
                numberOfEven++;
            }
        }
        return nums;
    }
}
