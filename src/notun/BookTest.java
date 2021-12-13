package notun;

public class BookTest {

	public static void main(String[] args) {
		
		
		Book[] myBook = new Book[3];
		
		int x = 0;
		
		// when the following is not done then null pointer exception because 
		// if book reference variable is array type, then each element 
		// of that array has null reference, unless you explicitly 
		// assign them to the book object. 
		myBook[0] = new Book();
		myBook[1] = new Book();
		myBook[2] = new Book();
		
		myBook[0].title = "book1";
        myBook[0].author = "author1"; 
        
        myBook[1].title = "book2";
        myBook[1].author = "author2";
        
        myBook[2].title = "book3";
        myBook[2].author = "author3";
        
        while(x<3) {
        	
        	System.out.print(myBook[x].title);
        	System.out.print(" by ");
        	System.out.println(myBook[x].author);
        	
        	x= x+1;
        }
	}

}
