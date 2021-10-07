package com.cherepakha.homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
