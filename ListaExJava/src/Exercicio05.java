/*
 5. Dado um número inteiro qualquer, fornecido pelo usuário, descobrir se o mesmo é par ou ímpar. 
 */

import java.util.Scanner;

public class Exercicio05 {
		public void run() {
		
		System.out.println("\n Dado um número inteiro qualquer, fornecido pelo usuário, descobrir se o mesmo é par ou ímpar.  \n ");
		Scanner input = new Scanner(System.in);		
		System.out.println("Digite um numero: ");
		int num = input.nextInt();
		if((num % 2 )==0) {
			System.out.println("O valor digitado "+ num + " é par");
		}else {
			System.out.println("O valor digitado "+ num + " é impar");
		}
	}

}
