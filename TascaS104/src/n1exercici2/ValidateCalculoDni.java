package n1exercici2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ValidateCalculoDni {

	
	@ParameterizedTest
	@ValueSource(strings = {"47728341Y", "34835767J","48743957B","33957834J","77364986R","23047848P","47102244S","39718459N","68110016R","85626171T"})
	void test(String string) {
			
		
		char letra;		
		String numerosString;
		int numeros;
		
		letra=string.charAt(string.length()-1);		
		numerosString = string.substring(0,8);
		
		numeros=Integer.parseInt(numerosString);
		CalculoDni test = new CalculoDni();
		
		assertEquals(letra, test.calculLletraDni(numeros));
		
	}

	/*
	 * Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre
	 * el número com a paràmetre. Crea una classe jUnit que verifiqui el seu
	 * correcte funcionament, parametritzant-la perquè el test rebi un espectre de
	 * dades ampli i validi si el càlcul és correcte per a 10 números de DNI
	 * predefinits.
	 */
}
