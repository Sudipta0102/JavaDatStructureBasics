package DivideAndConquer;


import java.util.Arrays;


public class NumberFactor {

	public static int[] twoSum(int[] nums, int target) {

		int a[] = new int[2];
	
		for (int i = 0; i < nums.length-1; i++) {

			System.out.println(nums[i]);
			
			for (int j = i + 1; j <=nums.length-1 ; j++) {

				System.out.println(nums[j]);
				
				if (nums[i] + nums[j] == target) {

					a[0] = i;
					a[1] = j;

					break;

				}

			}

		}

		return a;

	}

	public static void main(String[] args) {

		int[] a = { 3, 2, 4 };

		int n = 6;

		int b[] = twoSum(a, 6);

		
		System.out.println(Arrays.toString(b));
	}
}
