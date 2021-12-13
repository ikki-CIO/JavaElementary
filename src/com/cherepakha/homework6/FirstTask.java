package com.cherepakha.homework6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTask {
    public static void main(String[] args) throws IOException {
        /*
        1) Создать базовый интерфейс для геометрической фигуры, в котором есть метод который возвращает площадь фигуры.
        Создать 3 класса которые реализуют этот интерфейс: круг, треугольник, квадрат.
        Создать массив фигур, и написать метод который выведет суммарную площадь всех фигур в этом массиве.
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        GeometricFigure[] geometricFigure = new GeometricFigure[3];
        geometricFigure[0]= circle;
        geometricFigure[1]= triangle;
        geometricFigure[2] = square;

        totalAreaOfAllShapes(geometricFigure, reader);



    }

    public static void totalAreaOfAllShapes(GeometricFigure[] geometricFigures, BufferedReader reader) throws IOException {
        double totalArea = 0;
        for (int i =0; i< geometricFigures.length; i++){
            totalArea +=geometricFigures[i].getFigureArea(reader);
        }
        System.out.println("Суммарная площадь фигур: " + totalArea);
    }
}
