package reverse_string;

import java.util.Scanner;

public class Reverse_String_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Reverse a String using a While loop

		Scanner sc = new Scanner(System.in);
		String input = "";
		String output = "";
		char letters;

		System.out.println("Write something you want to mirror: ");
		input = sc.nextLine();

		int i = input.length();
		while (i > 0) {
			letters = input.charAt(i - 1);
			output += letters;
			i--;
		}
		System.out.println("The reserved string is: " + output);
	}

}
