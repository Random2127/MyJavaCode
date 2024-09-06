package battleShips;

import java.util.Scanner;

//First attempt to a battle ships game 
public class BattleShips {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int column = 0;
		int row = 0;
		int torpedo = 10;
		int sunk = 0;

		// This is a preset board to test out
		// Will try to upgrade to randomizing itself and growing
		int[][] fleet = { { 0, 0, 0, 0, 2 }, { 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0 }, { 2, 0, 0, 3, 0 },
				{ 0, 0, 0, 0, 0 }, };

		do {
			// Show columns, may be extended by adding letters
			char[] letras = { 'A', 'B', 'C', 'D', 'E' };
			System.out.print(" ");
			for (char let : letras) {
				System.out.print(let + " ");
			}

			// Use the value of the row to print the number and then the rows of the matrix
			System.out.println();
			for (int i = 0; i < fleet.length; i++) {
				System.out.print((i + 1) + " ");

				// This will update the matrix with chosen chars
				// impact = * / water = ~
				for (int j = 0; j < fleet.length; j++) {

					if (fleet[i][j] == -1) {
						System.out.print("* ");
					} else if (fleet[i][j] == -2) {
						System.out.print("~ ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}

			// Take input from user

			System.out.println("\nLet's input coords: ");
			System.out.println("Choose a column (A-E");
			String columnString = sc.nextLine();

			switch (columnString.toLowerCase()) {
			case "a":
				column = 0;
				break;
			case "b":
				column = 1;
				break;
			case "c":
				column = 2;
				break;
			case "d":
				column = 3;
				break;
			case "e":
				column = 4;
				break;
			}
			
			System.out.println("Choose a row: ");
			row = Integer.parseInt(sc.nextLine()) - 1;

			// Control whether shooting in the same coords
			if (fleet[column][row] == -1 || fleet[column][row] == -2) {
				System.out.println("You already shot there, miss a torpedo");
			}

			if (fleet[column][row] == 1) {
				fleet[column][row] = -1;
				sunk++;
				
				// Checking whether the ship has been completely sunk
				boolean acorazadoFlota = false;
				for (int i = 0; i < fleet.length; i++) {
					for (int j = 0; j < fleet.length; j++) {
						if (fleet[i][j] == 1) {
							acorazadoFlota = true;
							break;
						}
					}
				}

				if (acorazadoFlota) {
					System.out.println("Battelship hit!!\n");
				} else {
					System.out.println("Battelship hit and sunk!!\n");
				}

			} else if (fleet[column][row] == 2) {
				System.out.println("Destroyer sunk!!\n");
				fleet[column][row] = -1;
				sunk++;
			} else if (fleet[column][row] == 3) {
				System.out.println("Submarine sunk!!\n");
				fleet[column][row] = -1;
				sunk++;
			} else {
				System.out.println("Miss!!\n");
				fleet[column][row] = -2;
				torpedo--;
			}

			System.out.println("You have " + torpedo + " torpedos left.\n");

			if (torpedo == 0) {
				System.out.println("No more shots, you lose :( ");
			}
			
		} while (torpedo != 0);

	}

}
