/*
 Escreva um programa que leia dois valores, os quais denominaremos A e B, fornecidos pelo usuário, exibindo respostas
F ou V para as seguintes questões:
(a) A é maior que zero?
(b) B é maior que zero;
(c) A E B são maiores do que zero?
Use operadores lógicos para formular as expressões necessárias a avaliação dos valores. 
 
 */

import java.util.Scanner;

public class Exercicio06 {	
	
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor para A: ");
		float a = input.nextFloat();
		System.out.print("Digite um valor para B: ");
		float b = input.nextFloat();
		
		System.out.println(" [A] é maior que zero? " + ((a >0) ? "verdadeiro" : "falso"));
		System.out.println(" [B] e maior que zero?"  + ((b >0) ? "verdadeiro" : "falso"));
		System.out.println(" [A] E [B] sao maiores do que zero?" + (((a >0)&&(b >0)) ? "verdadeiro" : "falso"));
		
	}
}
