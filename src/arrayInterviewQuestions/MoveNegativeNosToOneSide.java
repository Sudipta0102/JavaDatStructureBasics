package arrayInterviewQuestions;

import java.util.Arrays;

public class MoveNegativeNosToOneSide {

	//that's stupidity (it works though)
	static String func(int[] a) {
		
		Arrays.sort(a);
		
		return Arrays.toString(a);
		
	}
	
	//etao hocche but, negative value der sequence
	//thik thakche na
	static void funcAnother(int[] a) {
		
		int n = a.length;
		
		for(int i=0;i<n-1;i++) {
			
			if(a[i]<0) {
				
				for(int j=i+1;j<n;j++) {
					
					if(a[j]>=0) {
						
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
						break;
					}
				}
				
			}
			
		}	
		System.out.println(Arrays.toString(a));
	}
	
	//it also works but space complexity is o(n)
	static void functwo(int[] a) {
		
		int n = a.length;
		int countNegative =0;
		
		int[] b  = new int[a.length]; 
		
		for(int i=0;i<n;i++) {
			
			if(a[i]<0) {
				
				countNegative++;
				
			}
			
		}
		
		int temp = n-countNegative;
		int j=0;
		
		for(int i=0;i<n;i++) {	
			
			if(a[i]>=0) {
				
				b[j] = a[i];
				j++;
			}
			
			else {
				
				b[temp] = a[i];
				temp++;
			}
		}
		
		System.out.println(Arrays.toString(b));
		
	}
	
	//this is like modified insertion sort
	static void funcThree(int[] a) {
		
		int n = a.length;
		int j=0;
		
		for(int i=0;i<n-1;i++) {
			
			j=i+1;
			if(a[j]>=0) {
				
				int key = a[j];
				
				while(j>0 && a[j-1]<0) {
					
					a[j] = a[j-1];
					j--;
					
				}
			
				a[j] = key;
			}	
		}
		
		
		System.out.println(Arrays.toString(a));
		
	}
	
	
	public static void main(String[] args) {
		
		int[] a =	{-10, -1, -3, 2, -7, -5, 11, 6 };
		
		//System.out.println(func(a));
		
		//funcAnother(a);
		
		//functwo(a);
		
		funcThree(a);
	}
	
}
