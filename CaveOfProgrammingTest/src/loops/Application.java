package loops;

import java.util.Scanner;

public class Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number = 0;

		while (number != 5) {
			number = input.nextInt();
		}
		System.out.println("Got it");

	}

}
