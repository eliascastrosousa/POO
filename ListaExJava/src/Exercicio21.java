/*Fa�a um algoritmo que, lendo 3 n�meros correspondentes aos coeficientes a, b, e c de uma equa��o do 2� grau, calcule
seu DELTA e tamb�m as ra�zes desta equa��o, imprimindo seus valores. */

import java.util.Scanner;

public class Exercicio21 {
	
	public void run() {
		
		System.out.println("\n Fa�a um algoritmo que, lendo 3 n�meros correspondentes aos coeficientes a, b, e c de uma equa��o do 2� grau, calcule\n"
				+ "seu DELTA e tamb�m as ra�zes desta equa��o, imprimindo seus valores. \n");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor inteiro: ");
		int A = input.nextInt();
		System.out.print("Digite um valor inteiro: ");
		int B = input.nextInt();
		System.out.print("Digite um valor inteiro: ");
		int C = input.nextInt();
		
		int delta = B*B - 4*A*C; 
		System.out.print("delta igual a "+delta);
		
		
		

		
		//System.out.println("O valor lido foi: " + valor);
		
	}

}
