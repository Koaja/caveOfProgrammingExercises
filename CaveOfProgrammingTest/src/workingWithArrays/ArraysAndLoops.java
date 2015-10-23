package workingWithArrays;

public class ArraysAndLoops {

	public static void main(String[] args) {
		
		double [] values =  {0.2 , 0.5 , 4.5 , 4.2 , 10.1};
		for (int i = 0 ; i < values.length ; i++){
			System.out.printf("%.3f" , values[i]);
		}
	}
}
