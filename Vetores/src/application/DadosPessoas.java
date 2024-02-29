package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class DadosPessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double altura;
		char genero;
		double somaDasAlturasDasMulheres = 0 ;
		double mediaDasAlturasDasMulheres = 0 ;
		int qtdMulheres = 0;
		int qtdHomens =0;
		
		System.out.println("Digite a quantidade de Pessoas: ");
		int n = sc.nextInt();	
		Pessoa[] pessoa = new Pessoa[n];

		for (int i = 0; i < pessoa.length; i++) {
			System.out.printf("Altura da %dº pessoa: ", i+1);
			altura = sc.nextDouble();
			System.out.printf("Genero da %dº pessoa: ", i+1);
			genero = sc.next().charAt(0);		
			pessoa[i] = new Pessoa(genero, altura);

		}
		double menorAltura = pessoa[0].getAltura();;
		double maisAlto = 0;
		
		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getAltura() > maisAlto) {
				maisAlto = pessoa[i].getAltura();

			}
			if (pessoa[i].getAltura() < menorAltura) {
				menorAltura = pessoa[i].getAltura();
			}
			if (pessoa[i].getGenero() == 'F') {
				somaDasAlturasDasMulheres += pessoa[i].getAltura();
				qtdMulheres ++;
			}else {
				qtdHomens++;
			}
		}
		
		mediaDasAlturasDasMulheres = somaDasAlturasDasMulheres/qtdMulheres;
		System.out.printf("Menor altura: %.2f", menorAltura);
		System.out.printf("\nMaior altura: %.2f", maisAlto);
		System.out.printf("\nMedia das alturas das mulheres: %.2f", mediaDasAlturasDasMulheres);
		System.out.printf("\nNumero de homens: %d ", qtdHomens);
		
		
	}

}
