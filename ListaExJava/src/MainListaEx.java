
import java.util.Scanner;

public class MainListaEx {

	public static void main(String[] args) {
		int opcao =0;
		do {
				Scanner input = new Scanner(System.in);
				System.out.print("\nQual exercício você deseja rodar 1...30 ou \n[0] Para Sair: ");
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
					case 5: {
						Exercicio05 exercicio05 = new Exercicio05();
						exercicio05.run();
					} break;
					case 6: {
						Exercicio06 exercicio06 = new Exercicio06();
						exercicio06.run();
					} break;
					case 7 :{
						Exercicio07 exercicio07 = new Exercicio07();
						exercicio07.run();
					}break;
					case  8:{
						Exercicio08 exercicio08 = new Exercicio08();
						exercicio08.run();
					}break;
					case 9 :{
						Exercicio09 exercicio09 = new Exercicio09();
						exercicio09.run();
					}break;			
					case 10 :{
						Exercicio10 exercicio10 = new Exercicio10();
						exercicio10.run();
					}break;
					case 11 :{
						Exercicio11 exercicio11 = new Exercicio11();
						exercicio11.run();
					}break;
						
				}		
			}while(opcao != 0);
	

	}
}
