package BackTracking;

import java.util.HashMap;

public class GridTraveler {

	
	static int gridTravel(int m, int n) {		
		
		if(m==1 || n==1) {
			return 1;
		}
		
		int left = gridTravel(m-1, n);
		int right = gridTravel(m, n-1);
		
		
		
		return left+right;
	}

	
	
	public static void main(String[] args) {
		
		HashMap<HashMap<Integer, Integer>, Integer> hm = 
				new HashMap<HashMap<Integer, Integer>, Integer>();
		
		System.out.println(gridTravel(1,1));
		
	}
}
