package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EveryDigitOfANumberInArray {

	public static void func(int num) {
		
		//1. getting the number of digit
		int count = 0;
		int rem = num;
		int baseVal = 1;
		int tempNum = num;
		int tempCount;
		
		while(tempNum>0) {
			
			tempNum = tempNum/10;
			//rem = num%10;
			//System.out.println(rem);
			count++;
		}
		
		//System.out.println(count);
		
		//create the array with the count 
		int[] arr = new int[count];
		
		/*
		 * 6572/1000 = 6
		 * 572/100 = 5
		 * 72/10 = 7
		 * 2/1 = 2
		 * that should be the logic. how do i get 1000 as base value??
		 * i can get it from count which is 4
		 */
		
		//if count is 4 then desired base value is 1000, if 5 then 10000.
		//one less zero than count
		tempCount = count;
		
		while(tempCount>1) {
			
			baseVal = baseVal* 10;
			tempCount--;
			
		}
		
		//System.out.println(num/baseVal);
		
		for(int i=0;i<count;i++) {
			
			num = rem/baseVal;
			
			arr[i] = num;
			
			rem = rem%baseVal; 
			
			baseVal = baseVal/10;
			
			System.out.println(Arrays.toString(arr));
		}		
	}
	
	public static void funcAnother(int num) {
		
		String str = String.valueOf(num);
		
		List<Integer> l = new ArrayList<>();
		
		for(int i=0;i<str.length();i++) {
			
			l.add(Integer.parseInt(String.valueOf(str.charAt(i)))); 
		}
		
		
		System.out.println(l);
		
	}
	
	public static void main(String[] args) {
	
		
		funcAnother(6572);
		

	}

}
