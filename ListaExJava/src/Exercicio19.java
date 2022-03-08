/*19. Escreva um programa que leia um número real entre 0.00 e 100.00 e o exiba por extenso como se fosse uma quantia em
dinheiro, por exemplo: 1.00 -> "um real", .12.73 -> "doze reais e setenta e três centavos".  */

import java.util.Scanner;

public class Exercicio19 {	
	
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
