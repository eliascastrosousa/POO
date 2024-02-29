package application;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] numero = new double[n];
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digite um numero: ");
			numero[i] = sc.nextDouble();
		}
		double sum = 0;
		
		System.out.print("valores: ");
		for (int i = 0; i < numero.length; i++) {
			System.out.print(numero[i]+ " ");
			sum += numero[i];
		}
		
		System.out.printf("\nSoma: %.2f",sum );
		System.out.printf("\nMedia: %.2f",sum/numero.length );
		
		sc.close();
		
		
		
	}

}
