/*9. Leia tr�s n�meros reais fornecidos pelo usu�rio. Descubra qual deles � o menor de todos, imprimindo seu valor. 
*/

import java.util.Scanner;

public class Exercicio09 {

		public void run() {
			
			System.out.println("\n  Leia tr�s n�meros reais fornecidos pelo usu�rio. Descubra qual deles � o menor de todos, imprimindo seu valor. \n ");
			Scanner input = new Scanner(System.in);
			System.out.print("Digite um valor para A: ");
			int a = input.nextInt();
			System.out.print("Digite um valor para B: ");
			int b = input.nextInt();
			System.out.print("Digite um valor para C: ");
			int c = input.nextInt();
			
			int menor = ((int) (Math.pow(2, 32)/2)-1 );
			
			menor = (((a<b) && (a<c)) ? a : menor );
			menor = (((b<a) && (b<c)) ? b : menor );
			menor = (((c<a) && (c<b)) ? c : menor );
			
			System.out.print( " O menor valor digitado foi " + menor );
		}

}
