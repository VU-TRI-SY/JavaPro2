package tut1;

import java.util.Scanner;

public class Ex7_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int R, C;
		int[][] M, T;
		System.out.print("Enter the number of rows and columns of matrix: "); 
		R = sc.nextInt();
		C = sc.nextInt();
		
		M = new int[R][C];
		T = new int[C][R];
		
		System.out.println("Enter the matrix: ");
		for(int i = 0; i < R; i++) {
			for(int j = 0; j < C; j++) {
				M[i][j] = sc.nextInt();
			}
		}
		
		//-----------------------------------
		for(int i = 0; i < C; i++) {
			for(int j = 0; j < R; j++) {
				T[i][j] = M[j][i];
			}
		}
		
		System.out.println("The matrix: ");
		for(int i = 0; i < R; i++) {
			for(int j = 0; j < C; j++) {
				System.out.printf("%4d ", M[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("The transpose:");
		for(int i = 0; i < C; i++) {
			for(int j = 0; j < R; j++) {
				System.out.printf("%4d ", T[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}
}
