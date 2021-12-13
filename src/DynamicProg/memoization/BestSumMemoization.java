package DynamicProg.memoization;

import java.util.ArrayList;


public class BestSumMemoization {

	static ArrayList<Integer> bestSum(int[] a, int targetSum, ArrayList<Integer> l) {
		
		if(targetSum==0) {
			return l;
		}	
		if(targetSum<0) {		
			return null;
		}		
		
		ArrayList<Integer> shortestList = null;
		
		for(int i: a) {		
			int rem = targetSum-i;
			ArrayList<Integer> temp = bestSum(a, rem, l);		
			//temp.add(i);
			if(temp!=null) {
				temp.add(i);
				ArrayList<Integer> shorter = temp;
				//shorter.add(i);
				if(shortestList==null || shortestList.size()>shorter.size()) {		
					//System.out.print(shortestList.isEmpty()+" ");
					//System.out.print(shortestList.size()+" ");
					//System.out.print(shorter.size()+" ");
					//System.out.println();
					
					shortestList = shorter;
					
				}
				
			}
			
		}
		
		
		return shortestList;
	}
	
	static int sumArray(ArrayList<Integer> l) {		
		int s = 0;		
		for(Integer i: l) {		
			s+=i;			
		}	
		return s;
	}
	
	public static void main(String[] args) {
		
		int[] a = {2,3,5};
		int targetSum = 8;
		ArrayList<Integer> l = new ArrayList<>();
		//ArrayList<Integer> res = null;
		
		//int size = 0;
		
		ArrayList<Integer> result = bestSum(a, targetSum, l);		
		System.out.println(result);
		
		
	}
	
}
