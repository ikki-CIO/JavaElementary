package com.cherepakha.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondTask {
    public static void main(String[] args) throws IOException {
        /*
        SecondTask:
        You are given row x col grid representing a map where grid[i][j] = 1
        represents land and grid[i][j] = 0 represents water.
        Grid cells are connected horizontally/vertically (not diagonally).
        The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
        The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island.
        One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100.
        Determine the perimeter of the island.
         */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите размер целочисленного двумерного массива.");
        System.out.println("Сетка прямоугольная, ширина и высота не более 100.");
        System.out.println("Количество rows: ");
        String rowReader = reader.readLine();
        int rowLength = Integer.parseInt(rowReader);
        System.out.println("Количество columns: ");
        String colReader = reader.readLine();
        int colLength = Integer.parseInt(colReader);

        if (rowLength == 101 || colLength == 101) {
            System.out.println("Превышено допустимое значение ширины/высоты!");
            return;
        }
        int[][] array = new int[rowLength][colLength];
        System.out.println("Заполним массив значением 1 или 0. Где 1 - земля, 0 - вода. Яцейки с 1, должны быть соеденены\n" +
                "создавши один, суцельный остров. Вокруг которого вода.");

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                String arrayStringValue = reader.readLine();
                int arrayIntValue = Integer.parseInt(arrayStringValue);
                if (arrayIntValue != 1 && arrayIntValue != 0) {
                    System.out.println("Не верное значение! Попробуйте снова!");
                    return;
                } else {
                    array[i][j] = arrayIntValue;
                }
            }
        }

        System.out.println();
        System.out.println("Проверка массива:");
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        int perimeter = islandPerimeter(array);
        System.out.println("Периметр сторон острова равен: " + perimeter);

        reader.close();
    }

    public static int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int sumOfCellSides = 4;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter += sumOfCellSides;
                }
            }
        }

        for (int i = 0; i < (grid.length - 1); i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == grid[i + 1][j] && grid[i][j] == 1) {
                    perimeter -= 2;
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < (grid[i].length - 1); j++) {
                if (grid[i][j] == grid[i][j + 1] && grid[i][j] == 1) {
                    perimeter -= 2;
                }

            }
        }

        return perimeter;
    }
}
