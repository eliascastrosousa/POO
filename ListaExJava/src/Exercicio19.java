import java.util.Scanner;

public class Exercicio19 {

	public void run() {

		System.out.println("\n Escreva um programa que leia um n�mero real entre 0.00 e 100.00 e o exiba por extenso como se fosse uma quantia em\n"
				+ "dinheiro, por exemplo: 1.00 -> \"um real\", .12.73 -> \"doze reais e setenta e tr�s centavos\".  \n");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		double n = input.nextDouble();
		System.out.println( extensoMoney(n) );
	}
	
	private String extensoMoney(double n) {  // 15892.54
		String nExtenso = "";
		int   inteiro   = (int) n ;   // (int)15892.54 = // 15892
		float pog = (float) 0.000002; // corre��o de subtrair um int de um float
		
		int   decimal   = (int)(((n - inteiro)+pog) * 100) ; // 15892.54 - 15892 = 0.54 * 100 = 54 
		
		Exercicio18 exercicio18 = new Exercicio18();
		
		nExtenso += exercicio18.extenso(inteiro);
		nExtenso += ((inteiro==1)?" real ":((inteiro>1)?" reais ":""));
		
		nExtenso += ((inteiro!=0)&&(decimal!=0))?" e ": "";
		
		nExtenso += exercicio18.extenso(decimal);
		nExtenso += ((decimal==1)?" centavo ":((inteiro>1)?" centavos ":""));
		
		return(nExtenso);
	}
	
}
