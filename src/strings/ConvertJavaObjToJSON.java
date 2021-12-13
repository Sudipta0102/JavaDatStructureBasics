package strings;

public class ConvertJavaObjToJSON {
	
	public static JsonObject getObjData(JsonObject obj) {
		
		obj.setName("me");
		obj.setDesc("outcast");
		obj.setEmployees(12);
		
		return obj;
	}

	public static void main(String[] args) {

		JsonObject object = new JsonObject();
		
		object = getObjData(object);
		
		 
		

	}

}
