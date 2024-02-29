package application;

import java.util.Locale;
import java.util.Scanner;


public class NumerosPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de numeros: ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		System.out.println("Digite os numeros: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextInt();
		}
		int qtd = 0;
		System.out.println("NUMEROS PARES: ");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.printf("%d ", vetor[i]);
				qtd++;
			}
		}
		System.out.printf("\nQUANTIDADE DE PARES = %d", qtd);

		sc.close();
	}

}
