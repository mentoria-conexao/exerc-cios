package romanos;


public class Main {

	public static void main(String[] args) {

		Romano romano1=new Romano("XX");
		Romano romano2=new Romano("XVI");
		Romano romano3=new Romano("CXLIX");
		
		System.out.println(romano1.getValor());
		System.out.println(romano2.getValor());
		System.out.println(romano3.getValor());
	}
}
