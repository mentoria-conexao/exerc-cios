package romanos;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner leitura = new Scanner (System.in);
		
		String r1= leitura.next();
		String r2= leitura.next();
		
		System.out.println(new Romano(r1).somaRomanos(new Romano(r2)));
		
		
	
	}
}
