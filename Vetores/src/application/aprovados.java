package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class aprovados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double nota1;
		double nota2;
		
		System.out.println("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		Aluno[] aluno = new Aluno[n];
		
		for (int i = 0; i < aluno.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %d° aluno: ", i+1);
			nome = sc.next();
			nota1 = sc.nextDouble();
			nota2 = sc.nextDouble();
			aluno[i] = new Aluno(nome, nota1, nota2);
		}
		
		System.out.println("Alunos aprovados: ");
		
		double soma = 0;
		double media = 0;
		
		for (int i = 0; i < aluno.length; i++) {
			soma = aluno[i].getNota1() + aluno[i].getNota2();
			media = soma / 2;
			
			if (media >= 6) {
				
				System.out.println(aluno[i].getNome());
				System.out.println(media);
			}
		}

		sc.close();
	}

}
