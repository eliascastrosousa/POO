/*11. Escreva um programa que leia dois n�meros inteiros A e B quaisquer indicando se A � m�ltiplo de B ou se B � m�ltiplo
de A.
*/
import java.util.Scanner;

public class Exercicio11 {
		public void run() {
			
		Scanner input = new Scanner(System.in);		
		System.out.println("Digite o numero A: ");
		int numA = input.nextInt();
		System.out.println("Digite o numero B: ");
		int numB = input.nextInt();
		
		if (numA%numB==0){
			System.out.println("O numero: "+ numA + " � multiplo de "+numB);
		}else {
			System.out.println("O numero: "+ numA + " n�o � multiplo de "+numB);
		}
		if (numB%numA==0){
			System.out.println("O numero: "+ numB + " � multiplo de "+numA);
		}else {
			System.out.println("O numero: "+ numB + " n�o � multiplo de "+numA);
		}
	}

}
