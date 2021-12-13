package backtosquaretwobasic;

public class ComparisonOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		int b = 200;
		int c = 300;
		
		if(a<b & b<c) {
			System.out.println("1st");
		}
		else if(a<c){
			System.out.println("2nd");
		}
		else {
			System.out.println("3rd");
		}
		
		//****************************
		
		if(a<c) {
			System.out.println("1st");
		}
		else if(a<b & b<c){
			System.out.println("2nd");
		}
		else {
			System.out.println("3rd");
		}
	}

}
