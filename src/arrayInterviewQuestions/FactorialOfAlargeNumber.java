package arrayInterviewQuestions;

import java.util.ArrayList;

public class FactorialOfAlargeNumber {
	
	private static ArrayList<Integer> bigFact(int n) {
		
		ArrayList<Integer> l = new ArrayList<>();
		
		l.add(1);
		
		int carry =0;
		int x = 0;
		
		for(int i=2;i<=n;i++) {			
			for(int j = l.size()-1;j>=0;j--) {
				
				int prod = i*l.get(j)+carry;
				
				l.set(j, prod%10);
				
				carry = prod/10;
				
				//System.out.println(l);
			}
			
			while(carry!=0) {
				
				l.add(0, carry%10);
				carry = carry/10;
				
				//System.out.println(l);
			}
			
			//System.out.println(l);
			
		}
		
		
		
		return l;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();
		
		l = bigFact(7);
		
		System.out.println(l);
	}

}
