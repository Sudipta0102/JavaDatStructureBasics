package backtosquaretwobasic;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		int b = 200;
		
		String x = "it's";
		String y = "ok";

		System.out.println(a+b);
		
		System.out.println(x+" "+y);
		
		System.out.println(a+b+" "+x+" "+y);
		
		System.out.println(x+" "+y+a+b);// it's ok100200 because of left to right execution
		
		System.out.println(x+" "+y+(a+b));//it's ok300
		
	}

}
