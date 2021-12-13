package notun;

public class IncrementDcrementExercise {
	
	static void go() {
		int y = 7;
		
		for(int x = 1;x<4;x++) {
			
			y++;//10
			if(x>1) {
				System.out.println(++y);
			}
			
			
		}
		
		//System.out.println(y);
	}

	public static void main(String[] args) {


		go();

	}

}
