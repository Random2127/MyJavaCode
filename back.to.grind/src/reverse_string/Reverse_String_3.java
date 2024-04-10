package reverse_string;

import java.util.Scanner;

public class Reverse_String_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Reverse a String using an Array

		Scanner sc = new Scanner(System.in);
		String input = "";
		String output = "";
		char[] charArray;

		System.out.println("Write any word to mirror: ");
		input = sc.nextLine();

		charArray = input.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {
			output += charArray[i];
		}

		System.out.println("The reverse of the string is: " + output);
	}

}
