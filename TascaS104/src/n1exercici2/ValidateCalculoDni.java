package n1exercici2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateCalculoDni {

	@Test
	void test() {
		CalculoDni test = new CalculoDni();		
		assertEquals('Y', test.calculLletraDni(47728341));
		assertEquals('J', test.calculLletraDni(34835767));//34835767J 
		assertEquals('B', test.calculLletraDni(48743957));//48743957B 
		assertEquals('J', test.calculLletraDni(33957834));//33957834J 
		assertEquals('R', test.calculLletraDni(77364986));//77364986R
		
		assertEquals('P', test.calculLletraDni(23047848)); //23047848P
		assertEquals('S', test.calculLletraDni(47102244));//47102244S
		assertEquals('N', test.calculLletraDni(39718459));// 39718459N
		assertEquals('Y', test.calculLletraDni(47728341)); // no tinc mes dnis
		assertEquals('Y', test.calculLletraDni(47728341));// es pot substituir aquest per altres
		
	}

	/*
	 * Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre
	 * el número com a paràmetre. Crea una classe jUnit que verifiqui el seu
	 * correcte funcionament, parametritzant-la perquè el test rebi un espectre de
	 * dades ampli i validi si el càlcul és correcte per a 10 números de DNI
	 * predefinits.
	 */
}
