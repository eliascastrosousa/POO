package application;

import java.util.Locale;
import java.util.Scanner;


public class Negativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de elementos: ");
		int n = sc.nextInt();
		
		if (n>10) {
			do {
				System.out.println("Quantidade invalida, maximo de 10 elementos.");
				System.out.println("Digite a quantidade de elementos: ");
				n = sc.nextInt();
			} while (n>10);
		}
		sc.nextLine();

		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] <0) {
				System.out.println(vect[i]);
			}
		}		
		
		sc.close();
	}

}
