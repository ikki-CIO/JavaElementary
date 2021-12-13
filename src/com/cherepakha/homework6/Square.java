package com.cherepakha.homework6;

import java.io.BufferedReader;
import java.io.IOException;

public class Square implements GeometricFigure{


    /*
    Чтобы найти площадь квадрата, воспользуемся следующей формулой:
    S = a × a = a2, где S — площадь, a — сторона.
     */
    @Override
    public double getFigureArea(BufferedReader reader) throws IOException {
        System.out.println("Введём значение стороны для квадрата:");
        String words = reader.readLine();
        double a = Double.parseDouble(words);
        return a*a;
    }
}
