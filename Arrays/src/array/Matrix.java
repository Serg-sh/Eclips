package array;

import java.util.Scanner;

public class Matrix {

	private double kbInteger(String message) {
		System.out.print(message + ": ");
		int rez = new Scanner(System.in).nextInt();
		return rez;
		}
	private int[][] inArray(){
		System.out.println("¬ведите массив:");
		int x= (int) kbInteger("Input X: "+"\n");
		int y= (int) kbInteger("Input Y: "+"\n");
		int[][]arr = new int[x][y];
		for (int j = 0; j <= y - 1; j++) {
			for (int i = 0; i <= x-1; i++) {
				if (j==0||j==y-1){
					arr[i][j] = 1;
				}
				else if (j>0 & j<y-1){
					arr[i][j] = 0;
				}
				
					
					
				}
			}
		
		
		
		
		return arr;
		}
	private void outMatrix(int[][]arr){
		
		
	}
	
	private void outAll(){
		outMatrix(inArray());		
	}
		
	public static void main(String[] args) {
		new Matrix().outAll();
	

	}

}
