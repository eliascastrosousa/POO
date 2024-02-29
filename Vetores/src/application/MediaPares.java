package application;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de numeros: ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		double pares = 0;
		int qtd = 0;
		
		System.out.println("Digite os numeros: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextInt();
			if (vetor[i] % 2 == 0 ) {
				pares += vetor[i];
				qtd = i;
			}
		}
		double mediaPares = pares / qtd;
		
		if (qtd == 0) {
			System.out.println("NENHUM NUMERO PAR ");
		} else {
			System.out.printf("MEDIA DOS PARES = %.2f", mediaPares);
		}
		
		
		sc.close();
	}

}
