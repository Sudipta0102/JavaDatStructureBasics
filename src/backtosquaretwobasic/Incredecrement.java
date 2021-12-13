package backtosquaretwobasic;

public class Incredecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//post
		
		int i = 1;
		int j = i++;
		
		System.out.println(i);
		System.out.println(j);
		
		j=i++;
		
		System.out.println(j);
		
		System.out.println("******");
		//pre
		
		int a = 1;
		int b = ++a;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("****");
		for(int c = 0;c<9;++c) {
			System.out.println(c);
		}
	}

}
