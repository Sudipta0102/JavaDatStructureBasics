ackage TreeBasic.Tree50GFGLevel1;

import java.util.LinkedList;
import java.util.Queue;

public class MirrorTree {

	void mirrorFunc(Node root) {		
		if(root==null)
			return;		
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		mirrorFunc(root.left);
		mirrorFunc(root.right);
	}
	
	void leverOrder(Node root) {
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node temp = q.poll();
			System.out.print(temp.key+" ");
			
			if(temp.left!=null) {
				q.add(temp.left);
			}
			if(temp.right!=null) {
				q.add(temp.right);
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		MirrorTree obj = new MirrorTree();
		obj.leverOrder(root);		
		obj.mirrorFunc(root);		
		obj.leverOrder(root);
	}	
}
