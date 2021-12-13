package recursion.recursionPracticeSet4;

public class Example3 {

	
	i do not understand this 	
	
	
	static int func(int i) {
		
		if(i%2==1)
			return i++;
		else
			return func(func(i-1));
	}

	public static void main(String[] args) {

		System.out.println(" "+func(200)+" ");

	}

}
