/*25. Faça um programa que calcule a soma de N números quaisquer fornecidos pelo usuário. 
*/

import java.util.Scanner;

public class Exercicio25 {
	public void run() {
		int soma =0;
		int valor;

		System.out.println("\n Faça um programa que calcule a soma de N números quaisquer fornecidos pelo usuário.  \n");
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor inteiro : ");
		valor = input.nextInt();
		soma = soma+valor;
		
	}
}
