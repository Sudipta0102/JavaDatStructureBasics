package arrayInterviewQuestions.Array50GFG.Level2;


import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {

	static void func(int[] a) {

		Set<Integer> s = new HashSet<>();
	
		int n = a.length;
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			
			sum +=a[i];
			
			if(sum == 0||a[i] == 0||s.contains(sum))
				System.out.println("yes");
			
			
			s.add(sum);
		
		}
		


	}

	public static void main(String[] args) {

		int[] a = { 4, 2, -3, 1, 6 };

		func(a);
	}

}
