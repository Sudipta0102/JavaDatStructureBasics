package recursion.PracticeConfidenceGain;

public class RecusrionProblem {

	static void recusionISAProblem(int a, int b) {
		
		if(a==0) {
			
			System.out.print("a:"+a+" "+"b:"+b);
			System.out.println();
			return;
		}
		if(b==0) {
		
			System.out.print("a:"+a+" "+"b:"+b);
			System.out.println();
			return;

		}
		
		System.out.print("a:"+a+" "+"b:"+b);
		System.out.println();
		recusionISAProblem(a-1, b);
		System.out.println("returning to a:"+a+" "+"b:"+b );
		recusionISAProblem(a, b-1);
		System.out.println("returning to a:"+a+" "+"b:"+b );
		
	}
	
	public static void main(String[] args) {
		
		recusionISAProblem(2, 1);
		
	}
	
}
