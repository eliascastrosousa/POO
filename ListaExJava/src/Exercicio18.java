import java.util.Scanner;

public class Exercicio18 {
	
	public void run() {
		System.out.println("\n Escreva um programa que leia um número inteiro entre 0 e 100 e o exiba por extenso, por exemplos: 16 -> \"dezesseis\",\n"
				+ "34 -> \"trinta e quatro\", etc..  \n");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor inteiro: ");
		long n = input.nextLong();
		System.out.println( extenso(n) );
	}
	
	private String extensoCDU(int n) { // 852
		String nExtenso = "";
		
		nExtenso += ((n==0)?"zero":"");
		
		int c = (int) (n/100);     // 852 / 100 = (int) 8.52 = 8
		int d = (int)((n%100)/10); // 852 % 100 = 52;  52 / 10 = (int)5.2 = 5
		int u = (int)((n%100)%10); // 852 % 100 = 52;  52 % 10 = (int)2.0 = 2
		
		switch (c) {
			case  1: { nExtenso +=  (((d==0)&&(u==0))?"cem":"cento"); 			} break;
			case  2: { nExtenso += "duzentos"; 		} break;
			case  3: { nExtenso += "trezentos"; 	} break;
			case  4: { nExtenso += "quatrocentos"; 	} break;
			case  5: { nExtenso += "quinhentos"; 	} break;
			case  6: { nExtenso += "seiscentos"; 	} break;
			case  7: { nExtenso += "setecentos"; 	} break;
			case  8: { nExtenso += "oitocentos"; 	} break;
			case  9: { nExtenso += "novecentos"; 	} break;
		}
		
		nExtenso += (((c!=0)&&((d!=0)||(u!=0)))?" e ":"");
		
		switch (d) {
			case  1: { 
				switch (u) {
					case  0: { nExtenso += "dez"; 		} break;
					case  1: { nExtenso += "onze"; 		} break;
					case  2: { nExtenso += "doze"; 		} break;
					case  3: { nExtenso += "treze"; 	} break;
					case  4: { nExtenso += "quatorze"; 	} break;
					case  5: { nExtenso += "quinze"; 	} break;
					case  6: { nExtenso += "dezesseis"; } break;
					case  7: { nExtenso += "dezessete"; } break;
					case  8: { nExtenso += "dezoito"; 	} break;
					case  9: { nExtenso += "dezenove"; 	} break;
				}	 		
			} break;
			case  2: { nExtenso += "vinte"; 		} break;
			case  3: { nExtenso += "trinta"; 	} break;
			case  4: { nExtenso += "quarenta"; 	} break;
			case  5: { nExtenso += "cinquenta"; } break;
			case  6: { nExtenso += "sessenta"; 	} break;
			case  7: { nExtenso += "setenta"; 	} break;
			case  8: { nExtenso += "oitenta"; 	} break;
			case  9: { nExtenso += "noventa"; 	} break;
		}
		
		if( d != 1) {
			
			nExtenso += (((d!=0)&&(u!=0))?" e ":"");
		
			switch (u) {
				case  1: { nExtenso += "um"; 	} break;
				case  2: { nExtenso += "dois"; 	} break;
				case  3: { nExtenso += "três"; 	} break;
				case  4: { nExtenso += "quatro";} break;
				case  5: { nExtenso += "cinco"; } break;
				case  6: { nExtenso += "seis"; 	} break;
				case  7: { nExtenso += "sete"; 	} break;
				case  8: { nExtenso += "oito"; 	} break;
				case  9: { nExtenso += "nove"; 	} break;
			}
		}	
		return (nExtenso);
	}
	
	public String extenso( long n ) {
		
		String nExtenso = "";
		
		int quin = (int)(n / Math.pow(10,18));
		nExtenso += ((quin == 1)? extensoCDU(quin)+" Quintilhão ": ((quin > 1)? extensoCDU(quin)+" Quintilhões ": ""));
		n = (long) ((quin != 0) ? ( n % Math.pow(10,18) ) : n );

		int quad = (int)(n / Math.pow(10,15));
		nExtenso += ((quad == 1)? extensoCDU(quad)+" Quadrilhão ": ((quad > 1)? extensoCDU(quad)+" Quadrilhões ": ""));
		n = (long) ((quad != 0) ? ( n % Math.pow(10,15) ) : n ); 
		
		int trilh = (int)(n / Math.pow(10,12));
		nExtenso += ((trilh == 1)? extensoCDU(trilh)+" Trilhão ": ((trilh > 1)? extensoCDU(trilh)+" Trilhões ": ""));
		n = (long) (( trilh != 0) ? ( n % Math.pow(10,12) ) : n );
		
		int bilh = (int)(n / Math.pow(10, 9)); 
		nExtenso += ((bilh == 1)? extensoCDU(bilh)+" Bilhão ": ((bilh > 1)? extensoCDU(bilh)+" Bilhões ": ""));
		n = (long) (( bilh != 0) ? ( n % Math.pow(10,9) ) : n );
		
		int milh = (int)(n / Math.pow(10, 6));
		nExtenso += ((milh == 1)? extensoCDU(milh)+" Milhão ": ((milh > 1)? extensoCDU(milh)+" Milhões ": ""));
		n = (long) (( milh != 0) ? ( n % Math.pow(10,6) ) : n );
		
		int mil  = (int)(n / Math.pow(10, 3)); 
		nExtenso += ((mil >= 1) ? extensoCDU(mil)+" Mil ": "");
		n = (long) (( mil != 0) ? ( n % Math.pow(10,3) ) : n );
		
		int cdu  = (int) n;
		nExtenso += extensoCDU( cdu );
		
		return ( nExtenso );
	}
	
	
}


