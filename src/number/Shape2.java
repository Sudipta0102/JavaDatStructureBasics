package number;

public class Shape2 {

	static void func(int num) {
		
		for(int i=1;i<=num;i++) {
			
			for(int j=1;j<=num-i;j++) {
				System.out.print(j);
			}
			
			for(int k=1;k<=i;k++) {
				System.out.print("&");
			}
			
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		func(6);
		
	}
}
