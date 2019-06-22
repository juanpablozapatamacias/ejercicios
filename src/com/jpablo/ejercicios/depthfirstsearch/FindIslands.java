package com.jpablo.ejercicios.depthfirstsearch;

public class FindIslands {
	static void findIslands(int [][] mx, boolean [][] v, int a, int b) {
		try {
			if(mx[a][b] == 1 && !v[a][b]) {
				v[a][b]=true;
				// southwest
				//if(b>0 && a<mx.length-1)
					//findIslands(mx,v,a+1, b+1);
				
				//south
				if(a < mx.length-1) {
					findIslands(mx,v,a+1,b);
					//perimeterIslands(mx);
					//southeast
					//if(b < mx.length-1)
						//findIslands(mx,v,a+1,b+1);
				}
				
				//East
				if(b < mx[0].length-1) 
					findIslands(mx,v,a,b+1);
					//perimeterIslands(mx);
				
				// North
				if(a >=1)
					findIslands(mx,v,a-1,b);
				
				// West
				if(b>=1)
					findIslands(mx,v,a,b-1);
			}
		}
		catch(ArrayIndexOutOfBoundsException e){}
	}
	
	static int countIslands(int [][] mx){
		int total = 0;
		int nRows = mx.length;
		int nCols = mx[0].length;
		boolean[][] visited = new boolean[nRows][nCols];
		
		for(int i=0; i<nRows; ++i) {
			for(int j=0; j<nCols; ++j) {
				visited[i][j] = false;
			}
		}
		
		for(int i=0; i<nRows; i++) {
			for(int j=0; j<nCols; j++) {
				if(mx[i][j] == 1 && !visited[i][j]) {
					findIslands(mx,visited,i,j);
					
					++total;
				}
			}
		}
		return total;
	}
	
	public static int perimeterIslands(int [][] mx) {
		int perimeter =0;
		int m = mx.length;
		int n = mx[0].length;
		
		if(mx == null || mx.length == 0) return 0;
		
		for(int i=0;i<m;i++) {
			for (int j=0;j<n;j++) {
				if(i>0 && mx[i-1][j] == 1) perimeter-=2;
				if(j>0 && mx[i][j-1] == 1) perimeter-=2;
				perimeter+=4;
			}
		}
		System.out.println("Perimeter = " + perimeter);
		return perimeter;
	}
	
	
	public static void main(String[] ar) {
	/*	int[][] mx = {
        		{0,0,0,0,0}, 
        		{0,1,1,1,0}, 
        		{0,1,0,1,0}, 
        		{0,1,1,1,0}, 
        		{0,0,0,0,0}, 
        		{1,0,0,0,0} 
        };*/
		int[][] mx = {
        		{1,1,0,0,0}, 
        		{1,1,0,0,0}, 
        		{0,0,1,0,0},
        		{0,0,0,1,1}
        };
		
		System.out.println("El total de islas son: " + countIslands(mx));
	}
}
