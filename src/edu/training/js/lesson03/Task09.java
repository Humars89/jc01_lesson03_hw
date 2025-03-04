package edu.training.js.lesson03;

public class Task09 {

	public static void main(String[] args) {
		double side = 6.0; // длина стороны равностороннего треугольника

        // Вычисление площади
        double area = (Math.sqrt(3) / 4) * Math.pow(side, 2);

        // Вычисление высоты
        double height = (Math.sqrt(3) / 2) * side;

        // Вычисление радиуса вписанной окружности
        double inscribedRadius = side / (2 * Math.sqrt(3));

        // Вычисление радиуса описанной окружности
        double circumscribedRadius = side / Math.sqrt(3);

        System.out.println("Площадь треугольника: " + area);
        System.out.println("Высота треугольника: " + height);
        System.out.println("Радиус вписанной окружности: " + inscribedRadius);
        System.out.println("Радиус описанной окружности: " + circumscribedRadius);

	}

}
