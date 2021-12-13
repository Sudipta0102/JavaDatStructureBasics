package number;

public class Shape1 {

	static void func(int num) {
		
		for(int i=1;i<=num;i++) {			
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=i+1;k<=num;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		func(6);
		
	}
	
}
