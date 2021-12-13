package strings;

//Adding a Character as Thousands Separator to Given Number in Java

public class AddingSeperator {

	public static void func(int num, char seperator) {
		
		String str;
		double dnum = num;
		
		dnum = dnum/1000;
		
		String sNum = String.valueOf(dnum);
		String sSep = String.valueOf(seperator);
		
		String res = sNum.replaceFirst("\\D", sSep);
	
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func(1234456,'-');
	}

}
