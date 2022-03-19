
/*1. Escreva um programa que leia um número real fornecido pelo usuário, armazenando-o numa variável apropriada.
Imprima o valor lido. */

import java.util.Scanner;

public class Exercicio02 {
		public void run() {
		
		System.out.println("\n Escreva um programa que leia um número real fornecido pelo usuário, armazenando-o numa variável apropriada. \n ");
		Scanner input = new Scanner(System.in);		
		System.out.println("Digite um numero: ");
		float num = input.nextInt();
		System.out.println("Valor digitado : "+ num);
		
	}

}
