package sum.a.b;

import java.util.Scanner;

public class SumAB_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// User input two numbers and return A+B

		int number1;
		int number2;
		int result;
		Scanner sc = new Scanner(System.in);

		System.out.println("Input one number: ");
		number1 = Integer.parseInt(sc.nextLine());
		System.out.println("Input a second number: ");
		number2 = Integer.parseInt(sc.nextLine());

		result = sum(number1, number2);
		System.out.println("The result of the sum of these two numbers is: " + result);
	}

	private static int sum(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1 + number2;
	}

}
