package BackTracking;

import java.util.ArrayList;

public class GridTravelAllDirections {

	static ArrayList<String> func(String result, boolean[][] maze, int m, int n){
		
		ArrayList<String> l = new ArrayList<>();
		if(m==maze.length-1 && n==maze[0].length-1) {				
			l.add(result);
			return l;
		}
		
		if(!maze[m][n]) {			
			return l;
		}
		
		ArrayList<String> list = new ArrayList<String>();
		//by this I mean that I have been in this coordinate.
		
		maze[m][n] = false; 
		//down
		if(m<maze.length-1) {
			list.addAll(func(result+'D', maze, m+1, n));
		}
		//right
		if(n<maze[0].length-1) {
			list.addAll(func(result+'R', maze, m, n+1));
		}
		//diagonal
		//if(m<maze.length-1 && n<maze[0].length-1) {
		//	list.addAll(func(result+'d', maze, m+1, n+1));
		//}
		//up
		if(m>0) {
			list.addAll(func(result+'U', maze, m-1, n));
		}
		//left
		if(n>0) {
			list.addAll(func(result+'L', maze, m, n-1));
		}
		
		//here, this is the function end, I have been 
		//here and already marked that as false above and
		//at this point this particular function call will 
		//return the value to the previous function call.
		//Hence, For this particular path, the need for 
		//keeping track of already visited coordinate is 
		//no longer needed..so need to make way for another
		//path.
		//this is essentially backtracking
		maze[m][n] = true;
		
		return list;
	}
	
	
	
	public static void main(String[] args) {
		
		boolean maze[][]= {
				{true,true,true},
				{true,true,true},
				{true,true,true},
		}; 
		
		boolean maze1[][]= {
				{true,true},
				{true,true}				
		};
		
		System.out.println(func("", maze, 0, 0));
	}
}
