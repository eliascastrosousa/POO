import java.util.Scanner;

public class Exercicio24 {
	public void run() {
		
		System.out.println("\n Implementar tr�s programas para exibir a tabuada de um n�mero inteiro entre 1 e 20 dado pelo usu�rio.\n"
				+ "a) Usando enquanto (while)\n"
				+ "b) Usando fa�a-enquanto (do-while)\n"
				+ "c) Usando para (for)\n"
				+ " Obs. Caso o valor dado seja inv�lido o programa deve apenas exibir uma mensagem de aviso. \n");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um numero inteiro entre 1 e 20: ");
		int num = input.nextInt();
		int a = 1;
		
		if((num < 20) && (num > 0) ) {
			System.out.println("");
			
			for(a = 1; a <=10; a++) {
				System.out.println(num+" X "+ a+": "+(num*a));
			}
			
			a=1;
			System.out.println("");
	
			while( a <= 10) {
				System.out.println(num+" X "+ a+": "+(num*a));
				a++;
			}
			
			a=1;
			System.out.println("");
	
			do {
				System.out.println(num+" X "+ a+": "+(num*a));
				a++;
			}while(a <= 10);
		}else {
			System.out.println("Opera��o n�o pode ser efetuada");
		}
	}
}
