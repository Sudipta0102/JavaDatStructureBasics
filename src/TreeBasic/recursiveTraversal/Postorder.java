package TreeBasic.recursiveTraversal;

public class Postorder {

	Node root;
	
	void postorderTraversal(Node node) {
		
		if(node==null) {		
			return;			
		}
		
		postorderTraversal(node.left);
		postorderTraversal(node.right);
		System.out.println(node.key);
	}
	
	public static void main(String[] args) {

		Postorder tree = new Postorder();
		
		//Node root;
		
		// create root
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		tree.postorderTraversal(tree.root);
	}
	
	
}
