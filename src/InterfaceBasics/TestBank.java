package InterfaceBasics;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnyBank a = new AnyBank();
		a.credit();
		a.debit();
		a.cashback();
		a.country();
		System.out.println(a.m);
		System.out.println(AnyBank.m);
		
		//dynamic polymorphism i.e. child class object referred by parent class 
		Bank b = new AnyBank();
		b.credit();
		b.debit();
		System.out.println(b.m);
		
		a.start();
		a.end();
		a.mileage();
	}

}
