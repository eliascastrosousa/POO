
import java.util.Scanner;

public class MainListaEx {

	public static void main(String[] args) {
		int opcao =0;
		do {
				Scanner input = new Scanner(System.in);
				System.out.print("Qual exercício você deseja rodar 1...30 ou \n[0] Para Sair: ");
				opcao = input.nextInt();

				switch (opcao) {
					case 1: {
						Exercicio01 exercicio01 = new Exercicio01();
						exercicio01.run();
					} break;
					case 2: {
						Exercicio02 exercicio02 = new Exercicio02();
						exercicio02.run();
					} break;
					case 3: {
						Exercicio03 exercicio03 = new Exercicio03();
						exercicio03.run();
					} break;
					case 4: {
						Exercicio04 exercicio04 = new Exercicio04();
						exercicio04.run();
					} break;
					
						
				}		
			}while(opcao != 0);
	

	}
}
