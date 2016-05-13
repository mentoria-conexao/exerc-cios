package romanos;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanoTeste {

	@Test
	public void test() {
		Romano romano1 = new Romano("XX");
		Romano romano2 = new Romano("XVI");
		Romano romano3 = new Romano("CXLIX");
		assertEquals(romano1.getValor(),20);
		assertEquals(romano2.getValor(),16);
		assertEquals(romano3.getValor(),149);
		assertEquals(romano1.somaRomanos(romano2),36);
	}

}
