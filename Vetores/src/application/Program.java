package application;


import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de produtos: ");
		int n = sc.nextInt();
		
		Produto[] produto = new Produto[n];
		
		
		for (int i = 0; i < produto.length; i++) {
			sc.nextLine();
			
			System.out.println("Digite o nome: ");
			String name = sc.nextLine();
			
			System.out.println("Digite o preco: ");
			double price = sc.nextDouble();
			
			produto[i] = new Produto(name, price);
			
		}
	
		
		double sum = 0.0;
		for (int i = 0; i < produto.length; i++) {
			sum += produto[i].getPreco();
		}
		double media = sum/produto.length;
		
		System.out.println("PRODUTOS: ");
		for (int i = 0; i < produto.length; i++) {
			System.out.println("nome: " + produto[i].getNome());
			System.out.println("preco: "+ produto[i].getPreco());
			
		}
		System.out.printf("Media de valor: %.2f",media);
		
		sc.close();
	}

}
