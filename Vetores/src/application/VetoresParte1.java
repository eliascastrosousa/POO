package application;

import java.util.Locale;
import java.util.Scanner;

public class VetoresParte1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);
				
				int n = sc.nextInt();
				
				double[] vect = new double[n];
				
				for (int i = 0; i < n; i++) {
					vect[i] = sc.nextInt();
				}
				
				for (int i = 0; i < n; i++) {
					System.out.println("Vetor: " + i + ": " + vect[i]);
				}
				
				
				sc.close();
	}

}
