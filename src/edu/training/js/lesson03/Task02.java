package edu.training.js.lesson03;

public class Task02 {

	public static void main(String[] args) {
	      double x1 = 1.0; // координаты первой точки
	        double y1 = 2.0;
	        double x2 = 4.0; // координаты второй точки
	        double y2 = 6.0;

	        // Вычисление расстояния между точками
	        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

	        System.out.println("Расстояние между точками: " + distance);

	}

}
