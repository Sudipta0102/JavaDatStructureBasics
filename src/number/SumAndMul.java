package number;

import java.util.Scanner;

public class SumAndMul {

	/*
	 * Take two numbers from the user and print the result of multiplication and sum of
all the numbers between these two numbers. E.g. if user presses 3 and 8 then
4+5+6+7 is 22 and 4*5*6*7 is 840. (Restrict the user such that first number
must be less than the second number).
	 */
	
	static void func() {
		
		int sum = 0;
		int mul = 1;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter lower limit:");
		int lower = scanner.nextInt();
		int upper = 0;
		System.out.println("Enter Upper limit:");
		
		while(true) {	
			upper = scanner.nextInt();
			if(lower<upper) {
				break;
			}else {
				System.out.println("Lower limit needs to be less than "
						+ "upper limit. Please try again.");
				System.out.println("Enter Upper limit Again:");
			}			
		}
		
		for(int i=lower+1;i<upper;i++) {
			
			sum += i;
			mul *= i;
		}
		
		System.out.println("Sum: "+ sum);
		System.out.println("Multiplication: "+ mul);
		scanner.close();
		
	}
	
	public static void main(String[] args) {
		
		func();
		
	}
}
