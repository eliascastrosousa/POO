/*Escreva um programa que leia 3 notas (valores reais), calculando e exibindo sua média aritmética. Imprima também
"Aprovado" se a média for maior que 7, "Reprovado" se for menor que 3 e "Exame" se estiver entre 3 e 7. 
*/

import java.util.Scanner;

public class Exercicio14 {
	public void run() {
		
		System.out.println("\n Escreva um programa que leia 3 notas (valores reais), calculando e exibindo sua média aritmética. Imprima também\n"
				+ "\n \"Aprovado\" se a média for maior que 7, "
				+ "\n \"Reprovado\" se for menor que 3 "
				+ "\n e \"Exame\" se estiver entre 3 e 7.  \n");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a 1a nota: ");
		float a = input.nextFloat();
		System.out.print("Digite a 2a nota: ");
		float b = input.nextFloat();
		System.out.print("Digite a 3a nota: ");
		float c = input.nextFloat();
		
		float media;
		media = (a + b + c) / 3; 
		
		if(media>7){
			System.out.println("Nota: "+ media);
			System.out.println("Aluno Aprovado!");
		}
		 else if(media>3 && media<7) {
			System.out.println("Nota: "+ media);
			System.out.println("Está de Exame!");
		}
		else if(media<3) {
			System.out.println("Nota: "+ media);
			System.out.println("Reprovado!");
		}
		
		
	}
}
