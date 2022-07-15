import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Digite: ");
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Voce digitou: "+ x + " " + y + " " + z );
		
		z = 25;
		double a = Math.sqrt(z);
		
		System.out.println("\n" + a);		
		
		
		
		
		
		
		
		sc.close();
		
			
			
					
			
	}

}
