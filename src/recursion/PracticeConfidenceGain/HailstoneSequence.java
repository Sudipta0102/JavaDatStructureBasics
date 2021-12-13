package recursion.PracticeConfidenceGain;

/*
 *     1. If n is 1 then the sequence ends.
 *     2. If n is even then the next n of the sequence = n/2.
 *     3. If n is odd then the next n of the sequence = (3 * n) + 1.
 */

public class HailstoneSequence {

	static void func(int num) {
		
		if(num==1) {
			return;
		}
		
		if(num%2==0) {
			num = num/2;
			System.out.print(num+" ");
			func(num);
			
		}
		else if (num%2!=0) {
			num = 3*num+1;
			System.out.print(num+" ");
			func(num);
		}
		
		//System.out.println();
	}
	
	public static void main(String[] args) {

		func(15);

	}

}
