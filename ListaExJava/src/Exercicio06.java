/*
 Escreva um programa que leia dois valores, os quais denominaremos A e B, fornecidos pelo usu�rio, \n exibindo respostas
F ou V para as seguintes quest�es:
\n (a) A � maior que zero?
\n (b) B � maior que zero;
\n (c) A E B s�o maiores do que zero?
\n Use operadores l�gicos para formular as express�es necess�rias a avalia��o dos valores. 
 
 */

import java.util.Scanner;

public class Exercicio06 {	
	
	public void run() {
		
		System.out.println("\n Escreva um programa que leia dois valores, os quais denominaremos A e B, fornecidos pelo usu�rio, "
				+ "\n exibindo respostas F ou V para as seguintes quest�es:"
				+ "\n (a) A � maior que zero?\n"
				+ "\n (b) B � maior que zero;\n"
				+ "\n (c) A E B s�o maiores do que zero?\n"
				+ "\n Use operadores l�gicos para formular as express�es necess�rias a avalia��o dos valores.  \n ");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor para A: ");
		float a = input.nextFloat();
		System.out.print("Digite um valor para B: ");
		float b = input.nextFloat();
		
		System.out.println(" [A] � maior que zero? " + ((a >0) ? "verdadeiro" : "falso"));
		System.out.println(" [B] e maior que zero?"  + ((b >0) ? "verdadeiro" : "falso"));
		System.out.println(" [A] E [B] sao maiores do que zero?" + (((a >0)&&(b >0)) ? "verdadeiro" : "falso"));
		
	}
}
