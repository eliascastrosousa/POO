import java.util.Scanner;

/* 20. Escreva um programa que leia um valor real correspondente a uma medida em metros, convertendo o valor dado em pés
(1 metro = 3.315 pés), exibindo os valores dado e convertido. Caso o usuário forneça um valor negativo, deve ser exibida
uma mensagem e a operação de conversão não deve ser efetuada.  */

public class Exercicio20 {
		public void run() {
			
			System.out.println("\n Escreva um programa que leia um valor real correspondente a uma medida em metros, "
					+ "convertendo o valor dado em pés, exibindo os valores dado e convertido. "
					+ "Caso o usuário forneça um valor negativo, deve ser exibida uma mensagem e a operação de conversão não deve ser efetuada. \n");
			
			Scanner input = new Scanner(System.in);
			System.out.print("Digite o valor: ");
			float a = input.nextFloat();
			
			float pes = a /3315;
			
			if(a < 0) {
				System.out.print("a operação de conversão não pode ser efetuada. ");
			}else {
				System.out.println("O valor em Pés é de "+ pes);
			}
			
		}
		
	}
	
	

