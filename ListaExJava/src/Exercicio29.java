import java.util.Scanner;

public class Exercicio29 {

		public void run() {
			
			System.out.println("\n Fa�a um programa que exiba a tabela verdade da opera��o OU-L�gico para todas as combina��es de tr�s vari�veis\n"
					+ "l�gicas A, B e C. Os resultados da tabela devem ser exibidos como F ou V. \n");
			
			for ( int a = 0; a <= 1; a++ )
				for ( int b = 0; b <= 1; b++ )
					for ( int c = 0; c <= 1; c++ )
						System.out.println( (a==1) +"  ou "+ (b==1) +" ou "+ (c==1) +" = "+ ( a==1 || b==1 || c==1 ) );
		}
}


