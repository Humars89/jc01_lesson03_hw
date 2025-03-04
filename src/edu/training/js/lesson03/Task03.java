package edu.training.js.lesson03;

public class Task03 {

	public static void main(String[] args) {
		double x1 = 1.0, y1 = 2.0;
        double x2 = 4.0, y2 = 6.0;
        double x3 = 5.0, y3 = 3.0;

        // Вычисление сторон треугольника
        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double c = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

        // Вычисление периметра
        double perimeter = a + b + c;

        // Вычисление площади по формуле Герона
        double s = perimeter / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Периметр треугольника: " + perimeter);
        System.out.println("Площадь треугольника: " + area);

	}

}
