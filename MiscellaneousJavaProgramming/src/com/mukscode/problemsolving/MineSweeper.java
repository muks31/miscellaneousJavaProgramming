package com.mukscode.problemsolving;

public class MineSweeper {

	public static void main(String[] args) {
		
		int[][] bomb1 = {{0,2}, {2,0}};
		FindmineSweeper(bomb1, 3, 3);
	}
	public static int[][] FindmineSweeper(int[][] bombs, int numRows, int numCols){
		int [][] field = new int[numRows][numCols];
		for(int[] bomb : bombs) {
			int rowIndex = bomb[0];
			int colIndex = bomb[1];
			
			field[rowIndex][colIndex] = -1;
			for(int i = rowIndex-1; i<rowIndex + 2; i++ ) {
				for(int j = colIndex - 1; j < colIndex + 2; j++) {
					if(0 <= i && i < numRows && 0 <= j && j < numCols && field[i][j] != -1) {
						field[i][j] += 1;
					}
				}
			}
		}
		
		return field;
		
	}

}
