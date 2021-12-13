package BackTracking;

public class GrisWithObstacles {

	static void func(String result, boolean[][] maze, int m, int n) {
		if(m==maze.length-1 && n==maze[0].length-1) {
			System.out.println(result);
			return;
		}
		if(!maze[m][n]) {
			return;
		}
		if(m<maze.length-1)
			func(result+'D', maze, m+1, n);
		if(n<maze[0].length-1)
			func(result+'R', maze, m, n+1);
	}
	
	public static void main(String[] args) {
		
		boolean maze[][]= {
				{true,true,true},
				{true,false,true},
				{true,true,true},
				{true,true,true},
		}; 

		System.out.println(maze.length);
		
		//that false means you can't step on it, 
		//because she cried you a river the other day
		//that's on that coordinate. 
		
		func("", maze, 0, 0);
		
	}
}
