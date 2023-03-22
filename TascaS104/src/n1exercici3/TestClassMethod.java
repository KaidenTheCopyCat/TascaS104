package n1exercici3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestClassMethod {

	@Test
	void test() {
		ClassMethod test = new ClassMethod();		
		Throwable exception = assertThrows(ArrayIndexOutOfBoundsException.class,
				()->{test.metodeAmbError();} );
	}
	
	/*
	 * Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException.
	 * Verifica el seu correcte funcionament amb un test jUnit.
	 */

}
