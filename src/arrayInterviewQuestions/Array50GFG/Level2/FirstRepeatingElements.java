package arrayInterviewQuestions.Array50GFG.Level2;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingElements {

	//T(n)=n+(n-1)+(n-2)+...+1=O(n^2)
	//so this is a fancy brute-force :P
	static void func(int[] a) {
		
		int n = a.length;
		
		int start = 0, counter = 1;
		//{1, 5, 3, 4, 3, 5, 6}
		while(counter<n) {
			
			//a[x]=a[y]
			if(a[start]==a[counter]) {
				
				System.out.println(a[start]);
				break;				
			}
			
			//x is not at the end and the y is, means a[x]
			//only occurred once in the array.
			//so, reseting x and y to accommodate the 
			//subsequent element search
			else if(start!=n-1 && counter == n-1) {
				
				start++;
				counter = start+1;
				
			}
			
			else {
				
				counter++;
			}
			
			//if x hits the last element, means nothing matched
			if(start==n-1) {
				
				System.out.println("There are no repeating elements");
			}
			//counter++;
		}
		
	}
	
	//O(n) and O(n)
	static void funcAgain(int[] a) {
		
		int n = a.length;
		
		Set<Integer> s = new HashSet<>();
		//{1, 5, 3, 4, 5, 3, 6}
		for(int i=0;i<n;i++) {
			
			if(!s.add(a[i])) {
				
				System.out.println(a[i]);
				break;
			}
			
			if(s.size()==a.length)
				System.out.println("No repeating elements");
			
		}
				
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1, 5, 3, 4, 8, 9, 6};
		
		funcAgain(arr);
	}
}
