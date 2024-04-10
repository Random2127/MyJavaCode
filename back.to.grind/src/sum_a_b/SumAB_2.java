package sum_a_b;

import java.util.Scanner;

public class SumAB_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// User input two numbers and return A+B
		// with a function

		int number1 = 0;
		int number2 = 0;
		int result;
		Scanner sc = new Scanner(System.in);

		System.out.println("Input one number: ");
		number1 = checkNum(sc, number1);
		System.out.println("Input a second number: ");
		number2 = checkNum(sc, number2);

		result = sum(number1, number2);
		System.out.println("The result of the sum of these two numbers is: " + result);
	}

	private static int checkNum(Scanner sc, int number) {
		while (!sc.hasNextInt()) {
			System.out.println("Please input an integer");
			sc.next();
		}
		return sc.nextInt();
	}

	private static int sum(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1 + number2;
	}

}
