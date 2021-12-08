package com.cherepakha.homework6;

import java.io.BufferedReader;
import java.io.IOException;

public class Triangle implements GeometricFigure{
   /*
   Чтобы найти площадь треугольника, воспользуемся следующей формулой:
   S = 0,5 * a * h, где a — основание, h — высота.

   При использовании цикла for c начала введём значение основания, а потом значение высоты.
    */
    @Override
    public double getFigureArea(BufferedReader reader) throws IOException {
        System.out.println("Введём значение основания для триугольника:");
        String stringBase = reader.readLine();
        double a = Double.parseDouble(stringBase);
        System.out.println("Введём значение высоты для триугольника:");
        String stringHeight = reader.readLine();
        double h = Double.parseDouble(stringHeight);
        return 0.5*a*h;
    }
}
