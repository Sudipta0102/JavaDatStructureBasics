package arrayInterviewQuestions.Array50GFG.Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArrayWithGivenSum {

	// that's O(n^2)
	static void func(int[] a, int sum) {

		/*
		 * 1. Make a list 2. traverse the array 3. while doing that, check the the
		 * current number is below the sum 4. it yes, add it to the list.
		 * 
		 * 
		 */

		List<Integer> l = new ArrayList<>();
		int n = a.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {

			if (a[i] == sum) {

				l.add(a[i]);
				break;
			} else {

				l.add(a[i]);
				temp = temp + a[i];

				for (int j = i + 1; j < n; j++) {

					temp = temp + a[j];
					if (temp < sum) {

						l.add(a[j]);

					}

					else if (temp > sum) {

						l.clear();
						temp = 0;
						break;

					}

					else {

						l.add(a[j]);
						System.out.println(l);
						break;
					}
				}
			}
			if (temp == sum) {
				break;
			}
		}

	}

	// this is O(n) but doesn't work with negative elements
	static void funcAgain(int[] a, int sum) {

		int n = a.length;
		int sumNow = 0;
		int start = 0;
		int end = 0;

		/*
		 * 3 cases here 1. sum is equal 2. sum is less 3.sum is greater
		 */

		for (int i = 0; i < n; i++) {

			sumNow += a[i];

			if (sumNow == sum) {

				System.out.println("(" + start + "," + end + ")");
				break;

			}

			else if (sumNow < sum) {

				end++;
			}
			// here, trying to reset my start, end, i and sumNow;
			else {

				start++;
				end = start;
				i = start - 1;// because for loop's increament -1 is added,
				// should have used while
				sumNow = 0;

			}

		}

	}

	static void funcOnceAgain(int[] a, int sum) {

		int n = a.length;
		int sumNow = 0;
		int start = 0;
		int end = 0;

		/*
		 * 3 cases here 1. sum is equal 2. sum is less 3.sum is greater
		 */

		for (int i = 0; i < n; i++) {

			sumNow += a[i];

			if (sumNow == sum) {

				System.out.println("(" + start + "," + end + ")");
				break;

			}

			else if ((sumNow> 0 && sumNow < sum) ||(sumNow<0 && sumNow>sum)) {

				end++;
			}
			// here, trying to reset my start, end, i and sumNow;
			else {

				start++;
				end = start;
				i = start - 1;// because for loop's increament -1 is added,
				// should have used while
				sumNow = 0;

			}

		}

	}

	public static void main(String[] args) {

		int[] a = { -5, 10, -4, 8, 0, -4, -3 };
		int[] b = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(Arrays.toString(a));

		funcAgain(b, 15);

	}

}