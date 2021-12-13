package inheritenceBasics;

public class BMW extends Car{

	//start method overrides Car class start method.
	public void start() {
		//super.start();
		System.out.println("BMW start");
		//super.start();
		System.out.println(a+2);
	}
	
	public void mileage() {
		System.out.println("BMW mileage");
	}
	

}
