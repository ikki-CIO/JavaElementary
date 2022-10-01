package com.cherepakha.homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

        /*
         Robot Return to Origin
         Есть робот на плоскости. Он может двигаться на 1 шаг в стороны:
         R (right), L (left), U (up), and D (down)
         Задана последовательность движений, вернуть true если оне вернется в исходную точку.
         Example 1:
         Input: moves = "UD"
         Output: true

         Example 2:
         Input: moves = "LL"
         Output: false

         Example 3:
         Input: moves = "RRDD"
         Output: false
         */

public class SecondTask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите команду Роботу, чтобы он начал своё движение:");
        String moves = reader.readLine();
        System.out.println(judgeCircle(moves));

    }

    public static boolean judgeCircle(String moves) {
        char[] arrayChar = moves.toCharArray();
        int coordinateX = 0;
        int coordinateY = 0;
        boolean checkCircle = false;
        for (int i = 0; i < arrayChar.length; i++) {
            if (arrayChar[i] == 'U') {
                coordinateY = coordinateY + 1;
            }
            if (arrayChar[i] == 'D') {
                coordinateY = coordinateY - 1;
            }
            if (arrayChar[i] == 'L') {
                coordinateX = coordinateX - 1;
            }
            if (arrayChar[i] == 'R') {
                coordinateX = coordinateX + 1;
            }
        }

        if (coordinateX == 0 && coordinateY == 0) {
            checkCircle = true;
        }
        return checkCircle;
    }
}
