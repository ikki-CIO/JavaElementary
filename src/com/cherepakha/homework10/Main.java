package com.cherepakha.homework10;

public class Main {
    public static void main(String[] args) {
        String[][] array = new String[4][4];
//        String[][] array = new String[5][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "5";
            }
        }
//        array[1][2] = "g";
        try {
            System.out.println(ArrayValueCalculator.doCalc(array));
        } catch (MyArraySizeException firstException) {
            System.out.println(firstException.getMessage());
        } catch (MyArrayDataException secondException) {
            System.out.println(secondException.getMessage());
        }
    }
}
