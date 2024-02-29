package application;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos valores vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vetorA = new double[n];
		double soma = 0;
		double mediaVetor = 0;
		
		
		System.out.println("Digite os valores do vetor ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
			soma += vetorA[i];
		}
		
		mediaVetor = soma/vetorA.length;
		System.out.println("MEDIA DO VETOR = " + mediaVetor);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] < mediaVetor) {
				System.out.printf("%.2f",vetorA[i]);
			}
		}
		
		
		
		sc.close();

	}

}
