
/*
4. Leia um n�mero qualquer fornecido pelo usu�rio. Determine se o n�mero � maior do que 100, imprimindo uma
mensagem indicando que o "valor � maior que 100" ou uma mensagem indicando que o "valor � menor ou igual a 100". 
 */

import java.util.Scanner;

public class Exercicio04 {
		public void run() {
		System.out.println("\n Leia um n�mero qualquer fornecido pelo usu�rio. Determine se o n�mero � maior do que 100, imprimindo uma\n"
		+ "mensagem indicando que o \"valor � maior que 100\" ou uma mensagem indicando que o \"valor � menor ou igual a 100\".  \n ");
			
		Scanner input = new Scanner(System.in);		
		System.out.println("Digite um numero: ");
		int num = input.nextInt();
		if(num > 100) {
			System.out.println("O valor digitado "+ num + " � igual a 100!");
		}else {
			System.out.println("O valor digitado "+ num + " � menor ou igual a 100!");
		}
	}

}
