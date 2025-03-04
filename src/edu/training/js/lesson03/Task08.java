package edu.training.js.lesson03;

public class Task08 {

	public static void main(String[] args) {
		double edgeLength = 5.0; // длина ребра куба

        // Вычисление площади грани
        double faceArea = Math.pow(edgeLength, 2);

        // Вычисление площади полной поверхности
        double surfaceArea = 6 * faceArea;

        // Вычисление объема куба
        double volume = Math.pow(edgeLength, 3);

        System.out.println("Площадь грани: " + faceArea);
        System.out.println("Площадь полной поверхности: " + surfaceArea);
        System.out.println("Объем куба: " + volume);

	}

}
