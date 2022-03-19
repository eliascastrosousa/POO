/*7. Escreva um programa que leia dois valores, os quais denominaremos A e B, fornecidos pelo usuário, \n exibindo respostas
F ou V para as seguintes questões:
\n(a) A é igual a zero?
\n(b) B é menor que zero; e
\n(c) A OU B são maiores do que zero?
\nUse operadores lógicos para formular as expressões necessárias a avaliação dos valores. */


import java.util.Scanner;

public class Exercicio07 {
	
	public void run() {
		
		System.out.println("\n Escreva um programa que leia dois valores, os quais denominaremos A e B, fornecidos pelo usuário, "
				+ "\n exibindo respostas F ou V para as seguintes questões:"
				+ "\n(a) A é igual a zero?\n"
				+ "\n(b) B é menor que zero; e\n"
				+ "\n(c) A OU B são maiores do que zero?\n"
				+ "\nUse operadores lógicos para formular as expressões necessárias a avaliação dos valores. \n ");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor para A: ");
		float a = input.nextFloat();
		System.out.print("Digite um valor para B: ");
		float b = input.nextFloat();
		
		System.out.println(" a) A Ã© igual a zero? " + ((a == 0) ? "verdadeiro" : "falso"));
		System.out.println(" b) B Ã© menor que zero?"  + ((b > 0) ? "verdadeiro" : "falso"));
		System.out.println(" c) A OU B sÃ£o maiores do que zero?" + (((a >0)||(b >0)) ? "verdadeiro" : "falso"));
	}
}
