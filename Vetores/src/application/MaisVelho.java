package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class MaisVelho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		int maisVelho = 0;
		
		String nome = null ;
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.printf("Dados da %d a pessoa:", i+1);
			System.out.println("\nNome: ");
			nomes[i] = sc.next();
			System.out.println("Idade: ");
			idades[i] = sc.nextInt();
			if ( idades[i] > maisVelho) {
				maisVelho = idades[i];
				nome = nomes[i];
			}
		}
		System.out.printf("PESSOA MAIS VELHA: %s IDADE: %d", nome, maisVelho );
		
	}

}
