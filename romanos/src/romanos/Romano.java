package romanos;

import java.util.HashMap;

public class Romano {
	
	private static HashMap<Character,Integer> romanos= new HashMap<Character,Integer>(){{
		put('I',1);
		put('V',5);
		put('X',10);
		put('L',50);
		put('C',100);
	}};
	
	private int valor;
	
	public Romano(String letter){
		valor=result(letter);
	}

	public int getValor() {
		return valor;
	}

	private int convertRomantoInt(char letter) {
		return romanos.get(letter);
	}

	private int result(String letter){
		int c=0;
		for(int i=0; i<letter.length(); i++){
			int atual=convertRomantoInt(letter.charAt(i));
			int proximo= (i==letter.length()-1) ? Integer.MIN_VALUE: convertRomantoInt(letter.charAt(i+1));
			
			if (atual>=proximo) c+=atual;
			else c-=atual;
		}

		return c;
	}
}
