package arrays;

import java.util.Arrays;

public class TwoDArraySortAcrossRows {

	public static void func(int[][] a) {

		// first sort a[0][0], a[0][1], a[0][2]
		// then a[1][0], a[1][1], a[1][2]
		// and lastly a[2][0], a[2][1], a[2][2]

		for (int l = 0; l < a.length; l++) {

			for (int i = 0; i <= a.length; i++) {

				for (int j = 0; j < a.length - 1; j++) {

					if (a[l][j] > a[l][j + 1]) {

						int temp = a[l][j];
						a[l][j] = a[l][j + 1];
						a[l][j + 1] = temp;

						System.out.println(Arrays.deepToString(a));
					}

				}
			}
		}
	}

	public static void main(String[] args) {

		int[][] toDarr = new int[3][3];

		toDarr[0][0] = 15;

		toDarr[0][1] = 10;

		toDarr[0][2] = 9;

		toDarr[1][0] = 37;

		toDarr[1][1] = 8;

		toDarr[1][2] = 2;

		toDarr[2][0] = 49;

		toDarr[2][1] = 30;

		toDarr[2][2] = 1;

		System.out.println(Arrays.deepToString(toDarr));

		System.out.println("--------------");

		System.out.println(toDarr[0][0] + "   " + toDarr[0][1] + "   " + toDarr[0][2]);
		System.out.println(toDarr[1][0] + "   " + toDarr[1][1] + "   " + toDarr[1][2]);
		System.out.println(toDarr[2][0] + "   " + toDarr[2][1] + "   " + toDarr[2][2]);

		System.out.println("--------------");

		System.out.println(toDarr.length);

//		System.out.println("--------------");
//		
//		//func(toDarr);
//		
//		Arrays.sort(toDarr);//classcastecxception
//		
//		//func(toDarr);
//		
//		System.out.println(toDarr[0][0]+"   "+toDarr[0][1]+"   "+toDarr[0][2]);
//		System.out.println(toDarr[1][0]+"   "+toDarr[1][1]+"   "+toDarr[1][2]);
//		System.out.println(toDarr[2][0]+"   "+toDarr[2][1]+"   "+toDarr[2][2]);

		System.out.println("--------------");

		func(toDarr);

		System.out.println(toDarr[0][0] + "   " + toDarr[0][1] + "   " + toDarr[0][2]);
		System.out.println(toDarr[1][0] + "   " + toDarr[1][1] + "   " + toDarr[1][2]);
		System.out.println(toDarr[2][0] + "   " + toDarr[2][1] + "   " + toDarr[2][2]);

	}

}

