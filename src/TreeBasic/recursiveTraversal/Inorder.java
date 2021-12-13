package TreeBasic.recursiveTraversal;

public class Inorder {

	Node root;
	
	void inorderTraversal(Node node) {
		
		if(node==null) {
			return;			
		}
		inorderTraversal(node.left);
		System.out.println(node.key);
		inorderTraversal(node.right);
	}
	
	
	
	public static void main(String[] args) {

		Inorder tree = new Inorder();	
		// create root
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		tree.inorderTraversal(tree.root);
	}
	
}
