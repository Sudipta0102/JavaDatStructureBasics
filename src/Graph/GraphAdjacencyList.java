package Graph;

import java.util.LinkedList;
import java.util.List;

public class GraphAdjacencyList {

	class Edge{
		int v, w;
		public Edge(int v, int w) {
			
			this.v = v;
			this.w = w;
			
		}
		
		public String toString() {
			
			return "("+v+","+w+")";
			
		}
	}
	
	List<Edge> l[];
	
	public GraphAdjacencyList(int n) {
 		
		l = new LinkedList[n];
		
		for(int i=0;i<l.length;i++) {
			
			l[i] = new LinkedList<Edge>();
			
		}
		
	}
	
	public void addEdge(int u, int v, int w) {
		
		l[u].add(0, new Edge(v, w));
		
	}
	
	public String toString() {
		
		String result = "";
		
		for(int i=0;i<l.length;i++) {
			
			result+=i+"-->"+l[i]+"\n";
			
		}
		
		return result;
		
	}
	
	
	public static void main(String[] args) {
		
		GraphAdjacencyList graph = new GraphAdjacencyList(6);
		/*
		graph.addEdge(0, 1, 0);
		graph.addEdge(0, 4, 0);
		graph.addEdge(1, 0, 0);
		graph.addEdge(1, 2, 0);
		graph.addEdge(1, 3, 0);
		graph.addEdge(1, 4, 0);
		graph.addEdge(2, 1, 0);
		graph.addEdge(2, 3, 0);
		graph.addEdge(3, 1, 0);
		graph.addEdge(3, 2, 0);
		graph.addEdge(3, 4, 0);
		graph.addEdge(4, 0, 0);
		graph.addEdge(4, 1, 0);
		graph.addEdge(4, 3, 0);
		*/
		
		graph.addEdge(5, 0, 0);
		graph.addEdge(5, 2, 0);
		graph.addEdge(4, 0, 0);
		graph.addEdge(4, 1, 0);
		graph.addEdge(2, 3, 0);
		graph.addEdge(3, 1, 0);
		
		System.out.println(graph);
	}
}
