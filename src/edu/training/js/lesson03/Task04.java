package edu.training.js.lesson03;

public class Task04 {

	public static void main(String[] args) {
		double radius = 5.0; // заданный радиус

        // Вычисление длины окружности
        double circumference = 2 * Math.PI * radius;

        // Вычисление площади круга
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Длина окружности: " + circumference);
        System.out.println("Площадь круга: " + area);
	}

}
