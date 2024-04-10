package reverse.string;

import java.util.Scanner;

public class ReverseString_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Accept string input and reverse it in output

		Scanner sc = new Scanner(System.in);
		String input = "";
		String output = "";

		System.out.println("Write something to mirror it: ");
		input = sc.nextLine();

		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		System.out.println(output);
	}

}
