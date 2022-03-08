/*27. Calcule a média de Notas de alunos. O programa deve parar de ler valores quando for fornecido um valor negativo como
nota. */

import java.util.Scanner;

public class Exercicio27 {
	
	public void run() {
		float a;
		Scanner input = new Scanner(System.in);
		do {
		System.out.print("Digite uma nota do aluno ou -1 para sair ");
		a = input.nextFloat();
		}while(a != -1);
		
		
	}
}
