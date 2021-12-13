package DynamicProg.tabulation;

import java.util.ArrayList;

// I dunno how to code this now, need to come back in 15 days time.
//TimeStamp: 16thNovember, 2021 8:45PM
public class AllConstructTabulation {

	static ArrayList<ArrayList<String>> func(String[] sArr, String target){
		
		ArrayList<ArrayList<ArrayList<String>>> outer = new ArrayList<ArrayList<ArrayList<String>>>();
		
		for(int i=0;i<=target.length();i++) {
			if(i==0) {
				outer.add(new ArrayList<ArrayList<String>>());
			}
			outer.add(null);
		}
		
		System.out.println(outer);
		
		for(int i=0;i<=target.length();i++) {
			if(outer.get(i)!=null) {
				for(String str: sArr) {
					if(target.substring(i).startsWith(str)) {
						ArrayList<ArrayList<String>> inner = 
								new ArrayList<ArrayList<String>>(outer.get(i));
						ArrayList<String> innest = new ArrayList<String>();
						outer.get(i+str.length())
						
					}
				}
			}
		}
		
		return outer.get(target.length());
	}
	
	public static void main(String[] args) {
		String[] sArr = {"purp", "p","ur","le","purpl"};
		String target = "purple";
		
		System.out.println(func(sArr, target));
	}
}
