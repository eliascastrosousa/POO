/*7. Escreva um programa que leia dois valores, os quais denominaremos A e B, fornecidos pelo usu�rio, \n exibindo respostas
F ou V para as seguintes quest�es:
\n(a) A � igual a zero?
\n(b) B � menor que zero; e
\n(c) A OU B s�o maiores do que zero?
\nUse operadores l�gicos para formular as express�es necess�rias a avalia��o dos valores. */


import java.util.Scanner;

public class Exercicio07 {
	
	public void run() {
		
		System.out.println("\n Escreva um programa que leia dois valores, os quais denominaremos A e B, fornecidos pelo usu�rio, "
				+ "\n exibindo respostas F ou V para as seguintes quest�es:"
				+ "\n(a) A � igual a zero?\n"
				+ "\n(b) B � menor que zero; e\n"
				+ "\n(c) A OU B s�o maiores do que zero?\n"
				+ "\nUse operadores l�gicos para formular as express�es necess�rias a avalia��o dos valores. \n ");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor para A: ");
		float a = input.nextFloat();
		System.out.print("Digite um valor para B: ");
		float b = input.nextFloat();
		
		System.out.println(" a) A é igual a zero? " + ((a == 0) ? "verdadeiro" : "falso"));
		System.out.println(" b) B é menor que zero?"  + ((b > 0) ? "verdadeiro" : "falso"));
		System.out.println(" c) A OU B são maiores do que zero?" + (((a >0)||(b >0)) ? "verdadeiro" : "falso"));
	}
}
