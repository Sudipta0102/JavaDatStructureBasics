package DynamicProg.tabulation;

import java.util.ArrayList;
//refer to the freecodecamp dynamic programming video. 
public class BestSumTabulation {

	static ArrayList<Integer> func(int[] a, int targetSum){
		
		ArrayList<ArrayList<Integer>> outer = 
				new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<targetSum;i++) {
			if(i==0)
				outer.add(new ArrayList<>());
			outer.add(null);			
		}
		
		for(int i=0;i<targetSum;i++) {
			if(outer.get(i)!=null) {
				for(int num:a) {
					if(num+i<=targetSum) {
						ArrayList<Integer> inner = 
								new ArrayList<Integer>(outer.get(i));
						inner.add(num);				
						if(outer.get(num+i)==null || 
								(/*outer.get(num+i)!=null &&*/ outer.get(num+i).size()>inner.size())) {
							outer.set(num+i, inner);
						}			
						
					}	
				}
			}
		}		
		System.out.println(outer);		
		return outer.get(targetSum);
		
	}
	
	public static void main(String[] args) {
	
		int a[] = {2,4,5};
		int target = 20;
		
		System.out.println(func(a, target));
		
	}
}
