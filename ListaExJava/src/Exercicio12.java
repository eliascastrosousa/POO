/*12. Escreva um programa capaz de calcular o pre�o total a ser pago por uma compra de copos pl�sticos. O usu�rio deve
fornecer o n�mero de copos a serem comprados e o programa deve calcular o pre�o total a ser cobrado, exibindo-o.
Observe que: se o n�mero de copo � inferior ou igual a 100, o pre�o por copo � R$0.05; se o n�mero de copos est� entre
101 e 500, o pre�o por copo � R$0.04; finalmente se o n�mero de copos � superior a 500 o pre�o por copo � R$0.035.*/

import java.util.Scanner;

public class Exercicio12 {
		public void run() {
			
		System.out.println("\n Escreva um programa capaz de calcular o pre�o total a ser pago por uma compra de copos pl�sticos."
				+ " O usu�rio deve fornecer o n�mero de copos a serem comprados e o programa deve calcular o pre�o total a ser cobrado, exibindo-o.\n"
				+ "Observe que: se o n�mero de copo � inferior ou igual a 100, o pre�o por copo � R$0.05; se o n�mero de copos est� entre\n"
				+ "101 e 500, o pre�o por copo � R$0.04; finalmente se o n�mero de copos � superior a 500 o pre�o por copo � R$0.035 \n");		
			
		Scanner input = new Scanner(System.in);		
		System.out.println("Qual o n�mero de copos a serem comprados ");
		int num = input.nextInt();
		
		if(num <= 100 ) {
			System.out.println("pre�o total a ser cobrado � de: "+ num*0.05);
		}if(num > 101 && num <500) {
			System.out.println("pre�o total a ser cobrado � de: "+ num*0.04 );
		}if(num > 500) {
			System.out.println("pre�o total a ser cobrado � de: "+ num*0.035 );
		}
	}

}
