package com.cherepakha.homework10;

public class ArrayValueCalculator {
    public static int doCalc(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Размер массива не соответсвует условию");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!isNumber(array[i][j])) {
                    throw new MyArrayDataException("В ячейке " + i + "-" + j + " лежит символ или текст вместо числа");
                } else {
                    sum += Integer.parseInt(array[i][j]);
                }
            }
        }
        return sum;
    }

    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }
}
