package romanos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada=new Scanner(System.in);

		//String letter=entrada.nextLine();
		System.out.println(convertRomantoInt('I')); 
		System.out.println(convertRomantoInt('V')); 
		System.out.println(convertRomantoInt('X')); 
		System.out.println(convertRomantoInt('L')); 
		System.out.println(convertRomantoInt('C')); 
		System.out.println(convertRomantoInt('K')); 
		System.out.println(result("XX"));
		System.out.println(result("XVI"));
		System.out.println(result("CXLIX"));

	}
	
	public static int convertRomantoInt(char letter) {
		if (letter=='I')
			return 1;
		if (letter=='V')
			return 5;
		if (letter=='X')
			return 10;
		if (letter=='L')
			return 50;
		if (letter=='C')
			return 100;

		return 0;
	}

	public static int result(String letter){
		int c=0;
		for(int i=0;i<letter.length();i++){
			int atual=convertRomantoInt(letter.charAt(i));
			int proximo=Integer.MIN_VALUE;
			if(!(i==letter.length()-1))
				proximo=convertRomantoInt(letter.charAt(i+1)); 
			if (atual>=proximo)
				c+=atual;
			else
				c-=atual;
		}
		
		return c;
	}
}
