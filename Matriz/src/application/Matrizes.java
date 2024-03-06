package application;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				
				int n = sc.nextInt();
				int [][] mat = new int[n][n];
				
				for (int i = 0; i < n; i++) {
						
					for (int j = 0; j < n; j++) {
						mat[i][j] = sc.nextInt();
					}
				}
				
				for (int i = 0; i < n; i++) {
					System.out.println();
					for (int j = 0; j < n; j++) {
						System.out.print(mat[i][j]+ " ");
					}
				}
				
				int negative = 0;
				
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						if (mat[i][j] < 0) {
							negative++;
						}
					}
				}
				System.out.println("\n\nQtd de numeros negativos: "+negative);
				
				sc.close();
	}

}
