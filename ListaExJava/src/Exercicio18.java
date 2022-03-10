/*18. Escreva um programa que leia um número inteiro entre 0 e 100 e o exiba por extenso, por exemplos: 16 -> "dezesseis",
34 -> "trinta e quatro", etc.. */

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;


public class Exercicio18 {
	
	int aux, aux2;
	
	 String Numeros[] = {"Zero", "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez",  
	          				"Onze", "Doze", "Treze", "Quatorze", "Quinze", "Desesseis", "Desessete", "Dezoito", "Desenove"};
	 
	 String Dezenas[]= {"Dez","Vinte", "Trinta", "Quarenta", "Cinquenta", "Sessenta", "Setenta", "Oitenta", "Noventa"};
	 
	 String Centenas[] =  {"Cem" } ;
	          

	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro entre 0 e 100: ");
		int a = input.nextInt();
		
		
		for(int c = 0; c <= a; c++) {
			aux = c;        
		}
		
		if(a > 20 && a < 100) {
					      
	        String number = String.valueOf(a);

	        char[] digits1 = number.toCharArray();

	        for(int i = 0; i < digits1.length; i++) {
	            
	        	System.out.println(digits1[i]);
	        	
	            System.out.println(Dezenas[i]);	
	            
	            
	        }
		}
		
			//System.out.println(Numeros[aux]);
		
		
	}

}
