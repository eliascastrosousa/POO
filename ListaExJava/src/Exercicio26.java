
import java.util.Scanner;

public class Exercicio26 {

	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor para A: ");
		float a = input.nextFloat();
		System.out.print("Digite um valor para B: ");
		float b = input.nextFloat();
		
		if (a >0) {
			System.out.println(" (a) A é maior que zero?  verdadeiro");
		}else{
			System.out.println(" (a) A é maior que zero?  falso");
		}
		
		if (b >0) {
			System.out.println(" (b) B é maior que zero?  verdadeiro");
		}else{
			System.out.println(" (b) B é maior que zero?  falso");
		}
		
		if ( (a >0) && (b > 0)) {
			System.out.println(" (c) A E B são maiores do que zero?  verdadeiro");
		}else{
			System.out.println(" (c) A E B são maiores do que zero?  falso");
		}
	}
	
	
}
