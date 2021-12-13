package arrayInterviewQuestions;

import java.util.Arrays;

public class MergeWeird {

	//idea is to keep the second array always sorted. 
	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		int i = 0;
		int j = 0;
		// int k = 0;
		int jLen = nums2.length;
			
		while (jLen!=0 && i<m+n) {

			if (nums1[i] <= nums2[j] && nums1[i] == 0 && i>m-1) {
				nums1[i] = nums2[j];
				i++;
				j++;
			} else {
				//1. this is for 1st array
				while (nums1[i] <= nums2[j] && i<m)
					i++;
				//2nd array
				while (j < n && nums1[i] > nums2[j]) {
					j++;
				}

				if (i<m) {
					// swap(nums1[i], nums2[j])
					int temp = nums1[i];
					nums1[i] = nums2[j - 1];
					nums2[j - 1] = temp;

					j = 0;

				}
			}

			System.out.println(Arrays.toString(nums1));
			System.out.println(Arrays.toString(nums2));
		}
		System.out.println(Arrays.toString(nums1));
	}

	public static void main(String[] args) {

		//int a[] = {-1,0,0,3,3,3,0,0,0};
		//int b[] = {1,2,2};
		//int[] a= {1};
		//int[] b= {};
		//int[] a = {0,0,3,0,0,0,0,0,0};
		//int[] b = {-1,1,1,1,2,3};
		//int[] a = {-1,-1,0,0,0,0};
		//int[] b = {-1,0};
		
		
		merge(a, a.length-b.length, b, b.length);

	}

}
