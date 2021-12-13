package notun;

public class Hobbit {
	
	String name;
	
	public static void main(String[] args) {
		
		
		
		Hobbit[] h = new Hobbit[3];
		
		int x = 0;
		
		
		while(x<3) {
			
			h[x] = new Hobbit();
			
			h[x].name = "bilbo";
			
			if(x==1) {
				h[x].name = "frodo";
			}
			
			if(x==2) {
				h[x].name = "sam";
			}
			
			System.out.println(h[x].name);
			x = x+1; 
		}
	}

}
