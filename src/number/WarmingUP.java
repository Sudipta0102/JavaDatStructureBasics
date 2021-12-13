package number;

public class WarmingUP {

	public static void main(String[] args) {

		long oddresult = 1;
		
		for(int i=1;i<=20;i++) {
			if(i%2!=0) {
				oddresult *= i;
			}
		}
		
		System.out.println(oddresult);
		
		int evenResult = 0;
		
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				evenResult += i;
			}
		}
		
		System.out.println(evenResult);
	}
	
}
