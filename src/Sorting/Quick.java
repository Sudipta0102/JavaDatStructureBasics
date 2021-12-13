package Sorting;

public class Quick {

	static int partition(int a[], int lb, int ub) {

		//int pivot = getPivot(a, lb, ub);
		int pivot = lb;
		int start = lb;
		int end = ub;

		while (start < end) {

			while (a[start] < a[pivot]) {

				start++;

			}

			while (a[end] > a[pivot]) {

				end--;

			}

			if (start < end) {
			
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}

		}
		int temp1 = a[pivot];
		a[pivot] = a[end];
		a[end] = temp1;

		return end;
	}

	static int getPivot(int[] a, int lb, int ub) {

		return (int) (Math.random() * (ub - lb));

		// System.out.println(pivot);
	}

	static void quickSort(int[] a, int lb, int ub) {

		if (lb < ub) {

			
			//System.out.println(partition(a, lb, ub));
			int loc = partition(a, lb, ub);
			quickSort(a, lb, loc - 1);
			quickSort(a, loc + 1, ub);
		}

	}

	public static void main(String[] args) {

		int[] arr = { 7, 7, 5, 9, 2, 1, 15, 7 };

		int n = arr.length;

		quickSort(arr, 0, n-1);

		for (int i = 0; i < n; i++) {

			System.out.print(arr[i] + " ");

		}

		System.out.println();

		//System.out.println(getPivot(arr, 0, n - 1));

	}

}
