package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	
		
		System.out.println("Digite a quantidade de linhas da matriz: ");
		int linhas = sc.nextInt();
		System.out.println("Diugite a quantidade de colunas da matriz: ");
		int colunas = sc.nextInt();
		
		int [][] mat = new int[linhas][colunas];
		
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				mat[i][j]= sc.nextInt();
			}
		}
		
		for (int i = 0; i < linhas; i++) {
			System.out.println();
			for (int j = 0; j < colunas; j++) {
				System.out.print(mat[i][j] + " ");
			}
		}
		
		
		String position = "null";
		int left = 0;
		int right = 0;
		int down = 0;
		
		System.out.println("\n\nDigite o numero a ser pesquisado: ");
		int num = sc.nextInt();
		
		
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if (num == mat[i][j]) {
					position = i+","+j;
					left = mat[i][j-1];
					// colocar um if aqui para pegar excessoes de nao existencia
					right = mat[i][j+1];
					down = mat[i+1][j];
				}
			}
		}
		
		System.out.println("\nPosition " + position);
		System.out.println("left " + left);
		System.out.println("right " + right);
		System.out.println("down " + down);
		
		
		
		
		
		
		
		
		sc.close();
	}

}
