package com.cherepakha.homework6;


import java.util.Arrays;
import java.util.Comparator;

public class Iterator {
    private int[][] arr;
    private int firstCount;
    private int secondCount;

    public Iterator(int[][] arr) {

        for (int i = 0; i < arr.length * arr[0].length - 1; ++i) {
            for (int j = i + 1; j < arr.length * arr[0].length; ++j) {
                if (arr[j / arr[0].length][j % arr[0].length] < arr[i / arr[0].length][i % arr[0].length]) {
                    int tmp = arr[j / arr[0].length][j % arr[0].length];
                    arr[j / arr[0].length][j % arr[0].length] = arr[i / arr[0].length][i % arr[0].length];
                    arr[i / arr[0].length][i % arr[0].length] = tmp;
                }
            }
        }
        this.arr = arr;
    }


    public boolean hasNext() {
        return firstCount < arr.length && secondCount < arr[firstCount].length;
    }

    public int next() {
        int number = arr[firstCount][secondCount++];
        if (secondCount >= arr[firstCount].length) {
            firstCount++;
            secondCount = 0;
        }
        return number;
    }
}
