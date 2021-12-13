package arrayInterviewQuestions.Array50GFG.Level2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElementsAmongThreeArrays {

	static void func(int[] a, int[] b, int[] c) {
		
		int n = a.length;
		int i = 0, j = 0, k=0;
		
		Set<Integer> l = new HashSet<>();
		List<Integer> s = new ArrayList<>();
		
		if(n<=b.length)
			n = b.length;
		//if(n<=c.length)
			//n = c.length;
		
		
		//{1, 5, 10, 20, 40, 80};
		//{6, 7, 20, 80, 100};
		while(i<n) {
			
			if(a[i]<b[j]) {
				
				i++;
				
			}
			else if(b[j]<a[i]) {
				
				j++;
			}
			else {
				
				l.add(a[i]);
				i++;
				j++;
				
			}
			
			if(i==a.length || j==b.length)
				break;
			
		}
		
		int p = 0;
		
		for(int m=0;m<c.length;m++) {
			
			if(!l.add(c[m])) {
				
				s.add(c[m]);
				
			}
			
		}
		
		System.out.println(s);
		
		//System.out.println(l);
	}
	
	static void funcAgain(int[] a, int[] b, int[] c) {
		
		int n1 = a.length;
		int n2 = b.length;
		int n3 = c.length;
		
		int i=0,j=0,k=0;
		
		while(i<n1 && j<n2 && k<n3) {
			
			//x=y=z
			if(a[i]==b[j] && b[j]==c[k]) {
				
				System.out.println(a[i]);
				i++;j++;k++;
				
			}
			
			//x<y
			else if(a[i]<b[j])
				i++;
			
			//y<z 
			else if(b[j]<c[k])
				j++;
			
			//x>y and y>z
			else
				k++;
			
		}		
	}
	
	public static void main(String[] args) {
		
		int[] A = {1, 5, 10, 20, 40, 80};
		int[] B = {6, 7, 20, 80, 100};
		int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
		
		//func(A, B, C);
		funcAgain(A, B, C);
	}
	
}
