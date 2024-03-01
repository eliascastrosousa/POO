package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Pensionato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		String email;
		int quarto;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos quartos serão locados? ");
		int n = sc.nextInt();
		
		Aluno[] locacao = new Aluno[10];
		
		
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o nome: ");
			nome = sc.next();
		
			System.out.println("Digite o email: ");
			email = sc.next();
			
			System.out.println("Digite o n. quarto: ");
			quarto = sc.nextInt();
			
			locacao[quarto] = new Aluno(nome, email);
		}
		
		System.out.println("Quartos reservados: ");
		for (int i = 0; i < locacao.length; i++) {
			if (locacao[i] != null) {
				System.out.println(i+ ": " + locacao[i]);
			}
			
		}
		
		sc.close();
	}

}
