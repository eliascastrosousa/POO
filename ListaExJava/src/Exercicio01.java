/*1. Escreva um programa que leia um n�mero inteiro fornecido pelo usu�rio, armazenando-o numa vari�vel apropriada.
Imprima o valor lido. */

import java.util.Scanner;

public class Exercicio01 {
		public void run() {
		
		System.out.println("\nEscreva um programa que leia um n�mero inteiro fornecido pelo usu�rio, armazenando-o numa vari�vel apropriada.\n ");
		Scanner input = new Scanner(System.in);		
		System.out.print("Digite um numero: ");
		int num = input.nextInt();
		System.out.println("Valor digitado : "+ num);
		
	}

}
