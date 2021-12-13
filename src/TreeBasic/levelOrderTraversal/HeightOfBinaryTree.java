package TreeBasic.levelOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfBinaryTree {	
	int getHeight(Node root) {
		
		if(root==null)
			return 0;
		
		int left = getHeight(root.left);
		int right = getHeight(root.right);
		
		return 1+Math.max(left, right);		
	}
	
	int getHeightIterative(Node root){
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		int height = 0;
		
		while(true) {
			//this will eventually hold node count at every level
			int nodeCount = q.size();
			//node count is zero means there are no more levels to explore
			if(nodeCount == 0) {
				return height;
			}			
			height++;
			
			while(nodeCount>0) {		
				Node temp = q.poll();
				if(temp.left!=null) {
					q.add(temp.left);
				}
				if(temp.right!=null) {
					q.add(temp.right);
				}				
				nodeCount--;
			}			
		}		
	}
	
	void levelOrderTraversal(Node root) {
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()) {
			
			Node cur = q.poll();
			System.out.println(cur.data);
			
			if(cur.left!=null) {
				q.add(cur.left);
			}
			if(cur.right!=null) {
				q.add(cur.right);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Node node = new Node(1);
		
		node.left = new Node(2);
		node.right = new Node(3);
		node.left.left = new Node(4);
		node.left.right = new Node(5);
		node.left.right.left = new Node(6);
		
		HeightOfBinaryTree obj= new HeightOfBinaryTree();
		
		//System.out.println(obj.getHeight(node));
		//obj.levelOrderTraversal(node);
		System.out.println(obj.getHeightIterative(node));
		
	}
}
