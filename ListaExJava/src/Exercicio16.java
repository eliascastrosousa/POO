/*16. Preparar um programa para ler as medidas da base e da altura de um triângulo, calculando e imprimindo sua área,
sabendo que o cálculo da área é dado por:
area = (base*altura)/2*/

import java.util.Scanner;

public class Exercicio16 {

	public void run() {
		
		System.out.println("\n Preparar um programa para ler as medidas da base e da altura de um triângulo, calculando e imprimindo sua área\n");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a base: ");
		float base = input.nextFloat();
		
		System.out.print("Digite a altura: ");
		float altura = input.nextFloat();
		
		float area = (base*altura)/2;
		
		System.out.print("Area do Triangulo igual a: "+area);

		
	}
	
}