package DynamicProg.tabulation;

public class Gridtraveler {

	static void func(int m, int n) {
		int[][] a = new int[m+1][n+1];
		
		a[0][0] = 0;//can be done without this cuz, default value is zero.
		a[1][1] = 1;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {				
				if(i<a.length-1) {
					a[i+1][j] = a[i+1][j] + a[i][j];			
				}	
				if(j<a[i].length-1) {
					a[i][j+1] = a[i][j+1] + a[i][j];
				}
			}
		}
		System.out.println(a[m][n]);
	}
	
	public static void main(String[] args) {	
		func(3, 3);
	}
}
