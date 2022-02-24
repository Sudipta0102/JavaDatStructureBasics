package arrayInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllZerosToRightSide {

	//lame way
	static void func(int[] a) {
		
		List<Integer> zeros = new ArrayList<>();
		List<Integer> nums = new ArrayList<>();
		
		for(int num:a) {
			
			if(num==0) {
				zeros.add(num);
			}else {
				nums.add(num);
			}			
		}
		
		int counter = 0;
		
		for(int i=0;i<nums.size();i++) {
			a[counter] = nums.get(i);
			counter++;
		}
		
		for(int i=0;i<zeros.size();i++) {
			a[counter] = zeros.get(i);
			counter++;
		}
		
		System.out.println(Arrays.toString(a));
		
	}
	
	
	//cool way
	public static void funcAnother(int[] a) {
		
		int n = a.length;
		int count = 0;
		/*
		 * every time i get a non zero value, I need to assign that value to a[count]. That way
		 * I get to keep all the non zero values to the left side.  
		 */
		for(int i=0;i<n-1;i++) {
		
			if(a[i]!=0) {
				a[count] = a[i];
				count++;
			}
			
			System.out.println(Arrays.toString(a));
			
		}
		/*
		 * Once I am done all the non zero values, fill the remaining elements with 0.
		 */
		while(count<n) {
			a[count] = 0;
			count++;
		}
		
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		
		int[] a = {2,1,3,0,4,2,0,0,8,1,0};
		
		System.out.println(Arrays.toString(a));
		
		funcAnother(a);
	}
}
