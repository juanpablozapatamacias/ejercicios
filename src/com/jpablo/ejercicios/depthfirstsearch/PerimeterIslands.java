package com.jpablo.ejercicios.depthfirstsearch;

public class PerimeterIslands {
/*
	private int islandPerimeterHelper (int row, int col, 
			int[][] grid, boolean [][] visited) {
		int m = grid.length;
		int n = grid[0].length;
		
		if(row < 0 || row >= m || col < 0 || col >= n) return 1;
		
		if(grid[row][col] == 0) return 1;
		
		if(visited[row][col] == true) return 1;
		
		visited[row][col] = true;
		
		return islandPerimeterHelper(row - 1, col, grid, visited) 
			 + islandPerimeterHelper(row + 1, col, grid, visited)
			 + islandPerimeterHelper(row, col - 1, grid, visited)
			 + islandPerimeterHelper(row, col + 1, grid, visited);
	}
*/	
	public int islandPerimeter(int [][] grid) {
		if(grid == null || grid.length == 0) return 0;
		
		int m = grid.length;
		int n = grid[0].length;
		
		int perimeter = 0;
		
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(grid[i][j]==1) {
					if(i>0 && grid[i-1][j] == 1) perimeter-=2;
					if(j>0 && grid[i][j-1] == 1) perimeter-=2;
					perimeter += 4;
				}
			}
		}
		
		return perimeter;
	}
	
	public static void main(String[] arg) {
		int mat[][] = {{1, 1, 1, 0},  
                	   {0, 1, 0, 0},  
                	   {0, 0, 0, 0},
                	   {0, 0, 0, 0}}; 
        PerimeterIslands p = new PerimeterIslands();       
		System.out.println(p.islandPerimeter(mat)); 
	}
}
