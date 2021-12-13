package tree.binaryTree;

public class CreateBinaryTree {

	Node root;
	
	public CreateBinaryTree() {
		
		root = null;
		
	}
	
	public CreateBinaryTree(int key){
		
		root = new Node(key);
		
	}
	
	public static void main(String[] args) {
		
		CreateBinaryTree tree = new CreateBinaryTree();
		
		//create root
		tree.root = new Node(1);
		
		/* after creating root, tree looks like this 
		 *      1 
		 *     / \
		 * null   null
		 * 
		 */
		
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		/*
		 * Now it looks like this,
		 * 
		 *                 1
		 *               /  \
		 *              /    \
		 *             /      \
		 *            2        3
		 *           / \      / \
		 *      null null  null null
		 */
		
		tree.root.left.left = new Node(4);
		
		/*
		 * Now it looks like this,
		 * 
		 *                 1
		 *               /  \
		 *              /    \
		 *             /      \
		 *            2        3
		 *           / \      / \
		 *          4  null null null
		 *         / \ 
		 *      null null  
		 *          
		 */
		
	}
	
}
