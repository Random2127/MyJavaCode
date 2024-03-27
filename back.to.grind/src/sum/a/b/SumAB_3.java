package sum.a.b;

import java.util.Scanner;

public class SumAB_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// User input two numbers and return A+B
		// with a function
		// Using floats+ all operators

		Scanner sc = new Scanner(System.in);

		float number1 = 0;
		float number2 = 0;
		float result = 0;
		String operator;

		System.out.println("Input one number: ");
		number1 = checkNum(sc, number1);
		System.out.println("Input a second number: ");
		number2 = checkNum(sc, number2);
		sc.nextLine();

		System.out.println("What operation do you want to carry out (+, -, *, /)? ");
		operator = sc.nextLine();

		switch (operator) {
		case "+":
			result = sum(number1, number2);
			break;
		case "-":
			result = subtract(number1, number2);
			break;
		case "*":
			result = multiply(number1, number2);
			break;
		case "/":
			result = divide(number1, number2);
			break;
		default:
			System.out.println("Invalid operator");
			return;
		}

		System.out.println("The result is: " + result);
	}

	private static float checkNum(Scanner sc, float number) {
		while (!sc.hasNextFloat()) {
			System.out.println("Please input an integer");
			sc.next();
		}
		return sc.nextFloat();
	}

	private static float sum(float number1, float number2) {
		// TODO Auto-generated method stub
		return number1 + number2;
	}

	private static float subtract(float number1, float number2) {
		// TODO Auto-generated method stub
		return number1 - number2;
	}

	private static float multiply(float number1, float number2) {
		// TODO Auto-generated method stub
		return number1 * number2;
	}

	private static float divide(float number1, float number2) {
		// TODO Auto-generated method stub
		if (number2 == 0) {
			System.out.println("You cannot devide by zero");
			return 0;
		} else {
			return number1 / number2;
		}
	}

}
