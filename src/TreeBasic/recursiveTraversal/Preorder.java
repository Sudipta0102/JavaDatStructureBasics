package TreeBasic.recursiveTraversal;


public class Preorder {

	Node root;
	
	void preorderTraversal(Node node) {
		
		if(node==null) {	
			return;	
		}
		
		System.out.println(node.key);
		preorderTraversal(node.left);
		preorderTraversal(node.right);
		
	}
	
	
	
	
	public static void main(String[] args) {

		Preorder tree = new Preorder();
		
		//Node root;
		
		// create root
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		
		
		tree.preorderTraversal(tree.root);
	}
	
}
