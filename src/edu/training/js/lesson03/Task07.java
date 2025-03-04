package edu.training.js.lesson03;

public class Task07 {

	public static void main(String[] args) {
		double num1 = 3.0; // первое число
        double num2 = 4.0; // второе число

        // Вычисление среднего арифметического кубов чисел
        double arithmeticMeanOfCubes = (Math.pow(num1, 3) + Math.pow(num2, 3)) / 2;

        // Вычисление среднего геометрического модулей чисел
        double geometricMeanOfModules = Math.sqrt(Math.abs(num1) * Math.abs(num2));

        System.out.println("Среднее арифметическое кубов чисел: " + arithmeticMeanOfCubes);
        System.out.println("Среднее геометрическое модулей чисел: " + geometricMeanOfModules);

	}

}
