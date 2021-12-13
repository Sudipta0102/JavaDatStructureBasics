package strings;

public class CompareLexicographically {

	public static void main(String[] args) {

			String s1 = "ram";
			String s2 = "Rom";
			
			System.out.println(s1.compareTo(s2));
			System.out.println(s1.compareToIgnoreCase(s2));
			
			String s3 = "Jodu";
			
			System.out.println(s1.compareTo(s3));
		

	}

}
