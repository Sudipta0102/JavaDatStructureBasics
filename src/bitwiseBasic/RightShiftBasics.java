package bitwiseBasic;

public class RightShiftBasics {

	public static void main(String[] args) {

		int num = 64;
		
		//right shifting 1 bit means dividing by 2
		for(int i=0;i<3;i++) {
			
			num = num>>1;
			System.out.println(num);
			
		}
		System.out.println();
		
		int num1 = -64;
		
		//right shifting 2 bits means dividing by 4
		for(int i=0;i<3;i++) {
			
			num1 = num1>>>2;
			System.out.println(num1);
			
		}

	}

}
