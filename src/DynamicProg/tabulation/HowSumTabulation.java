package DynamicProg.tabulation;

import java.util.ArrayList;

public class HowSumTabulation {
	
	static ArrayList<Integer> func2(int[] a, int targetSum){
		
		ArrayList<ArrayList<Integer>> outer = 
				new ArrayList<ArrayList<Integer>>(); 

		for(int i=0;i<targetSum;i++) {
			if(i==0)
				outer.add(new ArrayList<>());
			outer.add(null);
		}
		
		System.out.println(outer.size());
		for(int i=0;i<targetSum;i++) {
			if(outer.get(i)!=null) {
				for(int num:a) {
					if(num+i<=targetSum) {												
						ArrayList<Integer> inner1 = new ArrayList<>(outer.get(i));							
						inner1.add(num);
						outer.set(num+i, inner1);										
					}
				}						
			}
		}		
		System.out.println(outer);
		return outer.get(targetSum);
	}

	
	//this has bug
	//try int[] a = {5,7,4}; int target = 10; op: [5] not [5,5]
	static ArrayList<Integer> func1(int[] a, int targetSum){
		
		ArrayList<ArrayList<Integer>> outer = 
				new ArrayList<ArrayList<Integer>>(); 

		for(int i=0;i<targetSum;i++) {
			if(i==0)
				outer.add(new ArrayList<>());
			outer.add(null);
		}		
		//System.out.println(outer);
		//System.out.println(outer.size());
		
		for(int i=0;i<targetSum;i++) {
			if(outer.get(i)!=null) {
				for(int num:a) {
					if(num+i<=targetSum) {
						if(outer.get(num+i)==null) {
							ArrayList<Integer> inner1 = new ArrayList<>();
							inner1.add(num);
							outer.set(num+i, inner1);
						}else {
							ArrayList<Integer> inner2 = 
									new ArrayList<>(outer.get(i));
							inner2.add(num);
							System.out.println(inner2);
							outer.set(num+i, inner2);
						}				
					}
				}						
			}
		}		
		System.out.println(outer);
		return outer.get(targetSum);
	}

			
	public static void main(String[] args) {
		
		int[] a = {5,7,4};
		int target = 10;
		
		System.out.println(func2(a, target));		
	}
}
