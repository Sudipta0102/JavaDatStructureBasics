package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;

public class ConvertJSONArraToStringArray {
	
	public static void func(JSONArray jArr) {
		
		String[] sArr = new String[jArr.length()];
		
		for(int i=0;i<sArr.length;i++) {
			
			sArr[i] = jArr.getString(i);
			
		}
		
		System.out.println(Arrays.toString(sArr));
	}

	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<String>();
		
		ls.add("wqe");
		ls.add("try");
		ls.add("iuo");
		ls.add("sad");
		
		JSONArray jArr = new JSONArray(ls);

		jArr.get(0);
		jArr.get(1);
		jArr.get(2);
		jArr.get(3);
		
		System.out.println(jArr);
		System.out.println(jArr.length());
		
		System.out.println("----------");
		
		func(jArr);
		

	}

}
