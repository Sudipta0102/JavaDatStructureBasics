package strings;

public class ConvertStringToObject {

	public static void main(String[] args) {
		
		String s = "I am me";
		
		//Assigning string to an object
		Object obj = s;
		
		//to check the data type of the object to confirm that s has been stored in object
		System.out.println("datatype of the variable in object is: "+ obj.getClass().getName());
		System.out.println("object is: "+obj);
		

	}

}
