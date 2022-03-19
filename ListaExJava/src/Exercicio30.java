import java.util.Scanner;

public class Exercicio30 {

	public void run() {
		
		System.out.println("\n Escreva um programa que calcule o valor de y = f(x) = a*x + b \n"
				+ "		 em um intervalo de valores de x, sendo dados pelo usuário \n"
				+ "		 os coeficientes a e b, \n"
				+ "		 bem como os valores do limite inferior e superior do intervalo de x \n"
				+ "		 bem como o valor do incremento de x. \n"
				+ "		 O programa deve exibir resultados como um tabela onde constam os valores de x e y=f(x) lado a lado. \n");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor para a: ");
		int a = input.nextInt() ;
		
		System.out.print("Digite um valor para b: ");
		int b = input.nextInt() ;
		
		System.out.print("Digite um valor minimo para x: ");
		int minX = input.nextInt() ;
		
		System.out.print("Digite um valor maximo para x: ");
		int maxX = input.nextInt() ;
		
		System.out.print("Digite um valor para o incremento de x: ");
		int incX = input.nextInt();
		
		for ( int x = minX; x <= maxX; x += incX ) {
			System.out.println( " y = f(x) = a*x + b = "+ a + "*" + x + " + " + b + " = " + (a*x+b));
		}
		
	}

}
