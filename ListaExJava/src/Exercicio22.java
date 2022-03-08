/*22. Considerando um objeto móvel em movimento uniformemente variado, escreva um programa que receba as seguintes
informações: um valor real indicando posição inicial do móvel P0, um valor real que corresponde a velocidade do móvel
V, um outro valor real A correspondente a aceleração do móvel e um número inteiro correspondente ao tempo decorrido
T. O programa deve calcular a posição final PF do móvel, dado pela relação abaixo:
PF = P0 + V * T + (A * T2
) / 2
*/

import java.util.Scanner;

public class Exercicio22 {

	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor real: ");
		float valor = input.nextFloat();
		System.out.println("O valor lido foi: " + valor);		
	}
	
}
