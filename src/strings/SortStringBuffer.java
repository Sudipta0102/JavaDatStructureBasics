package strings;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortStringBuffer implements Comparator<StringBuffer>{

	@Override
	public int compare(StringBuffer sb1, StringBuffer sb2) {
		
		return sb1.toString().compareToIgnoreCase(sb2.toString());
		
	}

	public static void main(String[] args) {
		
		 Set<StringBuffer> ss = new TreeSet<>(new SortStringBuffer());
		
		 ss.add(new StringBuffer("b"));
		 ss.add(new StringBuffer("a"));
		 ss.add(new StringBuffer("c"));
		 
		 System.out.println(ss);
	}
	
}
