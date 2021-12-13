package recursion;

public class TowerOfHanoi {

	static void func(int n, String src, String helper, String dest) {
		
		if(n==1) {
			
			System.out.println(n+"->"+src+" to "+dest);
			return;
		}
		
		func(n-1, src, dest, helper);
		System.out.println(n+"->"+src+" to "+dest);
		func(n-1, helper, src, dest);
		
	}
	
	public static void main(String[] args) {
		
		func(111, "S", "H", "D");
		
	}
	
}
