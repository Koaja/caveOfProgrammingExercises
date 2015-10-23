package loops;

import java.util.Scanner;

public class Application2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int number = 0;

		Scanner input = new Scanner(System.in);

		do {

			System.out.println("Enter an integer: ");
			if (input.hasNextInt()) {
				number = input.nextInt();
			} else {
				input.nextLine();
			}

		} while (number <= 10);

		System.out.println("Integer greater than 10 detected!");
	}

}
