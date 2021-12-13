package notun;

public class MethodChaining {
	
	private int a;
	
	public MethodChaining() {
		System.out.println("This is sparta...I mean constructor");
	}

	public MethodChaining intVal(int a) {
		
		this.a = a;
		//return this.a;
		return this;
		
	}
	
	public void displayInt() {
		
		System.out.println(a);
		
	}
}
