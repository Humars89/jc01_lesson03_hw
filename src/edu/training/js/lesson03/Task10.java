package edu.training.js.lesson03;

public class Task10 {

	public static void main(String[] args) {
		double circumference = 31.4; // длина окружности

        // Вычисление радиуса
        double radius = circumference / (2 * Math.PI);

        // Вычисление площади круга
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Площадь круга: " + area);

	}

}
