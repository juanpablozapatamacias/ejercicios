package com.jpablo.ejercicios.depthfirstsearch;

public class CountIslands {

	static int count(int [][] mx) {
		int count=0;
		int m = mx.length;
		int n = mx[0].length;
		
		for (int i=0;i<m;i++) {
			for (int j=0;j<n;j++) {
				if(mx[i][j]==1) {
					if ((i==0 || mx[i-1][j] == 0)&&
						(j==0 || mx[i][j-1] == 0))
						count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String [] argv) {
		int mat[][] =  {{0, 1, 0, 0, 0, 0, 1},  
         	   			{0, 1, 0, 1, 1, 0, 1},  
         	   			{0, 0, 1, 1, 0, 1, 0},
         	   			{0, 0, 0, 0, 1, 0, 1}};
		System.out.println("Number of islands " + count(mat));
	}
}
