
/*1. Escreva um programa que leia um n�mero real fornecido pelo usu�rio, armazenando-o numa vari�vel apropriada.
Imprima o valor lido. */

import java.util.Scanner;

public class Exercicio02 {
		public void run() {
		
		System.out.println("\n Escreva um programa que leia um n�mero real fornecido pelo usu�rio, armazenando-o numa vari�vel apropriada. \n ");
		Scanner input = new Scanner(System.in);		
		System.out.println("Digite um numero: ");
		float num = input.nextInt();
		System.out.println("Valor digitado : "+ num);
		
	}

}
