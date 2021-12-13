package arrayInterviewQuestions;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	public static int removeDuplicates(int[] nums) {

		int count = 1;
		int n = nums.length - 1;
		int j = 1;
		int k = 1;

		for (int i = 0; i < n;) {

			/*
			if (nums[i] != nums[j] && j == k) {

				k++;
				count++;
				break;
			}
			*/ 
			while (j <= n && nums[j] <= nums[k-1]) {

				j++;

			}

			if (i>k) {
				// 0,1,2,1,1,0,2,3,3,4
				// 0,1,2,3,1,0,2,1,3,4
				// 0,1,2,3,4,0,2,1,3,1

				// swap(nums[k], nums[j])
				int temp = nums[k];
				nums[k] = nums[j];
				nums[j] = temp;
				
				
				k=i+1;
			}
			
			count = k+1;

			System.out.println(Arrays.toString(nums));
			
			i = j;
			j = i + 1;
			
			
				
		}

		return count;

	}
	
	public static int removeDuplicatesAgain(int[] nums) {
		
		int n = nums.length-1;
		int unique = 0;
		int count = 1;
		int  j = 1;
		int temp = nums[0];
		
		//always check with the last unique value
		//if value is greater than last unique value
		//swap the grater value with value next to the 
		//last unique value
		//1. leads to new last unique value
		
		
		//also, if the greater value is right next 
		//to the unique value, don't swap, only 
		//increment the counter  
		
		
		
		
		
		return count;
	}
	
	static int removeDups(int[] nums) {
		
		
		//two cases:
		//1. dups has
		//2. dups has not
		//0,0,1, 2, 2, 3, 3, 3, 4
		
		//i=0;
		//start = 0 a[i] = a[i+1]
		
		//i=1
		//start = 0 a[i] != a[i+1], if(a[start] != a[i+1])then, 
		//swap(start+1, i+1), 
		//start++
		//0,1,0,2,2,3,3,3,4
		
		//i=2
		//start = 1
		//a[i]!=a[i+1]
		//if(a[start] != a[i+1])then, 
		//swap(start+1, i+1), 
		//start++
		//0,1,2,0,2,3,3,3,4
		
		//i=3
		//start = 2
		//a[i] !=a[i+1]
		//if(a[start]==a[i+1])
		//don't swap
		//0,1,2,0,2,3,3,3,4
		
		//i=4
		//start = 2
		//a[i]!=a[i+1]
		//if(a[start]!=a[i+1]), then
		//swap(start+1, i+1),
		//start++
		//0,1,2,3,2,0,3,3,4
		
		//i=5
		//start = 3
		//a[i] !=a[i+1]
		//if(a[start]==a[i+1])
		//don't swap
		//0,1,2,3,2,0,3,3,4
		
		//i=6
		//start = 3
		//a[i]==a[i+1] //that means more then 2 occurrences for this element 
					   //and swapping is already done when the first occurrence is encountered 
		//don't swap
		//0,1,2,3,2,0,3,3,4
		
		//i=7
		//start = 3
		//a[i]!=a[i+1]
		//if(a[start]!=a[i+1])
		//swap(start+1, i+1)
		//start++
		//0,1,2,3,4,0,3,3,2
		
		
		//0,1,2,3,3,3,4
		int count = 1;
		int n = nums.length;
		int start = 0;
        
        if(n==0)
            return 0;
		
		for(int i=0;i<n-1;i++) {
			
			if((nums[i]!=nums[i+1]) && start == i) {			
				start++;
				count++;
			}
			else {				
					if(nums[start]!=nums[i+1]) {					
						int temp = nums[start+1];
						nums[start+1] = nums[i+1];
						nums[i+1] = temp;
					
						start++;
						count++;
					}				
				
			}		
			//System.out.println(Arrays.toString(nums));			
		}		
		return count;
	}
	
	public static void swap(int[] a, int x, int y) {
		
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
		
		
	}

	public static void main(String[] args) {

		int a[] = { 0, 1, 2, 2, 3, 3, 3, 4 };
		int b[] = {0,1,2,3,3,3,4};

		
		System.out.println(Arrays.toString(a));
		int n = removeDups(a);
		System.out.println(n);
		System.out.println(Arrays.toString(Arrays.copyOfRange(a, 0, n)));
		
		
		//System.out.println(removeDuplicatesAgain(a));
	}

}
