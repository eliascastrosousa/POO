/*
 5. Dado um n�mero inteiro qualquer, fornecido pelo usu�rio, descobrir se o mesmo � par ou �mpar. 
 */

import java.util.Scanner;

public class Exercicio05 {
		public void run() {
		
		System.out.println("\n Dado um n�mero inteiro qualquer, fornecido pelo usu�rio, descobrir se o mesmo � par ou �mpar.  \n ");
		Scanner input = new Scanner(System.in);		
		System.out.println("Digite um numero: ");
		int num = input.nextInt();
		if((num % 2 )==0) {
			System.out.println("O valor digitado "+ num + " � par");
		}else {
			System.out.println("O valor digitado "+ num + " � impar");
		}
	}

}
