package workingWithArrays;

public class TwoDimentionalArraysLoop {

	public static void main(String[] args) {

		String[][] multiArray = { { "cat", "dog", "horse" }, { "house", "door", "horn" } };

		for (int row = 0; row < multiArray.length; row++) {
			for (int col = 0; col < multiArray[row].length; col++) {
				System.out.println(multiArray[row][col]);
				// System.out.println(" ");
			}
			//System.out.println();
		}
	}
}
