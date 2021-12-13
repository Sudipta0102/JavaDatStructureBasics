package number;

import java.util.Scanner;

public class PrimeANother {

	/*
	 * Take an integer input from the user and count all prime numbers from 1 up to that
		number, print the total number of prime numbers as well as the largest one. E.g. if
	user presses 20, your program should print “Total number of prime numbers are:
	8” (as prime numbers from 1 to 20 are 1, 3, 5, 7, 11, 13, 17, 19) and “Largest
	prime number is: 19”.
	 */
	
	static void func() {
		
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int input = scanner.nextInt();
		
		
		for(int i=1;i<=input;i++) {			
			for(int j=i;i<=input/2;j++) {
				if(i%j==0) {
					break;
				}		
			}
			count++;
			int temp = i;
		}
		System.out.println(count);
		
		
	}
	
	public static void main(String[] args) {
		
		
		
	}
}
