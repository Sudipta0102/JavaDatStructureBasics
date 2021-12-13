package TreeBasic.IterativeTraversal;

import java.util.Stack;

public class Inorder {
	Node root;
	
	void inorderTraversal() {
		if(root==null) {			
			return;					
		}				
		Stack<Node> s = new Stack<Node>();		
		Node cur = root;	
		while(cur!=null || s.size()>0) {		
			while(cur!=null) {			
				s.push(cur);
				cur = cur.left;			
			}			
			cur = s.pop();			
			System.out.print(cur.data+" ");			
			cur = cur.right;
		}
		System.out.println();		
	}
	
	
	public static void main(String[] args) {
		
		Inorder tree = new Inorder();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		tree.inorderTraversal();
		
		//System.out.println();
	}
}
