/*12. Escreva um programa capaz de calcular o preço total a ser pago por uma compra de copos plásticos. O usuário deve
fornecer o número de copos a serem comprados e o programa deve calcular o preço total a ser cobrado, exibindo-o.
Observe que: se o número de copo é inferior ou igual a 100, o preço por copo é R$0.05; se o número de copos está entre
101 e 500, o preço por copo é R$0.04; finalmente se o número de copos é superior a 500 o preço por copo é R$0.035.*/

import java.util.Scanner;

public class Exercicio12 {
		public void run() {
			
		System.out.println("\n Escreva um programa capaz de calcular o preço total a ser pago por uma compra de copos plásticos."
				+ " O usuário deve fornecer o número de copos a serem comprados e o programa deve calcular o preço total a ser cobrado, exibindo-o.\n"
				+ "Observe que: se o número de copo é inferior ou igual a 100, o preço por copo é R$0.05; se o número de copos está entre\n"
				+ "101 e 500, o preço por copo é R$0.04; finalmente se o número de copos é superior a 500 o preço por copo é R$0.035 \n");		
			
		Scanner input = new Scanner(System.in);		
		System.out.println("Qual o número de copos a serem comprados ");
		int num = input.nextInt();
		
		if(num <= 100 ) {
			System.out.println("preço total a ser cobrado é de: "+ num*0.05);
		}if(num > 101 && num <500) {
			System.out.println("preço total a ser cobrado é de: "+ num*0.04 );
		}if(num > 500) {
			System.out.println("preço total a ser cobrado é de: "+ num*0.035 );
		}
	}

}
