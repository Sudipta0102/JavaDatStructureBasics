package InterfaceBasics;
import inheritenceBasics.BMW;

public class AnyBank extends BMW implements Bank,Location {

	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("anybank credit");
	}

	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("anybank debit");
	}
	
    public void cashback() {
    	System.out.println("anybank cashback");
    }

	@Override
	public void country() {
		
		System.out.println("poopy");
		
	}

}
