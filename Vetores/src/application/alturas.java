package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class alturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de pessoas: ");
		int n = sc.nextInt();
		
		Pessoa[] p = new Pessoa[n];
		double alturaGeral = 0;
		int menor16 = 0;
		
		for (int i = 0; i < p.length; i++) {
			System.out.println("Dados da 1a pessoa: ");
			
			System.out.println("Nome:");
			String name = sc.next(); 
			
			System.out.println("Idade:");
			int idade = sc.nextInt();
			
			System.out.println("Altura:");
			double altura = sc.nextDouble();
			
			p[i] = new Pessoa(name, idade, altura);
			
			alturaGeral += p[i].getAltura();
			
			if (p[i].getIdade() <16) {
				menor16++;
			}	
		}
		double alturaMedia = alturaGeral/p.length;
		double porcentagem = menor16/p.length *100;
		
		System.out.printf("Altura media: %.2f", alturaMedia);
		System.out.println("Pessoas com menos de 16 anos: " + porcentagem);

		sc.close();
		
	}

}
