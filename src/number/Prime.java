package number;

import java.util.Scanner;

public class Prime {

	static boolean isPrime() {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number:");
		int input = scanner.nextInt();
		scanner.close();
		for(int i=2;i<=input/2;i++) {
			
			if(input%i==0) {
				return false;
			}
			
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(isPrime());
		
	}
}
