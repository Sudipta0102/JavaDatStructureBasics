package recursion.recursionPracticeSet1;

import java.util.Arrays;

import sun.jvm.hotspot.oops.RetData;

public class Example2 {
	
	static int getMinIdx(int[] a, int start, int end) {
		
		int n = a.length;
		int small = Integer.MIN_VALUE;
		int minIdx = 0;
		
		for(int i=start;i<end;i++) {
				
				if(small>a[i]) {
					
					small = a[i];
					minIdx = i;
					
				}		
		}
		return minIdx;
	}
	
	public static void actualSorting(int[] a, int startIdx, int endIdx) {
		
		if(startIdx>endIdx) {
			
			return;
			
		}
		
		int temp;
		int minIdx;
		
		minIdx = getMinIdx(a, startIdx, endIdx);
		
		temp = a[startIdx];
		a[startIdx] = a[minIdx];
		a[minIdx] = temp;
		
		
		actualSorting(a, startIdx+1, endIdx);
		
	}

	public static void main(String[] args) {

			
		int[] a = {3,1,5,2,3,4,2,7,6,5,8};
		
		System.out.println(Arrays.toString(a));
		
		actualSorting(a, 0, a.length-1);
		
		System.out.println(Arrays.toString(a));

	}

}
