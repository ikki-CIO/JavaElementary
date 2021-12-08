package com.cherepakha.homework6;

import java.io.BufferedReader;
import java.io.IOException;

public class Circle implements GeometricFigure{
    /*
    Чтобы найти площадь круга, воспользуемся следующей формулой: S = pi * (r*r);
    где S - площадь, r - радиус, pi - это константа, которая выражает отношение длины
    окружности к диаметру, она всегда равна 3,14.
     */
    @Override
    public double getFigureArea(BufferedReader reader) throws IOException {
        System.out.println("Введём значение радиуса для круга");
        String words = reader.readLine();
        double r = Double.parseDouble(words);
        double pi = 3.14;
        return pi * (r*r);
    }
}
