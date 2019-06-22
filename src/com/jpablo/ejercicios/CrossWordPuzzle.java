package com.jpablo.ejercicios;

public class CrossWordPuzzle {

	// Rows and columns in given grid
	static int R, C;
	
	// Arrays for searching in all 8 direction
	static int[] x = {-1, -1, -1, 0, 0, 1, 1, 1};
	static int[] y = {-1, 0, 1, -1, 1, -1, 0, 1};
	
	// method to search in all 8 directions
	static boolean search2D(char[][] grid, int row, int col,String word) {
		boolean result=false;
		int k;
		int rd;
		int cd;
		
		// In case that 1st char does not match
		if(grid[row][col] != word.charAt(0)) return result;
		
		// takes the word length for the search
		int len = word.length();
		
		// for loop to search word in all 8 dirs
		for(int dir=0;dir<8;dir++) {
			// initialize rows ans cols directions
			
			rd = row + x[dir];
			cd = col + y[dir];
			
			// loop to match the remaining chars		
			for(k=1;k<len;k++) {
				// in case of out of bound, break
				if(rd >= R || rd <0 || cd >= C|| cd <0) break;
				
				// in case of mismatch, break
				if(grid[rd][cd] != word.charAt(k)) break;
				
				// moving in particular direction
				rd += x[dir];
				cd += y[dir];
			}
			
			// if all chars are matched, then value must be equal to word len
			if(k == len) result = true;
		}
		return result;
	}
	
	static void patternSearch(char[][] grid, String word) {
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				if(search2D(grid,i,j,word)) {
					System.out.println("Pattern found at " + i + ", " + j);
				}
				//else System.out.println("Pattern not found");
			}
		}
	}
	
	public static void main(String[] arg) {
		R=3;C=13;
		
		char[][] grid = {{'G','E','E','K','S','F','O','R','G','E','E','K','S'}, 
                {'G','E','E','K','S','Q','U','I','Z','G','E','E','K'}, 
                {'I','D','E','Q','A','P','R','A','C','T','I','C','E'}};
		
		patternSearch(grid,"GEEKS");
		System.out.println();
		patternSearch(grid,"EEE");
	}
}
