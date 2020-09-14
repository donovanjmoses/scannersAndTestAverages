import java.util.Scanner;

public class scannersAndTestAverages {
	
	public static void main(String[] args) {
		
		int test1;
		int test2;
		int test3;
		final int NUMBER_OF_TESTS = 3;
		double averageValue;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your first test score: "); //first user prompt//
		test1 = in.nextInt();
		System.out.println("Enter your second test score: "); //second user prompt//
		test2 = in.nextInt();
		System.out.println("Enter your third test score: "); //third user prompt//
		test3 = in.nextInt();
		averageValue = (test1 + test2 + test3) / (double) NUMBER_OF_TESTS; //allows averageValue to evaluate to a floating point number//
		
		System.out.println("The average of your tests is " + averageValue);
		
		
	}

}
