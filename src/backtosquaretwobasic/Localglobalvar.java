package backtosquaretwobasic;

public class Localglobalvar {
	
    String s1 = "global var";
    static String s2 = "static global var";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "inside main";
		
		Localglobalvar obj = new Localglobalvar();
		
		System.out.println(s1);
		System.out.println(obj.s1);
		obj.ss();
		
		System.out.println(s2);
		st();
		
	}
	
	public void ss() {
		
		//static int i = 10; //this can't happen
		
		String s1 = "inside ss method";
		System.out.println(s1);
	}
	
	public static void st() {
		
		//static int i = 10; //this can't happen
		
		String s1 = "inside st method";
		System.out.println(s1);
	}

}
