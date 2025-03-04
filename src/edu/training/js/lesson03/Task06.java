package edu.training.js.lesson03;

public class Task06 {

	public static void main(String[] args) {
		int number = 1234; // заданное четырехзначное число

        int digit1 = number / 1000;       // первая цифра
        int digit2 = (number / 100) % 10; // вторая цифра
        int digit3 = (number / 10) % 10;  // третья цифра
        int digit4 = number % 10;         // четвертая цифра

        int product = digit1 * digit2 * digit3 * digit4;

        System.out.println("Произведение цифр числа " + number + " равно " + product);

	}

}
