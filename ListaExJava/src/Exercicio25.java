/*25. Fa�a um programa que calcule a soma de N n�meros quaisquer fornecidos pelo usu�rio. 
*/

import java.util.Scanner;

public class Exercicio25 {
	public void run() {
		int soma =0;
		int valor;

		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor inteiro : ");
		valor = input.nextInt();
		soma = soma+valor;
		
	}
}
