package strings;

I didn't quite get this. Need to revisit

public class InternString {
	
	public static void func() {
		
		String s1 = new String("You");
		
		String s2 = s1.intern();
		
		//s1 in Heap
		//s2 in SCP
		System.out.println(s1==s2);
		
		String s3 = "You";
		
		System.out.println(s2==s3);
		
	}

	public static void main(String[] args) {

		func();
		

		
	}

}
