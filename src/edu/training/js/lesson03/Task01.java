package edu.training.js.lesson03;

public class Task01 {

	public static void main(String[] args) {
		double a = 3.0; // длина первого катета
        double b = 4.0; // длина второго катета

        // Вычисление гипотенузы по теореме Пифагора
        double c = Math.sqrt(a * a + b * b);

        // Вычисление периметра
        double perimeter = a + b + c;

        // Вычисление площади
        double area = (a * b) / 2;

        System.out.println("Периметр прямоугольного треугольника: " + perimeter);
        System.out.println("Площадь прямоугольного треугольника: " + area);

	}

}
