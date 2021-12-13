package arrays;

public class BinaryTree {

	static int root = 0;
	static String[] sArr = new String[10];
	
	public void root(String key) {
		
		sArr[0] = key;
		
	}
	
	public void setLeft(String key, int root) {
		
		int t = (2*root) + 1;
		
		if(sArr[root] == null) {
			
			System.out.println("can't set child at " + t);
			
		}
		else {
			
			sArr[t] = key;
		}
		
	}
	
	public void setRight(String key, int root) {
		
		int t = (2*root) + 2;
		
		if(sArr[root] == null) {
			
			System.out.println("can't set child at " + t);
			
		}
		else {
			
			sArr[t] = key;
		}
		
	}
	
	public void printTree() {
		for (int i = 0; i < 10; i++) {
			if (sArr[i] != null)
				System.out.print(sArr[i]);
			else
				System.out.print("-");
		}
	}

	public static void main(String[] args) {
		
		BinaryTree obj = new BinaryTree();
		
		obj.root("A");
		obj.setLeft("B", 0);
		//obj.setRight("C", 0);
		obj.setLeft("D", 1);
		obj.setRight("E", 1);
		obj.setLeft("F", 2);
		obj.printTree();
		
	}

}
