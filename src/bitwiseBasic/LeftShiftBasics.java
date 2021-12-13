package bitwiseBasic;

public class LeftShiftBasics {
	
	public static void main(String[] args) {
		
		int num = 4;
		
		//left shifting by 1 bit is a quick way of multiplying by 2
		for(int i=0;i<3;i++) {
			
			num = num<<1;
			
			System.out.println(num);
			
		}
		System.out.println();
		//2 bits left shifting will multiply the number by 4
		int num1 = 4;
		
		for(int i=0;i<3;i++) {
			
			num1 = num1<<2;
			
			System.out.println(num1);
			
		}
		//3 bits will multiply by 8
		
		// and so on.
		
	}

}
