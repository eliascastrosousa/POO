package application;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de numeros: ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		int maior = 0;
		int posicao = 0;
		
		System.out.println("Digite os numeros: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextInt();
			if (vetor[i] > maior ) {
				maior = vetor[i];
				posicao = i;
			}
		}
		
		System.out.println("MAIOR VALOR = " + maior);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
		
		sc.close();
	}

}
