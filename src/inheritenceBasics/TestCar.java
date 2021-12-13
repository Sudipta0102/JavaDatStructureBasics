package inheritenceBasics;

public class TestCar {

	//inheritence is Has-a relationship.
	public static void main(String[] args) {

		// this is compile time polymorphism
		Car c = new Car();
		BMW b = new BMW();

		b.start();
		b.end();
		b.mileage();

		c.start();
		c.end();

		
		System.out.println("*******************");
		// up casting
		Car c1 = new BMW();// this is run time polymorphism

		c1.start();// it will access BMW start method
		c1.end();
		
/*
		// down casting
		BMW b1 = (BMW) new Car(); // exception-> class cast exception
*/
	}

}
