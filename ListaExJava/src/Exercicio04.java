
/*
3. Leia um n�mero qualquer fornecido pelo usu�rio. Determine se o n�mero � maior do que 50, imprimindo uma mensagem
indicando tal fato. 
 */

import java.util.Scanner;

public class Exercicio04 {
		public void run() {
			
		Scanner input = new Scanner(System.in);		
		System.out.println("Digite um numero: ");
		int num = input.nextInt();
		if(num >= 50) {
			System.out.println("O Valor digitado : "+ num + " eh maior ou igual a 50!");
		}else {
			System.out.println("Valor digitado : "+ num + " eh menor que 50!");
		}
	}

}
