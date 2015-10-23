package improvedScanner;

import java.util.Scanner;

public class Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number = 0;

		while (number != 5) {
			if(input.hasNextInt()) {
                number = input.nextInt();
            }
            else {
                input.nextLine();
                System.out.println("enter a number");
            }
		}
		System.out.println("Got it");

	}

}
