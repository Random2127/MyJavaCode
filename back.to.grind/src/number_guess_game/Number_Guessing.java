package number_guess_game;

import java.util.Scanner;

public class Number_Guessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//

		Scanner sc = new Scanner(System.in);

		// Get a random number between 0.0 an 1.0, multiply by 100 +
		// truncate it to int converting double to int +
		// add 1 to get range from 1-100
		int number = 1 + (int) (100 * Math.random());
		int chances = 7;
		int guess = 0;

		System.out.println("I've chosen a number between 1 and 100.");

		// iterate over chances
		for (int i = chances; i > 0; i--) {
			System.out.println("Guess the number: ");

			// We check whether input is an integer
			guess = checkNum(sc);

			// Logic behind user guess
			if (guess == number) {
				System.out.println("Awesome! You've guessed the number.");
				break;
			} else if (guess < number) {
				System.out.println("Your number is too low");
				System.out.println("You have " + i + " chances left\n");
			} else if (guess > number) {
				System.out.println("Your number is too high");
				System.out.println("You have " + i + " chances left\n");
			}
			if (i == 1) {
				System.out.println("You have run out of chances. The right number was " + number);
			}

		}

	}

	private static int checkNum(Scanner sc) {
		// TODO Auto-generated method stub
		while (!sc.hasNextInt()) {
			System.out.println("Please input an integer");
			sc.next();
		}
		return sc.nextInt();
	}

}
